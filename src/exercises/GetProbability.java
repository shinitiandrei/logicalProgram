package exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrei on 25/01/2016.
 */
public class GetProbability {

    public static void main(String[] args){
        System.out.println("Percentage of probability: " + getProbability(6, 4));
    }


    public static double getProbability(int Y, int X) {

        int sided_dice = 6;

        double number_of_chances = Math.pow(sided_dice, Y);

        double probability = number_of_chances/X;

        double percentage = (probability * 100) / number_of_chances;

        return percentage;
        /*
          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
         */


    }
}
