package ExecutableClasses;

public class FibonacciRecurs3
{
    public static void main(String[] args)
    {   //Add Desired number count. DesiredNumberCount = The total number of Fibonacci numbers we want to print.

        int desiredNumberCount = 20;
        //Can we add the sequence in the print method?
        //Add The starting index, indicating the first Fibonacci number in the sequence.
        //0 - The first Fibonacci number, 1 -  The second Fibonacci number.
        printFibonacci(desiredNumberCount, 0, 1);
        //index is JUST the counter! If we start it at 10 its just going to start the numbered list at 10.
        //Big shock here and easy to mess up. printFibonacci scope at this point is the main method body.

    }
        //Write a method that takes the REQUIRED parameters from the executable method
        //and uses them to call the same method with the extra index parameter
        static void printFibonacci(int maximum, int a, int b)
        {
            printFibonacci(1,maximum, a, b);
        }
        //TODO - Create a method (static, not tied to an instance/object)
        //TODO - Figure its parameters in the sequence before the maximum.
        static void printFibonacci(int index, int maximum, int a, int b)
        //Method signature ^ the body and if-else is going to need a lot of experimentation.
        //Important note: This makes them local variables/fields not Class properties. (scope restricted {})
        //Important note: We need printFibonacci able to start calling itself to move the sequence forward.
        //For this class we cant store values in array/list, or a for loop. Calling itself seems to be the only way to this.
        //Maybe there is another way. Must explore.
    {
        //Creat the Method body
        if (index > maximum) return;
        System.out.println(index + ". " + a);

        // Can we use printFibonacci +1? (move to the next in the sequence)
        //TODO - Figure out parameters for the print that continue till desirednumbercount is reached.
        printFibonacci(index + 1, maximum, b, a + b);
    }
}