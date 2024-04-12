package Question6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập địa chỉ email: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Địa chỉ email hợp lệ.");
        } else {
            System.out.println("Địa chỉ email không hợp lệ.");
        }


        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
    //kiểm tra tính hợp lệ email
    public static boolean isValidEmail(String email) {
        // Định dạng regex cho email
        String emailRegex = "^[a-zA-Z][\\\\w-]+@([\\\\w]+\\\\.[\\\\w]+|[\\\\w]+\\\\.[\\\\w]{2,}\\\\.[\\\\w]{2,})$";

        // Kiểm tra định dạng email
        return Pattern.matches(emailRegex, email);
    }
    // kiểm tra Số điện thoại có chứa từ 9 đến 11 chữ số
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Loại bỏ dấu cách và ký tự không phải số
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        // Kiểm tra số chữ số của số điện thoại
        return digitsOnly.length() >= 9 && digitsOnly.length() <= 11;
    }
}
