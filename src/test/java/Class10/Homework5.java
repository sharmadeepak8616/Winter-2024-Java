package Class10;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        /**
         * Q1: Print values present at even index-numbers from given array in below format
         * Example:
         *      array1 = {"jOy", "earn", "lEarn", "smIle", "GiVE", "BeautifUl", "KIM"};
         *
         *      Value present at index-0 is Joy
         *      Value present at index-2 is Learn
         *      Value present at index-4 is Give
         *      ...
         *      ...
         *
         */

        /**
         * Q2: Print the given string in reverse order
         * "have a GreAT day" -> "day GreAT a have"
         * "Good Morning" -> "Morning Good"
         * "Joy" -> "Joy"
         *
         */
        String givenString = "";
        String resultString = ""; // to store the result
        // code
        // there should NOT be any sout-statement in the for-loop
        System.out.println("Given -> " + givenString);
        System.out.println("Result -> " + resultString);

        /**
         * Q3: Find the total of given int-array
         * int[] numbers = {1,2,3,4,5}      ->  15
         * int[] numbers = {1,2,3,1,5,6,8}  ->  26
         * int[] numbers = {1, 2, -1, -3}   ->  -1
         */
        int[] numbers = {1, 2, -1, -3};
        int total = 0;
        // code
        // there should NOT be any sout-statement in the for-loop
        System.out.println("Given array -> " + Arrays.toString(numbers));
        System.out.println("Total -> " + total);
    }
}
