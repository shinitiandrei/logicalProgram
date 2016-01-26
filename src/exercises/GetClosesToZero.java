package exercises;

import java.util.Arrays;

/**
 * Created by Andrei on 25/01/2016.
 */
public class GetClosesToZero {

    public static void main(String[] args) {
        int[] b = {100,-123, -44, -32, 52, 103, -8, 8, 0};
        System.out.println("number closest to zero: " + getClosestToZero(b));
    }

    public static int getClosestToZero(int[] a) {
        int num = a[0];
        int absNum = Math.abs(num);
        System.out.println("absNum: " + absNum);
        for(int i = 1; i < a.length; ++i) {
            int newAbs = Math.abs(a[i]);
            System.out.println("newAbs: " + newAbs);
            if (newAbs < absNum) {
                absNum = newAbs;
                num = a[i];
            }
        }
        if (num < 0){
            num = Math.abs(num);
        }
        return num;

    }

    private static void getListOfInts(int[] a) {
        for(int s : a)
        System.out.println(s);
    }
}
