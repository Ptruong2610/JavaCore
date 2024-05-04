package Test2;

import Test2.entity.User;
import Test2.handle.UserHandle;
import Test2.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<User> users = new ArrayList<>();
        UserHandle userHandle = new UserHandle();
        ArrayList<User> users = userHandle.getListObjectFromJsonFile("student.json");
//        String userName = "admin";
//        String password = "admin";
//        String email = "smaker26101998@gmail.com";
//        User user = new User(userName,email,password);
//        users.add(user);
//        String userName1 = "admin1";
//        String password1 = "admin1";
//        String email1 = "smaker15101998@gmail.com";
//        User user1 = new User(userName1,email1,password1);
//        users.add(user1);
        Menu menu = new Menu();
        menu.selectMenu(scanner, users);
    }
}
