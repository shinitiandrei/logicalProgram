package serious;

/**
 * Created by Andrei on 26/01/2016.
 */
public class Solution {

    public static void main(String[] args) {
        int array[] = {-1, 3, -4, 5, 1, -6, 2, 1};

        if (solution(array) != -1)
            System.out.println("workit!");
    }

    public static int solution(int[] A) {
        int equilibriumIndex = -1;
        int arrayLength = A.length;
        long left = 0, right = 0;

        for (int i = 0; i < arrayLength; i++){

            for (int k = 0; k < arrayLength; k++){
                if (k == i){
                    break;
                }
                left += A[k];
            }

            for (int j = arrayLength - 1; j > i; j-- ){
                if (j == i){
                    break;
                }
                right += A[j];
            }

            if (left == right){
                equilibriumIndex = i;
            }
            System.out.println(equilibriumIndex);
            right = 0;
            left = 0;
        }

        return equilibriumIndex;


         /*   long sum = 0, leftsum = 0;
            int i, l = A.length;
            for(i = 0; i < l ; i++){
                sum += A[i];
            }
            for(i = 0; i < l ; i++){
                sum -= A[i];
                if(leftsum == sum){
                    return i;
                }
                leftsum += A[i];
            }
            return -1;
            */
    }
}
