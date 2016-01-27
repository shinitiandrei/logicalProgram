// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        
        int length = A.length;
        int max_length = A.length - 1;
        int next = 0;
        int index = 0;
        int secondIndex = 0;
        int finalIndex = 0;
        int temp = 0;
        int initial = 0;
        
        for (int i = 0; i < K; i++){
            finalIndex = A[max_length];
            for (int j = 0; j < length; j++){
                if (j == 0){
                    index = A[j+1];
                    A[j+1] = A[j];
                }
                if (j + 1 < length && j > 0){
                    
                    secondIndex = A[j+1];
                    A[j+1] = index;
                    }

                /*if (j == 0){
                    index = A[j+1];
                    initial = A[j];
                    A[j+1] = initial;
                }
                if (j + 1 < max_length && j > 0){
                    index = A[j+1];
                    A[j] = index;                    
                }*/
            }
            A[0] = finalIndex;
        }
        return A;
    }
}
