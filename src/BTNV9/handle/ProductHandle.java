package BTNV9.handle;

import BTNV9.entity.Product;

import java.util.Scanner;

public class ProductHandle {
    public Product inputProduct(Scanner scanner, int i){
        System.out.println("Nhập thông tin sản phẩm thứ :" +(i+1));
        System.out.println("Mời bạn nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập mô tả sản phẩm: ");
        String description =scanner.nextLine();
        System.out.println("Mời bạn nhập số lượng sản phẩm :");
        int quanity = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập giá bán của sản phẩm :");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(name,description,quanity,price);
    }

    public void getProduct(Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
    public void checkNameProduct(Product[] products, String name){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equalsIgnoreCase(name)){
                System.out.println(""+products[i]);

            }
        }
    }
    public Product checkIDProduct(Product[] products,int id){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId()==id){
                return products[i];

            }
        }
        return null;
    }
    public void checkNumberLessThanN(Product[] products){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getQuanity()<5){
                System.out.println(""+products[i]);
            }
        }
    }
}
