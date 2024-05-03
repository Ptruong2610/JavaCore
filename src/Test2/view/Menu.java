package Test2.view;

import Test2.entity.User;
import Test2.handle.UserHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private void showMenu(){
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("3. Quên mật khẩu");
    }

    private void showMenuLogin(){
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("5 - Thoát chương trình");
        System.out.print("Mời bạn chọn: ");
    }

    public void selectMenu(Scanner scanner, ArrayList<User> users){
        UserHandle userHandle = new UserHandle();
        showMenu();
        try {
            int option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    userHandle.signInUser(scanner,users);
                    break;
                case 2:
                    userHandle.addUser(scanner,users);
                    System.out.println("Tạo tài khoản tài khoản thành công");
                    selectMenu(scanner,users);
                    break;
                case 3:
//                    User userSearchEmail = userHandle.checkByUserName(users);
                    userHandle.searchEmailUpdatePassword(scanner,users);
                default:
                    System.out.println("Chọn lại!!!");
                    selectMenu(scanner,users);
                    break;
            }

        }catch (NumberFormatException  e){
            System.out.println("Bạn phải nhập vào số");
        }finally {
            selectMenu(scanner,users);
        }
    }

    public void menuLogin(Scanner scanner, ArrayList<User> users,String userName){
        UserHandle userHandle = new UserHandle();
        showMenuLogin();
        try {
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    User userEditUserName = userHandle.checkByUserName(users,userName);
                    userHandle.editUserName(scanner,users,userEditUserName);
                    break;
                case 2:
                    User userEditEmail= userHandle.checkByUserName(users,userName);
                    userHandle.editEmail(scanner,users,userEditEmail);
                    System.out.println("Đổi Email thành công!Mời bạn tiếp tục công việc");
                    menuLogin(scanner,users,userName);
                    break;
                case 3:
                    User userEditPassword = userHandle.checkByUserName(users,userName);
                    userHandle.editPassword(scanner,users,userEditPassword);
                    break;
                case 4:
                    selectMenu(scanner, users);
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Chọn lại!!!");
                    menuLogin(scanner,users,userName);
                    break;
            }
        }catch (NumberFormatException  e) {
            System.out.println("Lỗi!Bạn phải nhập vào số");
        }finally {
            menuLogin(scanner,users,userName);
        }
    }


}
