package ExecutableClasses;

public class SubtractionExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result1 = num1 - num2;
        System.out.println("Result of subtraction: " + result1);

        double d1 = 15.5;
        double d2 = 7.2;
        double doubleResult = d1 - d2;
        System.out.println("Result of double subtraction: " + doubleResult);

        int result2 = subtract(2, 1);
        System.out.println("Result: " + result2);
    }

    public static int subtract(int a, int b)
    {
        return a - b;
    }
}