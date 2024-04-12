package Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = createArrayFromInput();
        System.out.println("Thông tin mảng bạn vừa nhập là :");

        printArray(array);

        System.out.println("Các phần tử trên đường chéo chính :");
        printDiagonal(array);

        int[][] array2 = createArrayFromInput();
        int[][] sumArray = addArrays(array,array2);
        System.out.println("Thông tin của mảng sau khi cộng :");
        printArray(sumArray);


    }
    // tạo mảng 2 chiều và nhập số lượng phần tử
    public static int[][] createArrayFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập phần tử array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }
    // in mảng vừa nhập
    public static void printArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Liệt kê các phần tử nằm trên đường chéo chính
    public static void printDiagonal(int[][] array){
        int rows = array.length;
        int columns = array[0].length;
        for (int i = 0; i < rows && i <columns; i++) {
            System.out.println(array[i][i]+" ");
        }
        System.out.println();
    }
    //Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
    public static int[][] addArrays(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int columns = array1[0].length;
        int[][] resultArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return resultArray;
    }

}
