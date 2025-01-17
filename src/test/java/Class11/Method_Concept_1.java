package Class11;

public class Method_Concept_1 {
    /**
     * NOTE:
     *      ALL methods must be inside the class-curly-brackets
     *      Method CANNOT be created within the curly-brackets of another method.
     *      We can USE a method within the curly-brackets of another method.
     */
    public static void main(String[] args) {

        /**
         * Methods: lines of code to perform a specific task
         *
         * Benefit: No code repetition
         *
         * Good Practice: Method name should reflect the purpose of the method
         *
         */
        /**
         * Information to know before creating a method:
         *  1. what is the purpose of the method? (purpose helps use to find name for the method)
         *  2. do we need any input-data from the user?
         *      If yes, a) how many input-values we need from user
         *              b) what are the datatypes of input-values
         * 3. should we return the final result back to user?
         *      If yes, a) what is the datatype of final-result-value
         */
        /**
         * Syntax to create a method:
         * <accessModifier> [static] <datatypeOfReturnValue-Q3a> <methodName-Q1>(<inputParameters-Q2>) {
         *      // code block for the method
         *      // code to achieve the purpose of the method
         *      return statement    <-- Last line in method IF we decide to return final-result back to user
         * }
         *
         * <accessModifier> : defines from where we can access the method
         *                    (mostly, we use public accessModifier)
         *
         * static : if present, method is called as Static Method
         *          else, method is normal method
         *          To use Static-method, we use the ClassName in which method is present
         *          To use normal-method, we use the clasObject of the Class in which method is present
         *
         * <datatypeOfReturnValue-Q3a> :
         *      if we plan to return the final result back to user, put datatype of final result as return-type
         *      else, put void as return-type
         *
         * <methodName-Q1> : Name of the method (should be related to its purpose)
         *
         * <inputParameters-Q2> :
         *      if we need input-values from user : create variables of required datatypes to store user-input-values
         *      else, parenthesis will be empty
         *
         */
        String sentence = "May goD BE WITH YoU AlWAys";
        String sentenceTitleCase = titleCaseConverter(sentence);
        System.out.println("Sentence (Original) -> " + sentence);
        System.out.println("Sentence (Titlecase) -> " + sentenceTitleCase);

        helloWorld();
        System.out.println("\nAfter helloWorld()\n");

        String result = titleCaseConverter("GoOD MoRNiNG");
        System.out.println("result -> " + result);

    }

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


    /**
     * Create a method to print "Hello World"
     */
    /**
     *  1. what is the purpose of the method?
     *      helloWorld , printHelloWorld , sayHelloWorld
     *  2. do we need any input-data from the user? - No
     *  3. should we return the final result back to user? - No
     */
    public static void helloWorld() {
        System.out.println("Hello World");
    }



}
