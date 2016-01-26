package exercises;

/**
 * Created by Andrei on 26/01/2016.
 */
public class GetCountOfOnes {

    public static void main(String[] args) {

        System.out.println("number of 1: " + getCountOfOnes(1000));

    }

    public static int getCountOfOnes(int n) {
        if (n <= 0 ){
            return 0;
        }
        String binaryNumber = Integer.toBinaryString(n);

        char [] c = binaryNumber.trim().toCharArray();

        int count = 0;

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
            String v = String.valueOf(c[i]);

            if ( v.equals("1")){
                count++;
            }
        }
        return count;
    }
}
