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
        UserHandle userHandle = new UserHandle();
        ArrayList<User> users = userHandle.getListObjectFromJsonFile("student.json");
        Menu menu = new Menu();
        menu.selectMenu(scanner, users);
    }
}
