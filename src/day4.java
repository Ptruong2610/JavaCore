public class day4 {
    public static void main(String[] args) {
        int sum = Sum(1,2,3);
        System.out.println(sum);
    }
    public static int Sum(int a, int b, int c){
        int sum1 = Sum1(a,b);
        return (sum1+c);
    }
    public static int Sum1(int a, int b){
        return a+b;
    }
}
