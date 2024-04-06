public class ex3 {
    public static void main(String[] args) {
        //bai 1
        String result = repeatString("a");
        System.out.println(result);
        //bai 2
        String resultTwo = repeatStringTwo("-a");
        System.out.println("a"+resultTwo);
        //bai 3
        String resultThree = repeatStringThree("a", 5);
        System.out.println(resultThree);
        //bai4
        int resultFour = sum();
        System.out.println(resultFour);
        //bai 5
        double radius = 5.0;
        double volume = calculateSphereVolume(radius);
        System.out.println("The tich cua hinh cau co ban kinh bang " + radius + " la: " + volume);
        //bai6
        printFizzBuzz();

    }
    public static String repeatString(String input){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(input);
        }
        return sb.toString();
    }
    public static String repeatStringTwo(String input){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            sb.append(input);
        }
        return sb.toString();
    }
    public static String repeatStringThree(String input, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(input);

            if (i < n - 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }

    public static int sum() {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
    public static double calculateSphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    public static void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
