package Class11;

import java.util.Arrays;

public class Loops_Concept_3 {
    public static void main(String[] args) {
        /**
         * Loops:
         *      when we need to execute lines of code multiple times
         *
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         * 4. Enhanced-for loop
         */


        /**
         * Enhanced-for loop
         *
         * conditions in which we can use Enhanced-for-loop:
         *      1. we are applying loop on an Array or similar datatype(Collections, List, Set, Map)
         *      2. we want to traverse array from index-0-value, index-1-value, index-2-value,....index-last-value
         *
         * If above mentioned conditions are true then we can use Enhanced-for-loop in the situation.
         */
        /**
         * Syntax of Enhanced-for-loop:
         * for (datatype variableName : arrayName) {
         *      Enhanced-for-loop
         *      code block
         * }
         *
         * datatype of Enhanced-for-loop-variable should be SAME as the datatype of values in the array
         *
         */
        /**
         * Enhanced-for-loop execution steps:
         * 1. Java creates the variable of mentioned datatype
         * 2. Index-0-value from array will be assigned to variable (automatically)
         * 3. Java enters in the enhanced-for-loop code block, and executes the code
         * 4. Index-1-value from array will be assigned to variable (automatically)
         * 5. Java enters in the enhanced-for-loop code block, and executes the code
         * 6. Index-2-value from array will be assigned to variable (automatically)
         * 7. Java enters in the enhanced-for-loop code block, and executes the code
         * ...
         * ...
         * 10. Index-last-value from array will be assigned to variable (automatically)
         * 11. Java enters in the enhanced-for-loop code block, and executes the code
         */

        String[] words = {"Joy", "smile", "learn", "smile", "learn", "smile", "learn"};
        System.out.println("\nPrint all values from array at each index on separate lines");
        System.out.println("Given array -> " + Arrays.toString(words));
        System.out.println("Result using Enhanced-for-loop");
        for (String word : words) {
            System.out.println(word);
        }

        String[] words2 = {"Joy", "earn", "learn", "smile", "Give", "beautiful", "Kim"};
        System.out.println("\nPrint values from array which has length greater than 4 on separate lines");
        System.out.println("Given array -> " + Arrays.toString(words2));
        System.out.println("Result using Enhanced-for-loop");
        /**
         * conditions in which we can use Enhanced-for-loop:
         *      1. we are applying loop on an Array or similar datatype(Collections, List, Set, Map)
         *          trye
         *      2. we want to traverse array from index-0-value, index-1-value, index-2-value,....index-last-value
         *          true
         */
        for (String myWord : words2) {
            if (myWord.length() > 4) {
                System.out.println(myWord);
            }
        }


        String[] words3 = {"Hello", "Hi", "Smile", "Joy"};
        System.out.println("\nPrint all values from array in reverse order at each index on separate lines");
        System.out.println("Given array -> " + Arrays.toString(words3));
        System.out.println("Result using Enhanced-for-loop");
        /**
         * conditions in which we can use Enhanced-for-loop:
         *      1. we are applying loop on an Array or similar datatype(Collections, List, Set, Map)
         *          true
         *      2. we want to traverse array from index-0-value, index-1-value, index-2-value,....index-last-value
         *          false
         */

        /**
         * Create a String-variable and store any sentence in it
         * write code to convert the String into Titlecase
         * Example:
         *  wOrk HaRD paRTy HArdEr      -> Work Hard Party Harder
         *  stay humble keep smiling    -> Stay Humble Keep Smiling
         *  goOd MorNing                -> Good Morning
         *  hAPPY                       -> Happy
         *  May goD BE WITH YoU AlWAys  -> May God Be With You Always
         */
        String sentence = "May goD BE WITH YoU AlWAys";
        String sentenceResult = "";

        String[] sentenceSplit = sentence.toLowerCase().split(" ");   // ["work", "hard", "party", "harder"]

        for (String word : sentenceSplit) {
            String letter_0_Uppercase = word.substring(0,1).toUpperCase();      // H
            String fromIndex1Letter_0 = word.substring(1);             // ard
            sentenceResult = sentenceResult + letter_0_Uppercase + fromIndex1Letter_0 + " ";                    // "Work " + H + ard + " " = "Work Hard "
        }
        System.out.println("Sentence (Original) -> " + sentence);
        System.out.println("Sentence (Titlecase) -> " + sentenceResult);





    }
}
