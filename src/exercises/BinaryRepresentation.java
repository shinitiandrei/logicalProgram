package exercises;

/**
 * Created by Andrei on 25/01/2016.
 */
public class BinaryRepresentation {

    public static void main(String[] args) {

        System.out.println("Binary Representation: " + getBinaryRepresentation(5));

    }

    public static String getBinaryRepresentation(int n) {

        return Integer.toBinaryString(n);
        /*
         Please implement this method to
         return a String with the binary representation of any number n, where n >= 0.
         Example: "101" is a binary representation of 5
        */
    }

}
