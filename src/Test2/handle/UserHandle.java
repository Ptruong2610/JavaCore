package Test2.handle;

import Test2.view.Menu;
import Test2.entity.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserHandle {
    public void addUser(Scanner scanner, ArrayList<User> users){
        System.out.print("Nhập username:");
        String userName = scanner.nextLine();
        System.out.print("Nhập password:");
        String password = scanner.nextLine();
        System.out.print("Nhập email:");
        String email = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Email đã tồn tại.Xin mời nhập lại");
            addUser(scanner,users);
        }else if (!checkRegexPassword(password)){
            System.out.println("Pass nhập sai cú pháp!Nhập lại");
            addUser(scanner,users);
        }else if (!checkRegexEmail(email)){
            System.out.println("Email nhập sai cú pháp!nhập lại");
            addUser(scanner,users);
        }
        else {
            User user =new User(userName,email,password);
            users.add(user);
        }
        convertObjectToJsonFile("student.json", users);
    }

    public void signInUser(Scanner scanner,ArrayList<User> users){
        Menu menu =new Menu();
        System.out.print("Nhập email:");
        String email = scanner.nextLine();
        System.out.print("Nhập password:");
        String password = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)&&users.get(i).getPassWord().equals(password) ) {
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("email hoặc mật khẩu không chính xác");
            signInUser(scanner, users);
        }
        for (int i = 0; i < users .size(); i++) {
            if (users.get(i).getEmail().equals(email)&&users.get(i).getPassWord().equals(password)){
                System.out.println("Chào mừng " + users.get(i).getUserName() + ",bạn có thể thực hiện các công việc sau:");
                menu.menuLogin(scanner, users, users.get(i).getUserName());
                break;
            }
        }
    }

    public boolean checkRegexPassword(String password){
        Pattern patternPassword = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()._–[{}]:;',?/*~$^+=<>]).{7,15}$");
        return patternPassword.matcher(password).matches();
    }

    public boolean checkRegexEmail(String email){
        Pattern patternEmail = Pattern.compile("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$");
        return patternEmail.matcher(email).matches();
    }

    public User checkByUserName(ArrayList<User> users,String userName){
        for (User user: users) {
            if(user.getUserName().equals(userName)) return user;
        }
        return null;
    }

    public User checkByEmail(ArrayList<User> users, String email){

        for (User user: users) {
            if(user.getEmail().equals(email)) return user;
        }
        return null;
    }

    public void editUserName(Scanner scanner,ArrayList<User>users,User user){
        System.out.print("Nhập username mới: ");
        String newUserName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(newUserName) ) {
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("username đã tồn tại, Nhập lại!");
            editUserName(scanner,users, user);
        }else if (user != null) {
            user.setUserName(newUserName);
            convertObjectToJsonFile("student.json", users);
            System.out.println("Đỏi username thành công!Vui Lòng đăng nhập lại để tiếp tục");
            signInUser(scanner,users);
        }


    }

    public void editEmail(Scanner scanner,ArrayList<User> users,User user){
        System.out.print("Nhập email mới: ");
        String newEmail = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(newEmail)){
                check = true;
                break;
            }
        }
        if (check&&user!=null){
            System.out.println("Email đã tồn tại, Nhập lại!");
            editEmail(scanner,users,user);
        }else if (!check &&user!=null&&!checkRegexEmail(newEmail)){
            System.out.println("Email sai cú pháp, Nhập lại!");
            editEmail(scanner,users,user);
        }else if (!check &&user!=null&&checkRegexEmail(newEmail)){
            user.setEmail(newEmail);
            convertObjectToJsonFile("student.json", users);
        }
    }

    public void editPassword(Scanner scanner,ArrayList<User> users,User user){
        System.out.print("Nhập password mới: ");
        String newPassword = scanner.nextLine();
        if (user!=null&&checkRegexPassword(newPassword)){
            user.setPassWord(newPassword);
            convertObjectToJsonFile("student.json", users);
            System.out.println("Đỏi password thành công!Vui Lòng đăng nhập lại để tiếp tục");
            signInUser(scanner,users);
        }else {
            System.out.println("Sai cú pháp,password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;), Nhập lại!");
            editPassword(scanner,users,user);
        }
    }


    public void searchEmailUpdatePassword(Scanner scanner,ArrayList<User> users){
        System.out.println("Mời bạn nhập vào Email");
        String email = scanner.nextLine();
        for (User user: users) {

            if (user != null && user.getEmail().equals(email)) {
                editPassword(scanner, users, user);
            } else {
                System.out.println("Tài khoản không tồn tại");
                searchEmailUpdatePassword(scanner, users);
            }
        }

    }
    //đọc file json
    public ArrayList<User> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            ArrayList<User> users =  new ArrayList<>(Arrays.asList(gson.fromJson(reader, User[].class)));
//            Arrays.asList(gson.fromJson(reader, User[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //ghi vào file gson
    public void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void displayUser(ArrayList<User> users){
        for (User user: users
        ) {
            System.out.println(user);

        }
    }


}
