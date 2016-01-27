package serious;// you can also use imports, for example:
// import java.util.*;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        
        int length = A.length;
        int max_length = A.length - 1;
        int index = 0;
        int secondIndex = 0;
        int finalIndex = 0;
        
        for (int i = 0; i < K; i++){
            finalIndex = A[max_length];
            for (int j = 0; j < length; j++){
                if (j == 0){
                    index = A[j];
                    A[j] = finalIndex;
                }
                if (j + 1 <= length && j > 0){
                    secondIndex = A[j];
                    A[j] = index;
                    index = secondIndex;      
                }
            }
        }
        return A;
    }
}
