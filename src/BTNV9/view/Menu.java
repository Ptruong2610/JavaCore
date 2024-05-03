package BTNV9.view;

import BTNV9.entity.Product;
import BTNV9.handle.ProductHandle;

import java.util.Scanner;

public class Menu {
    public void showMenu(){
        System.out.println("Hãy chọn công việc bạn muốn làm:");
        System.out.println("1.Hiển thị danh sách sản phẩm");
        System.out.println("2.Tìm sản phẩm theo tên");
        System.out.println("3.Tìm sản phẩm theo ID");
        System.out.println("4.Tìm các sản phẩm có số lượng < 5");
        System.out.println("5.Tìm sản phẩm theo mức giá");
        System.out.println("6.sắp xếp các sản phẩm theo mức giá:");
        System.out.println("7.Thoát");
    }
    public void menuSearchName(ProductHandle productHandle, Product[] products, Scanner scanner){
        System.out.println("Mời bạn nhập tên sản phẩm muốn tìm:");
        String name = scanner.nextLine();
        productHandle.checkNameProduct(products,name);

    }
    public Product menuSearchID(Scanner scanner,ProductHandle productHandle,Product[] products){
        System.out.println("Mời bạn nhập id sản phẩm muốn tìm:");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = productHandle.checkIDProduct(products,id);
        return product;
    }
}
