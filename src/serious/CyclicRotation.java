package serious;// you can also use imports, for example:
// import java.util.*;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(solution(array, 123)));

    }

    public static int[] solution(int[] A, int K) {

        int length = A.length;
        int max_length = A.length - 1;
        int finalIndex;

        for (int i = 0; i < K; i++) {
            int[] b = new int[length];
            finalIndex = A[max_length];

            System.arraycopy(A, 0, b, 1, max_length);
            b[0] = finalIndex;
            A = b;
        }
        return A;
    }
}
