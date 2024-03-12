class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }
}
public class Math {

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        int sum1 = mathOperations.add(5, 3);
        System.out.println("Sum of 5 and 3: " + sum1);

        double sum2 = mathOperations.add(1.5, 2.3, 3.1);
        System.out.println("Sum of 1.5, 2.3, and 3.1: " + sum2);

        String sum3 = mathOperations.add("Hello, ", "world!");
        System.out.println("Concatenation of \"Hello, \" and \"world!\" : " + sum3);
    }
}