package ExecutableClasses;

public class Fibonacciforloop4
{
    public static void main(String[] args)
    {   //The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding numbers,
        //-starting with 0 and 1, resulting in the sequence 0, 1, 1, 2, 3, 5, 8, 13, and so on
        //Declare the total number of elements we want in the array
        int desiredNumberCount=10;

        //Below is the creation and instantiation of an empty Array of ints named fibonacci
        int[] fibonacci = new int[desiredNumberCount];
        //created array to store values. It contains the desired number of int elements
        //[  i0,   i1,   i2,   i3,   i4,   i5,   i6,   i7,   i8,   i9]
        //[null, null, null, null, null, null, null, null, null, null]

        //assigning values for the first 2 numbers.
        int firstNumber = 0;
        int secondNumber = 1;


        //TODO set index 0 to first number
        //Now we are putting them in the array!!!
        fibonacci[0] = firstNumber;

        //[i0,   i1,   i2,   i3,   i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0, null, null, null, null, null, null, null, null, null]


        //TODO set index 1 to second number
        fibonacci[1] = secondNumber;

        //[i0, i1,   i2,   i3,   i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0,  1, null, null, null, null, null, null, null, null]


        for(int i=2; i<fibonacci.length;i++)
        //indexes 0 and 1 were set individually above, so we start with index 2
        {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            //sequence.add(i,sequence.get(i-1) + sequence.get(i-2));
        }

        //print each element in the array
        //get each element (not get/set method)
        //print it via another for loop. Research how this would be in a nested loop.
        for(int i = 0;i<fibonacci.length; i++)
        {
            System.out.println(fibonacci[i]);
            //[i] to refer the variable "i"
        }

    }
}
