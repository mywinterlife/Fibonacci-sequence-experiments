package ExecutableClasses;

public class FibonacciFunctions1
{
    public static void main(String[] args)
    {   //The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding numbers,
        //-starting with 0 and 1, resulting in the sequence 0, 1, 1, 2, 3, 5, 8, 13, and so on
        // Add count for the numbers to print
        int desiredNumberCount=12;

        //assigning values for the first 2 numbers.
        //Everytime you assign a value to a variable it is the next number in the sequence?
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);

        //Add them together
        int  c = a + b;
        System.out.println(c);

        //TODO Calculate and print the fourth number assigning it to A as the new value of A.
        a = c + b;
        System.out.println(a);

        //TODO Calculate and print the fifth number assigning it to "b".
        b = a + c;
        System.out.println(b);

        //TODO Calculate and print the sixth number assigning it to "c".
        c = a + b;
        System.out.println(c);

        //TODO Calculate and print the seventh number assigning it to "a".
        a = c + b;
        System.out.println(a);

        //TODO Calculate and print the eighth number assigning it to "b".
        b = a + c;
        System.out.println(b);

        //TODO Calculate and print the ninth number assigning it to "c".
        c = a + b;
        System.out.println(c);







        //TODO


     //Need to work on better Pseudocode.
    }
}
