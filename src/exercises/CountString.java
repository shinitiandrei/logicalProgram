package exercises;

/**
 * Created by Andrei on 25/01/2016.
 */
public class CountString {

    public static void main(String[] args) {

        System.out.println("number of characters: " + countWords("dasdas dasadas udiasudiou 198 10928 as" +
                "dahsudhasiudhuiashduiashi dasdjasj"));

    }

    public static int countWords(String s) {

        int finalCount = 0;

        char [] c = s.toCharArray();

        for (char count : c){
            finalCount += 1;
        }
        return finalCount;
        /*
          Please implement this method to return the word count in a given String.

          The words in the parameter String can be separated from each other by any nubmer
          of whitespace symbols (Character.isWhitespace()).
         */
    }

}
