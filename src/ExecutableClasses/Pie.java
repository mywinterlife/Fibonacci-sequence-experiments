package ExecutableClasses;

public class Pie
{
    int a;
    int b;

    public static void main(String[] args)
    {
        System.out.print("0");
        double pi = pi();
        System.out.println(pi+" this is the variable.");
        System.out.println(pi()+ " this is the return of the method pi().");
    }

    public static double pi()
    {
        return 3.14;
    }
}