package ExecutableClasses;

import java.util.ArrayList;
import java.util.List;

public class FibonacciArraylist1
{
    public static void main(String[] args)
    {   //The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding numbers,
        //-starting with 0 and 1, resulting in the sequence 0, 1, 1, 2, 3, 5, 8, 13, and so on
        //Below is the creation and instantiation of as empty List of ints named sequence
        List<Integer> sequence = new ArrayList<Integer>();
        //[i0, i1, i2, i3, i4, i5,i6,i7,i8,i9]
        //[null, null, null, null, null, null, null, null, null,]
        //^after line 10 this is sequence^
        //List<integer> is the data type its not a primitive type so its data type is its class name.
        //When you call ArrayList<>() you call the constructor of the class named.
        //An important distinction is that you are calling ArrayList, so its the named class even though we are in another class
        //List (on the left) and ArrayList (on the right) are different (which is unusual)
        //This is because List is an interface and therefore cannot be used for the instantiation.
        //This appears to be the standard use of a List in Java. I don't know why. I need to research use case.
        //If List<Integer> sequence; was used instead, sequence would be null instead of an empty list

       sequence.add(0);
            //[i0, i1, i2, i3, i4, i5,i6,i7,i8,i9]
            //[0, null, null, null, null, null, null, null, null,]
       //sequence.add with a single argument puts that arguments value INTO THE FIRST NULL INDEX.
       //This makes more sense when that when your list is EMPTY the first null is index 0.
       sequence.add(1);
            //[i0, i1, i2, i3, i4, i5,i6,i7,i8,i9]
            //[0, 1, null, null, null, null, null, null, null,]
            //the concept of "set" is what we are doing not the method/class SET.
       sequence.add( sequence.get(0) + sequence.get(1));
       //Look at sequence and add additional/new value
       //ADD NEVER Replaces ANYTHING. Add will replace a null(empty). Not a thing!
       //The method SET will only replace a thing/value.
       //This is the reason we are using sequence.add, the requirements of set are not present with how we've set this up.
       sequence.add( sequence.get(1) + sequence.get(2));
            //[0, 1, 1, 2, null, null, null, null, null,]
       sequence.add( sequence.get(2) + sequence.get(3));
            //[0, 1, 1, 2, 3, null, null, null, null,]
       sequence.add( sequence.get(3) + sequence.get(4));
            //[0, 1, 1, 2, 3, 5, null, null, null,]
       sequence.add( sequence.get(4) + sequence.get(5));
            //[0, 1, 1, 2, 3, 5, 8, null, null,]
       int index = 0;


    System.out.println(sequence);

// n0 = 0
// n1 = 1
// n2 = n1 + n0
// n3 = n2 + n1
// n4 = n3 + n2
// n(i) = n(i-1) + n(i-2)




    }
}
