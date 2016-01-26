package exercises;

/**
 * Created by Andrei on 26/01/2016.
 */
public class CountWaysToJump {

    public static void main(String[] args) {
        System.out.println(countWaysToJump(5));
    }
    private static int count = 0;

    public static int countWaysToJump(int N) {

        if (N == 0)
            count++;
        if (N > 0) {
            countWaysToJump(N - 1);
        }
        if (N > 1) {
            countWaysToJump(N - 2);
        }
        return count;
    }
}
