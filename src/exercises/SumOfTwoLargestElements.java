package exercises;

import java.util.Arrays;

/**
 * Created by Andrei on 25/01/2016.
 */
public class SumOfTwoLargestElements {

    public static void main(String[] args) {
        int [] numbers = {152,1000, 234, 823,10, 123, 29};

        sumOfTwoLargestElements(numbers);
    }

    public static int sumOfTwoLargestElements(int[] a) {

        Arrays.sort(a);
        int large1 = a.length - 1;
        int large2 = a.length - 2;
        int result = a[large1] + a[large2];

        return result;

        /*
          Please implement this method to
          return the sum of the two largest numbers in a given array.
         */
    }
}
