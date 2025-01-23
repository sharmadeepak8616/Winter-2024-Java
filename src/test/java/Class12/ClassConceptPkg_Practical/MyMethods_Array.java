package Class12.ClassConceptPkg_Practical;

public class MyMethods_Array {

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

    // Create a method to find total of given int-array
    /**
     *  1. what is the purpose of the method? (purpose helps use to find name for the method)
     *      totalNumber, getArrayTotal, sumArray
     *  2. do we need any input-data from the user? - Yes
     *      If yes, a) how many input-values we need from user - 1
     *              b) what are the datatypes of input-values - int[]
     * 3. should we return the final result back to user? - Yes
     *      If yes, a) what is the datatype of final-result-value - int
     */
    public static int getArrayTotal(int[] userArray) {
        int total = 0;
        for (int num : userArray) {
            total += num;
        }
        return total;
    }

    // Method to reverse a given int-array
    /**
     *  1. what is the purpose of the method? (purpose helps use to find name for the method)
     *      reverseArray
     *  2. do we need any input-data from the user? - Yes
     *      If yes, a) how many input-values we need from user - 1
     *              b) what are the datatypes of input-values - int[]
     * 3. should we return the final result back to user? - Yes
     *      If yes, a) what is the datatype of final-result-value - int[]
     */
    /*
            userInputArray = {45, 78, 12, 90, 34, 75};
            reversedArray = {}
            last-Index-0    -> index-0  // reversedArray = {75, }
            last-index-1    -> index-1  // reversedArray = {75, 34, }
            last-index-2    -> index-2  // reversedArray = {75, 34, 90, }
     */
    public static int[] reverseArray(int[] userInputArray) {
        int[] reversedArray = new int[userInputArray.length];
        int lastIndexNumber = userInputArray.length-1;
        for (int i = 0 ; i <= lastIndexNumber ; i++) {
            reversedArray[i] = userInputArray[lastIndexNumber-i];
        }
        return reversedArray;
    }
}
