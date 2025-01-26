package Class13.ClassConceptPkg2_Practical;

public class MyMethods_String {
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
    public String reverseStringByWord(String userInput) {
        String sentenceResult = "";
        String[] sentenceSplit = userInput.toLowerCase().split(" ");
        for (int i= sentenceSplit.length-1 ; i >=0 ; i--) {
            sentenceResult = sentenceSplit[i] + " ";
        }
        return sentenceResult.trim();
    }
}
