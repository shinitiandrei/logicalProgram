package serious;

/**
 * Created by Andrei on 26/01/2016.
 */
public class Exam1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 9, 99999, 10, 3, 4, 90, 23, 123, 1234, 233344, 1122};

        System.out.println(solution(array, 5));
    }

    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int indice = 0;
        int loop = N - 1;
        while (indice < loop) {
            int media = (indice + loop)/2;
            System.out.println("M"+media);
            System.out.println("L"+loop);
            if (A[media] > X) {
                loop = media - 1;
            } else {
                indice = media;
                System.out.println();
            }
        }
        if (A[indice] == X) {
            return indice;
        }
        return -1;
    }
}
    /*while (l < r) {
        if (A[l] == X){ return l;}
        l++;

    }
    */

