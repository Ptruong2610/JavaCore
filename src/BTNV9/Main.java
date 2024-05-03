package BTNV9;

import BTNV9.entity.Product;
import BTNV9.handle.ProductHandle;
import BTNV9.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductHandle productHandle = new ProductHandle();
        int n;
        System.out.println("Mời bạn nhập vào số lượng trong danh sách sản phẩm:");
        n = Integer.parseInt(scanner.nextLine());
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            Product product = productHandle.inputProduct(scanner,i);
            products[i]=product;
        }
        Menu menu = new Menu();
        int option;
        do {
            menu.showMenu();
            option =Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println("DANH SÁCH SẢN PHẨM");
                    productHandle.getProduct(products);
                    break;
                case 2:
                    menu.menuSearchName(productHandle,products,scanner);
                    break;
                case 3:
                    Product product = menu.menuSearchID(scanner,productHandle,products);
                    System.out.println(product);
                    break;
                case 4:
                    productHandle.checkNumberLessThanN(products);
                default:
                    System.out.println("Nhập lại :");
            }
        }while (option!=4);
    }

}
