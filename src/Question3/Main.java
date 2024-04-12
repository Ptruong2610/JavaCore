package Question3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("Số được sinh ra ngẫu nhiên là :" + number);
        if (isPrimeNumber(number)==true){
            System.out.println("Đây là số nguyên tố");

        }else System.out.println("Đây không phải là số nguyên tố");    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
