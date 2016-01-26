package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrei on 26/01/2016.
 */
public class GetReversalsToSort {

    public static void main(String[] args) {
        int [] reversal = {12, 13, 11, 14};

        List<Integer> listOfReversal = getReversalsToSort(reversal);

        for (Integer integer : listOfReversal) {
            System.out.println(integer);
        }
    }

    public static List<Integer> getReversalsToSort(int[] a) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        int temp = 0;

        if (a[1] > a[0]){
            temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }

        for (int i = 0; i < a.length; i++){
            list1.add(a[i]);
        }

        Arrays.sort(a, 0, 2);

        for (int i = 0; i < a.length; i++){
            list2.add(a[i]);
        }

        result.addAll(list1);
        result.addAll(list2);
        return result;


        /*
         You need to sort an array of integers by repeatedly reversing
         the order of the first several elements of it.

         For example, to sort [12,13,11,14], you need to  reverse the order of the first two (2)
         elements and get [13,12,11,14] and then reverse the order of the first three (3)
         elements and get [11,12,13,14]

         The method should return the shortest(!) possible list of integers corresponding to the required reversals.
         For the previous example, given an array [12,13,11,14]
         the method should return a list with Integers 2 and 3.
        */
    }
}
