package ExecutableClasses;

public class FibonacciRecurs1
{
    public static void main(String[] args)
    {
        int desiredNumberCount = 12;
        int a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < desiredNumberCount; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}