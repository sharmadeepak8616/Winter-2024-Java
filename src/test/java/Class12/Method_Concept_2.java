package Class12;

import java.util.Arrays;

public class Method_Concept_2 {
    public static void main(String[] args) {
        System.out.println("Create a method which greets to user");
        String myUsername = "DK";
        welcome(myUsername);

        welcome("joHN DOe");

        welcome("");

        welcome("        ");

        welcome("     jOhnny ");

        System.out.println("\n\nCreate a method which can the first value in array which contains \"e\" or \"E\"");

        String[] arr1 = {"Joy", "earn", "learn", "smile", "Give", "beautiful", "Kim"};
        String firstWordWith_E_Arr1 = eFinder(arr1);
        System.out.println("Array -> " + Arrays.toString(arr1));
        System.out.println("First word which contains 'e' -> " + firstWordWith_E_Arr1);

        String[] arr2 = {"joy", "happy", "sad", "grow"};
        String firstWordWith_E_Arr2 = eFinder(arr2);
        System.out.println("Array -> " + Arrays.toString(arr2));
        System.out.println("First word which contains 'e' -> " + firstWordWith_E_Arr2);

        String[] arr3 = {"joy", "happy", "sad", "grow", "beautiful"};
        String firstWordWith_E_Arr3 = eFinder(arr3);
        System.out.println("Array -> " + Arrays.toString(arr3));
        System.out.println("First word which contains 'e' -> " + firstWordWith_E_Arr3);
    }


    /**
     * Create a method which can the first value in array which contains "e" or "E"
     *
     * {"Joy", "earn", "learn", "smile", "Give", "beautiful", "Kim"} -> "earn"
     * {"joy", "happy", "sad", "grow"}  -> ""
     * {"joy", "happy", "sad", "grow", "beautiful"}  -> "beautiful"
     */
    /**
     *  1. what is the purpose of the method? (purpose helps use to find name for the method)
     *      eFinder , getFirstWordWithE
     *  2. do we need any input-data from the user? - Yes
     *      If yes, a) how many input-values we need from user - 1
     *              b) what are the datatypes of input-values - String[]
     * 3. should we return the final result back to user? - Yes
     *      If yes, a) what is the datatype of final-result-value - String
     */
    /*
        {"Joy", "earn", "learn", "smile", "Give", "beautiful", "Kim"}
        create a variable(name: firstWordWith_E) to store result
        Run a loop from index-0
            pick index-0-value
                convert it into lowercase
                check if lowercase-value contains "e"
                    store index-0-value into firstWordWith_E
                    stop the loop
            pick index-1-value
                convert it into lowercase
                check if lowercase-value contains "e"
                    store index-1-value into firstWordWith_E
                    stop the loop
            ...
            ...
            pick index-last-value
                convert it into lowercase
                check if lowercase-value contains "e"
                    store index-last-value into firstWordWith_E
                    stop the loop

     */
    public static String eFinder(String[] userArray) {
        String firstWordWith_E = "";
        for (String wordFromArray : userArray) {
            String wordLowercase = wordFromArray.toLowerCase();
            if (wordLowercase.contains("e")) {
                firstWordWith_E = wordFromArray;
                // break;      // keyword to stop the loop
            }
        }
        return firstWordWith_E;
    }

    /**
     * Create a method which greets to user like:
     * Hello <username>
     *
     * if username has length greater than 0
     *  print "Hello <username>" (print username in Titlecase)
     * else
     *  print "Hello User"
     */
    /**
     *  1. what is the purpose of the method? (purpose helps use to find name for the method)
     *      welcome, helloUser, greetUser, welcomeUser
     *  2. do we need any input-data from the user? - Yes
     *      If yes, a) how many input-values we need from user - 1
     *              b) what are the datatypes of input-values - String
     * 3. should we return the final result back to user? - void
     *      If yes, a) what is the datatype of final-result-value
     */
    public static void welcome(String username) {
        username = username.trim();
        if (username.length() > 0) {
            username = titleCaseConverter(username);
            System.out.println("Hello "+username);
        } else {
            System.out.println("Hello User");
        }
    }

    public static String titleCaseConverter(String userInput) {
        String sentenceResult = "";
        String[] sentenceSplit = userInput.toLowerCase().split(" ");

        for (String word : sentenceSplit) {
            String letter_0_Uppercase = word.substring(0,1).toUpperCase();
            String fromIndex1Letter_0 = word.substring(1);
            sentenceResult = sentenceResult + letter_0_Uppercase + fromIndex1Letter_0 + " ";                    // "Work " + H + ard + " " = "Work Hard "
        }
        return sentenceResult;
    }
}
