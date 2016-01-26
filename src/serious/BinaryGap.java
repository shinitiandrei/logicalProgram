package serious;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrei on 26/01/2016.
 */
public class BinaryGap {

    public static void main(String[] args) {

        System.out.println(binaryGap(1302));
    }

    public static int binaryGap (int N){
        String binary;
        int gap = 0, count = 0;

        List<Integer> listCounts = new ArrayList<>();

        if (N == 0){
            return 0;
        }
        binary = Integer.toBinaryString(N);

        char [] array = binary.toCharArray();

        for (int i = 0; i < array.length; i++){
            if (array[i] == '0'){
                count++;
            }
            listCounts.add(count);
            if(array[i] == '1'){
                count = 0;
            }
        }
        gap = Collections.max(listCounts);

        return gap;
    }
}
