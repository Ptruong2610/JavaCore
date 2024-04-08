import java.util.Arrays;
import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mảng trước khi thay đổi:");
        System.out.println(Arrays.toString(arr));

        changeEvenElements(arr);

        System.out.println("Mảng sau khi thay đổi:");
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeEvenElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
        }
    }
}
