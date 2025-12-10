package ExecutableClasses;

public class Fibonacciforloop1
{
    public static void main(String[] args)
    {   //The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding numbers,
        //-starting with 0 and 1, resulting in the sequence 0, 1, 1, 2, 3, 5, 8, 13, and so on
        // Add count for the numbers to print
        int desiredNumberCount=10;

        //assigning values for the first 2 numbers.
        //Everytime you assign a value to a variable it is the next number in the sequence?
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        //TODO declare C without a value, this needs more exploration.
        // It gets its value from the for loop. Whoa and brain explodes.
        int c = -1;
        //TODO calculate the number of loops necessary to reach the desired number count?


        //Iterate with loop
        for (int i = 1; i<=desiredNumberCount -2; i++)
        {
            //TODO create if statement to govern which code is run in which loop. Bool?
            if (i == 1)
            {
                c = b + a;
                System.out.println(c);
            }
            //Bleeping second loop. Arrrrg.
            else if ((i == 2))
            {
                a = c + b;
                System.out.println(a);
            }
            //Wait...we need another
            else if (i==3)
            {
                b = a + c;
                System.out.println(b);
            }


        }



     //Need to work on better Pseudocode.
    }
}
