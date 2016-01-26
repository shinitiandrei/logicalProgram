package serious;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 26/01/2016.
 */
public class PrefixSet {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,2,1,2,2,3,4,1,2,1,2,3,2,1,2,3,10,0,2,3};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {

        int prefix = 0;

        int arrayLength = A.length;

        List<Integer> comparator = new ArrayList<>();

        for (int i =0; i < arrayLength; i++){
            if (!comparator.contains(A[i])){
                prefix = i;
            }
            comparator.add(A[i]);
        }

        return prefix;

    }
}
