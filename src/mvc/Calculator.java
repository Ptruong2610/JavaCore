package mvc;

public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void printInfo(){
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
    public int addition(){
        return number1 + number2;
    }
    public int subtract(){
        return number1 - number2;
    }
    public int multi(){
        return number1 * number2;
    }
    public double division(){
        return (double) number1 / number2;
    }



    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
