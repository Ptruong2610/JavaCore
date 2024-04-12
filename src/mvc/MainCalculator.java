package mvc;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Nhập giá trị cho number2: ");
        int number2 = scanner.nextInt();
        Calculator calculator = new Calculator(number1, number2);

        calculator.printInfo();

        int sum = calculator.addition();
        System.out.println("Tổng 2 số là :"+sum);
        int subtractResult = calculator.subtract();
        System.out.println("Subtraction result: " + subtractResult);

        int multiResult = calculator.multi();
        System.out.println("Multiplication result: " + multiResult);

        double divisionResult = calculator.division();
        System.out.println("Division result: " + divisionResult);
    }
}
