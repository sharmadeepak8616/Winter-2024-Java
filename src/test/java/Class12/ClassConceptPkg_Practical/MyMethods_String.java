package Class12.ClassConceptPkg_Practical;

public class MyMethods_String {

    /**
     * Create a method to convert a string into Titlecase
     */
    /**
     *  1. what is the purpose of the method? (purpose helps use to find name for the method)
     *      titleCaseConverter , toTitleCase
     *  2. do we need any input-data from the user? - Yes
     *      If yes, a) how many input-values we need from user - 1
     *              b) what are the datatypes of input-values - String
     * 3. should we return the final result back to user? - Yes
     *      If yes, a) what is the datatype of final-result-value - String

     */
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
