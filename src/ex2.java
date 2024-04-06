import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ex1
        System.out.println("Nhập chiều dài hình chữu nhật: ");
        double length = scanner.nextDouble();
        System.out.println("Nhập chiều rộng hình chữu nhật: ");
        double width = scanner.nextDouble();
        scanner.nextLine(); // chứa giá trị khi nhấn nút Enter
//        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Chu vi HCN là : " +chuVi(length,width));
        System.out.println("Dien tich HCN là : " +dienTich(length,width));



        //ex2
        System.out.println("Nhập họ và tên : ");
        String fullName = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String address = scanner.nextLine();
        printPersonalInfo(fullName,age,gender,address);

    }
    public static double chuVi(double length, double width){
        return (length+width)*2;
    }
     public static double dienTich(double length, double width){
        return (length*width);
     }
     public static void printPersonalInfo(String fullName, int age, String gender, String address){
        System.out.println("Xin chào các bạn, mình tên là "+ fullName+", năm nay mình "+ age +" tuổi, giới tính "+ gender+". Hiện tại mình đang sống và làm việc tại "+address);
      }

}
