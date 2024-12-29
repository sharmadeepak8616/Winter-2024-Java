package Class7;

public class StringConcept_3 {
    public static void main(String[] args) {
        /**
         * String:
         *      is a user-defined class
         *      is a non-primitive datatype
         *      can store one or more characters
         *      value MUST BE enclosed in double-quotes
         */
        /**
         * Methods in StringConcept_1.java:
         *      length()
         *
         * Methods in StringConcept_2.java:
         *      toLowerCase()
         *      toUpperCase()
         *      startsWith()
         *      endsWith()
         *      contains()
         *      replace()
         *      equals()
         *      equalsIgnoreCase()
         *      charAt()
         *
         * Methods:
         *      indexOf()
         *      lastIndexOf()
         *      trim()
         *      substring()
         *      split()
         *
         */
        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * To find (or get) the index of FIRST OCCURRENCE of a given pattern in the string
         * method: indexOf()
         * input: String (pattern for which we want to find index)
         * return-type: int
         *
         * if the given pattern is EXACTLY present in the string
         *      method returns the index from which the FIRST OCCURRENCE of pattern starts
         * otherwise
         *      method returns -1
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * at which index "i" is present -> 2
         * at which index "iT" is present -> 2
         * at which index "KInGDom" is present -> 7
         * at which index "Kingdom" is present -> -1
         *
         */
        System.out.println("\nmethod - indexOf()");
        System.out.println("countryName -> " + countryName);

        int indexOf_i = countryName.indexOf("i");
        System.out.println("index of 'i' is -> " + indexOf_i);

        int indexOf_iT = countryName.indexOf("iT");
        System.out.println("index of 'iT' is -> " + indexOf_iT);

        int indexOf_KInGDom = countryName.indexOf("KInGDom");
        System.out.println("index of 'KInGDom' is -> " + indexOf_KInGDom);

        int indexOf_Kingdom = countryName.indexOf("Kingdom");
        System.out.println("index of 'Kingdom' is -> " + indexOf_Kingdom);

        /**
         * To find (or get) the index of LAST OCCURRENCE of a given pattern in the string
         * method: lastIndexOf()
         * input: String (pattern for which we want to find index)
         * return-type: int
         *
         * if the given pattern is EXACTLY present in the string
         *      method returns the index from which the LAST OCCURRENCE of pattern starts
         * otherwise
         *      method returns -1
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * index at which last index of "i" is start ->
         * index at which last index of "iT" is start ->
         * index at which last index of "KInGDom" is start -> 7
         * index at which last index of "Kingdom" is start -> -1
         *
         */
        System.out.println("\nmethod - lastIndexOf()");
        System.out.println("countryName -> " + countryName);

        int lastIndexOf_i = countryName.lastIndexOf("i");
        System.out.println("last index of 'i' is -> " + lastIndexOf_i);

        int lastIndexOf_iT = countryName.lastIndexOf("iT");
        System.out.println("last index of 'iT' is -> " + lastIndexOf_iT);

        int lastIndexOf_KInGDom = countryName.lastIndexOf("KInGDom");
        System.out.println("last index of 'KInGDom' is -> " + lastIndexOf_KInGDom);

        int lastIndexOf_Kingdom = countryName.lastIndexOf("Kingdom");
        System.out.println("last index of 'Kingdom' is -> " + lastIndexOf_Kingdom);

        /**
         * "Hello dear " -> "Hello dear"
         * " Hello dear " -> "Hello dear"
         * " Hello dear" -> "Hello dear"
         */
        /**
         * To remove spaces before the first character of string and
         *  spaces after the last character of string.
         * method: trim()
         * return-type: String
         *
         * This method:
         *      creates a copy of original value
         *      trims extra spaces (if any) from the copied-values
         *      then returns the trimmed-value
         */
        System.out.println("\nmethod - trim()");
        String mySentence = "   HelLo     DeAr, HOw     ArE     YOu       dOinG    ?      ";

        String mySentence_Trim = mySentence.trim();
        System.out.println("mySentence (original) -> *"+mySentence+"*");
        System.out.println("mySentence (aftertrim)-> *"+mySentence_Trim+"*");

        /**
         * To extract a portion from string using index-numbers
         * method: substring()
         * input: startIndex, endIndex (optional)
         * return-type: String
         *
         * if the input is only startIndex and it's valid
         *      method returns the string starting from start-index upto the end of the string
         * otherwise
         *      method throw Exception (StringIndexOutOfBoundsException)
         *
         * if the input is startIndex and endIndex and both are valid
         *      method returns the string starting from start-index upto endIndex (excluding endIndex) of the string
         * otherwise
         *      method throw Exception (StringIndexOutOfBoundsException)
         *
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         * extract starting from index-1 to index-6(excluding index-6) -> "NiTeD"
         *
         * extract starting from index-1 to index-15(excluding index-15) -> "NiTeD KInGDom "
         *
         * (get first character from the string)
         * extract starting from index-0 to index-1(excluding index-1) -> "U"
         *
         * extract starting from index-1 -> "NiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         */
        System.out.println("\nmethod - substring()");
        System.out.println("countryName -> " + countryName);

        String countryNameFromIndex1To6 = countryName.substring(1, 6);
        System.out.println("countryName from index-1 to index-6(excluding index-6) -> " + countryNameFromIndex1To6);

        String countryNameFromIndex1To15 = countryName.substring(1, 15);
        System.out.println("countryName from index-1 to index-15(excluding index-15) -> " + countryNameFromIndex1To15);

        String countryNameFromIndex0To1 = countryName.substring(0,1);
        System.out.println("countryName from index-0 to index-6(excluding index-1) -> " + countryNameFromIndex0To1);

        String countryNameFromIndex1 = countryName.substring(1);
        System.out.println("countryName from index-1 -> " + countryNameFromIndex1);

        /**
         * Find the char present at last-index in countryName
         *
         * countryName = Finland
         * extract starting from lastIndex -> "d"
         *
         *
         * 1. find the countryName length
         * 2. use countryName-length to find the last index-number
         * 3. using last index-number as starIndex in substring()
         */
        System.out.println("\nQuestion: Find the char present at last-index in countryName");
        int countryNameLength = countryName.length();
        int countryNameLastIndex = countryNameLength-1;
        String charAtLastIndex = countryName.substring(countryNameLastIndex);
        System.out.println("char present at last-index in countryName -> " + charAtLastIndex);


    }
}
