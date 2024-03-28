public class main {
    public static void main(String[] args) {
        // Gọi method printHello()
        printHello();

        // Gọi method printHelloTo() với tham số là một chuỗi bất kỳ
        String name = "John";
        printHelloTo(name);

        // Gọi method printHelloInQuotes() với tham số là một chuỗi bất kỳ
        String message = "OpenAI";
        printHelloInQuotes(message);

        // Gọi method calculateSum() với hai số a và b bất kỳ
        int a = 5;
        int b = 3;
        int sum = calculateSum(a, b);
        System.out.println("Tổng của " + a + " và " + b + " là: " + sum);

        // Gọi method calculateSquare() với một số bất kỳ
        int number = 4;
        int square = calculateSquare(number);
        System.out.println("Bình phương của " + number + " là: " + square);

        // Gọi method calculateCentury() với một năm bất kỳ
        int year = 2024;
        int century = calculateCentury(year);
        System.out.println("Thế kỷ của năm " + year + " là: " + century);

        // Gọi method calculateBMI() với cân nặng và chiều cao đã cho
        double weight = 65.5;
        double height = 1.75;
        double bmi = calculateBMI(weight, height);
        System.out.println("Chỉ số BMI của cân nặng " + weight + "kg và chiều cao " + height + "m là: " + bmi);
    }
    public static void printHello() {
        System.out.println("Xin chào các bạn.");
    }

    public static void printHelloTo(String name) {
        System.out.println("Xin chào " + name + ".");
    }

    public static void printHelloInQuotes(String name) {
        System.out.println("Xin chào \"" + name + "\".");
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static int calculateCentury(int year) {
        int century = year / 100;
        if (year % 100 != 0) {
            century++;
        }
        return century;
    }

    public static double calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }

}
