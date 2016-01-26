package serious;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrei on 26/01/2016.
 */
public class NumberOfDiscIntersections {

    public static final int MAXIMUM_PAIR_VALUE = 10000000;

    public static void main(String[] args) {
        int [] array = {1,5,2,1,4,0};

        System.out.println("Number of Intersections: " + numberIntersections(array));

    }
    public static int numberIntersections(int[] A) {

        int intersections = 0, extension;

        long leftEx;

        int arrayLentgh = A.length;

        List<Long> storeRange = new ArrayList<>();
        List<List<Long>> storeList = new ArrayList<>();


        for (int i = 0; i < arrayLentgh; i++ ){
            extension = A[i];
            leftEx =  i - extension;
            for (int j = 0; j <= extension*2; j++){
                storeRange.add(leftEx++);
            }
            storeList.add(i, storeRange);
            storeRange = new ArrayList<>();
        }

        Object[] list = storeList.toArray();
        boolean checker = false;

        for (int i = 0; i < list.length; i++){
            List<Long> listNumbers = (List<Long>) list[i];
            System.out.println("Lista inicial: " + list [i]);

            for (List<Long> l : storeList) {
                System.out.println("Lista secundaria: " + l);
                if (list[i] == l.get(i)){
                    l.iterator().next();
                }
                for (Long number : listNumbers) {
                    System.out.println("Number: " + number + " comparing to " + l);
                    if (l.contains(number)) {
                        System.out.println("Verdade");
                        checker = true;
                    }else{
                        checker = false;
                    }
                }
                if (checker){
                    intersections++;
                }
            }

        }

        if (intersections >= MAXIMUM_PAIR_VALUE){
            return -1;
        }

        return intersections;
    }
}
