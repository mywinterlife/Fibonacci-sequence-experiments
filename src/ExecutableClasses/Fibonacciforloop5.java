package ExecutableClasses;

public class Fibonacciforloop5
{
    public static void main(String[] args)
    {
        int desiredNumberCount = 20;
        int a = 0, b = 1;

        System.out.println("1. " + a);
        System.out.println("2. " + b);

        for (int i = 3; i <= desiredNumberCount; i++)
        {
            int c = a + b;
            System.out.println(i + ". " + c);
            a = b;
            b = c;
        }
    }
}