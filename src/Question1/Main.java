package Question1;

public class Main {
    public static void main(String[] args) {
       printSquare(4);
        System.out.println();
       printTriangle(4);
    }
    // Câu 1
    public static void printSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Câu 2
    public static void printTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1; i>=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
