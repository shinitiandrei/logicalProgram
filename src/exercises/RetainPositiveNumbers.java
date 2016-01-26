package exercises;

import java.util.Arrays;

/**
 * Created by Andrei on 25/01/2016.
 */
public class RetainPositiveNumbers {

    public static void main(String[] args) {

        int[] c = {-1, -2, -3};

        int [] d = retainPositiveNumbers(c);

        for (int n : d)
        System.out.println(n);

    }

    public static int[] retainPositiveNumbers(int[] a) {

        Arrays.sort(a);

        int positiveNumber;

        for (int i = 0; i < a.length; i++){
            positiveNumber = Math.abs(a[i]);
            a[i] = positiveNumber;
        }

        return a;
        /*
          Please implement this method to
          return a new array with only positive numbers from the given array.
          The elements in the resulting array shall be sorted in the ascending order.
         */
    }
}
