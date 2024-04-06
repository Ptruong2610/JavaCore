import java.util.Arrays;
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi ban nhap vao so phan tu cua mang : ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Moi ban nhap vao cac phan tu cua mang: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Phan tu thu"+(i+1)+" la : ");
//            arr[i] = scanner.nextInt();
//        }
//        //in ra
//        System.out.println("Mang vua nhap la :");
//        for (int i = 0; i<n; i++) {
//            System.out.println(arr[i] +"");
//        }
//        System.out.println();
//        //tinh tong
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum+=arr[i];
//
//        }
//        System.out.println("Tong cac gia tri trong mang la : "+ sum);
//        //tim gia tri nho nhat
//        int min = arr[0];
//        for (int i = 1; i < n; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Gia tri nho nhat cua mang la : "+min);
//        //tim gia tri lon nhat
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println("Gia tri lon nhat cua mang la : "+max);
//        // so phan tu chan trong mang
//        int demChan = 0;
//        int demLe = 0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]%2==0){
//                demChan++;
//            }else demLe++;
//        }
//        System.out.println("So cac phan tu chan trong mang la : "+demChan);
//        // so phan le trong mang
//        System.out.println("So cac phan tu le trong mang la : "+demLe);
//
//        countEvenAndOdd(arr);
        //5-1
        int[] arr = {4, 2, 5, 6, 2, 7};
        int[] result = calculateModulo(arr);
        System.out.println("Mảng kết  quả: ");
        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]+"\t");

        }
        System.out.println();
//        System.out.println("Mảng kết quả: " + Arrays.toString(result)); // cách viết khác

        //5-2
        String input = "a";
        String resultTwo = repeatString(input);
        System.out.println("Kết quả :"+resultTwo);
        //5-3
        String resultThree = repeatStringTwo(input);
        System.out.println("Kết quả :"+resultThree);
        //5-4
        int[] arrTwo = {1, 2, 3, 4, 5};
        int value1 = 5;
        int value2 = 6;

        boolean exists1 = checkElementExist(arrTwo, value1);
        boolean exists2 = checkElementExist(arrTwo, value2);

        System.out.println("Kết quả kiểm tra cho giá trị " + value1 + ": " + exists1);
        System.out.println("Kết quả kiểm tra cho giá trị " + value2 + ": " + exists2);
    }
    public static void countEvenAndOdd(int arr[]){
        int countOdd = 0;
        int countEvent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                countEvent++;
            }else countOdd++;
        }
        System.out.println("So cac phan tu chan trong mang la : "+countEvent);

        System.out.println("So cac phan tu le trong mang la : "+countOdd);


    }
//bai thuc hanh 5
    public static int[] calculateModulo(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i]%2;
        }
        return result;
    }

    // bai-5-2
    public static String repeatString(String input){
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = input;
        }

        return String.join("", arr);
    }
    //5-3
    public static String repeatStringTwo(String input){
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = input;
        }

        return String.join("-", arr);
    }
    //5-4
    public static boolean checkElementExist(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value){
                return true;
            }
        }
        return false;
    }
}

