package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        inPut(input);
        countAndPrint(input, 'o');
    }
    //cau 1 : Đếm số từ trong chuỗi
     public static void inPut(String input){
         String[] words = input.split("\\s+");
         int count = words.length;
         System.out.println("Số từ trong chuỗi: " + count);
     }
     //cau 2 : Đếm và in ra index của các ký tự o trong chuỗi
    public static void countAndPrint(String input, char c) {
        int count = 0;
        System.out.print("index của các ký tự '" + c + "': ");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTổng số ký tự '" + c + "': " + count);
    }

}
