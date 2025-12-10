package ExecutableClasses;

public class Fibonacci1
{
    public static void main(String[] args)
    {
        int count = 20;
        for (int i = 0; i < count; i++)
        {
            System.out.println((i + 1) + ". " + fibonacci(i));
        }
    }

    // Can I iterate the list?
    public static int fibonacci(int j)
    {
        if (j == 0) return 0;
        if (j == 1) return 1;
        int a = 0, b = 1;

        //Now figure out forloop
        for (int i = 2; i <= j; i++)
        {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
