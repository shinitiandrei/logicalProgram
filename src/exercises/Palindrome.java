package exercises;

/**
 * Created by Andrei on 25/01/2016.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Is it Palindrome? " + isPalindrome("dasdsa"));
    }

    public static String isPalindrome(String s) {

        StringBuilder palindrome = new StringBuilder(s).reverse();

        if (s.equals(palindrome.toString())){
            return "YES";
        }else{
            return "NOPE";
        }
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
    }
}
