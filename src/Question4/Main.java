package Question4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liệt kê 10 số nguyên tố đầu tiên:");
        listFirstTen(10);

        System.out.println("\nLiệt kê các số nguyên tố nhỏ hơn 10:");
        listLessThan(10);
    }
    //kiểm tra số nguyen tố
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
    //liêt kê 10 số nguyên tố đầu tiên
    public static void listFirstTen(int n){
        int count = 0;
        int number =2;
        while (count<n){
            if (isPrimeNumber(number)==true){
                System.out.println(number+" ");
                count++;
            }
            number++;
        }
    }
    // liệt kê các số nguyên tố nhỏ hơn 10
    public static void listLessThan(int n){
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)==true){
                System.out.println(i +" ");
            }
        }
    }
}
