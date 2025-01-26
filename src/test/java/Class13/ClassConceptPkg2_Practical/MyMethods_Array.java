package Class13.ClassConceptPkg2_Practical;

public class MyMethods_Array {
    public static String eFinder(String[] userArray) {
        String firstWordWith_E = "";
        for (String wordFromArray : userArray) {
            String wordLowercase = wordFromArray.toLowerCase();
            if (wordLowercase.contains("e")) {
                firstWordWith_E = wordFromArray;
                break;      // keyword to stop the loop
            }
        }
        return firstWordWith_E;
    }
    public int getArrayTotal(int[] userArray) {
        int total = 0;
        for (int num : userArray) {
            total += num;
        }
        return total;
    }
    public static int[] reverseArray(int[] userInputArray) {
        int[] reversedArray = new int[userInputArray.length];
        int lastIndexNumber = userInputArray.length-1;
        for (int i = 0 ; i <= lastIndexNumber ; i++) {
            reversedArray[i] = userInputArray[lastIndexNumber-i];
        }
        return reversedArray;
    }
}
