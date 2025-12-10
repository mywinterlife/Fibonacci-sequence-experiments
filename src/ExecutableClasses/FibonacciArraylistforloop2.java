package ExecutableClasses;

import java.util.ArrayList;
import java.util.List;

public class FibonacciArraylistforloop2
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
        //An important distinction is that we are calling ArrayList, so its the named class even though we are in another class
        //List (on the left) and ArrayList (on the right) are different (which is unusual)
        //This is because List is an interface and therefore cannot be used for the instantiation.
        //This appears to be the standard use of a List in Java. I don't know why. I need to research use case.
        //If List<Integer> sequence; was used instead, sequence would be null instead of an empty list

        int desiredNumberCount=9;
        sequence.add(0,0);
        //[i0,   i1,   i2,   i3,   i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0, null, null, null, null, null, null, null, null, null]

        sequence.add(1,1);
        //[i0, i1,   i2,   i3,   i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0,  1, null, null, null, null, null, null, null, null]

//        int i=2;
//        if(i<desiredNumberCount) //is true, continue
        {
//        sequence.add(i,sequence.get(i-1) + sequence.get(i-2));
        }
        //[i0, i1, i2,  i3,    i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0,  1,  1, null, null, null, null, null, null, null]
//        i=3;
//        if(i<desiredNumberCount)  //is true, continue
//        sequence.add(i,sequence.get(i-1) + sequence.get(i-2));
        //[i0, i1, i2, i3,   i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0,  1,  1,  2, null, null, null, null, null, null]
//        i=4;
//        if(i<desiredNumberCount)  //is true, continue
//        sequence.add(i,sequence.get(i-1) + sequence.get(i-2));
        //[i0, i1, i2, i3, i4,   i5,   i6,   i7,   i8,   i9]
        //[ 0,  1,  1,  2,  3, null, null, null, null, null]
//          i=5;
//          if(i<desiredNumberCount)  //is false, stop

        for(int i=2; i<desiredNumberCount;i++)
        //indexes 0 and 1 were set individually above, so we start with index 2
        {
            sequence.add(i,sequence.get(i-1) + sequence.get(i-2));
        }

        System.out.println(sequence);

// n0 = 0
// n1 = 1
// n2 = n1 + n0
// n3 = n2 + n1
// n4 = n3 + n2
// n(i) = n(i-1) + n(i-2)




    }
}
