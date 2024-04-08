import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên của bạn :");
        String fullName = scanner.nextLine();

        String standardizedFullName = standardizedFullName(fullName);
        System.out.println("Chuỗi chuẩn hóa : "+standardizedFullName);
    }

    public static String standardizedFullName(String fullName){
        String[] nameParts = fullName.split(" "); // tách chuỗi thành các phần tử riêng biệt dựa trên dấu cách vào mảng nameParts
        StringBuilder standardizedFullName = new StringBuilder(); // Tạo một chuỗi StringBuilder rỗng
        //duyệt mảng qua từng phần tử đã được tách từ chuỗi bạn nhập vào
        for (String namePart:nameParts
             ) {
            if (!namePart.isEmpty()){
                String firstChar = namePart.substring(0, 1).toUpperCase(); // lấy phần chữ cái đầu để chuẩn hóa in hoa
                String restOfName = namePart.substring(1).toLowerCase(); // lấy phần chữ chữ cái đăng sau để chuẩn hóa chữ thường
                String standardizedNamePart = firstChar + restOfName; // lấy phần chữ cái đầu và phần chữ cái sau để tọa thành chuỗi chuẩn hóa
                standardizedFullName.append(standardizedNamePart).append(" "); // thêm các phần đã được chuẩn hóa vào chuỗi Stringbuilder rỗng được tạo ra từ trên,
                // đồng thời thêm hoảng trắng vào cuối chuỗi để ngăn cách giữa các phần tử đã được chuẩn hóa
            }
        }
        return standardizedFullName.toString().trim(); // trả về chuỗi đã chuẩn hóa sử dụng .trim() để loại bỏ khoảng trắng ở đầu và cuối chuỗi khong cần thiết
    }
}
