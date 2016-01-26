package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Andrei on 25/01/2016.
 */
public class BetterProgrammerTask {

    public static final String NUM_CHECK_REGEX = ".*\\d.*";

    public static void main(String[] args) {
        int result = sum("adding random numbers 1, 2 and 3 and writing in no order 100");

        System.out.println("The sum of the numbers is: " + result);

    }

    public static int sum (String str) {
        str = str.replaceAll("[\\D]+", " ");
        System.out.println("string 1 : " + str );
        String[] numbers = str.split(" ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += Integer.parseInt(numbers[i]);
            } catch (Exception e) {
            }
        }
        return sum;
    }
}
