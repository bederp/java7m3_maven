package inner.publicinner;

import java.util.ArrayList;
import java.util.Iterator;

public class PublicInnerClassExample {

    // Create an array
    private final static int SIZE = 15;
    private ArrayList<Integer> arrayOfInts = new ArrayList<>();

    public PublicInnerClassExample() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts.add(i);
        }
    }

    private void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends Iterator<Integer> { }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    public class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= arrayOfInts.size() - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = arrayOfInts.get(nextIndex);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        PublicInnerClassExample ds = new PublicInnerClassExample();
        ds.printEven();
    }
}
