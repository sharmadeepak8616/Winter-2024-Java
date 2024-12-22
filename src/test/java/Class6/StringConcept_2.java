package Class6;

public class StringConcept_2 {
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
         * Methods:
         *      toLowerCase()
         *      toUpperCase()
         *      startsWith()
         *      endsWith()
         *      contains()
         *      replace()
         *      equals()
         *      equalsIgnoreCase()
         *
         */
        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * To convert string-value into lowercase
         * method: toLowerCase()
         * return-type: String
         *
         * This method:
         *      creates a copy of original value
         *      converts the copied-value into lowercase
         *      then return the lowercased-value
         */
        String countryNameLowercase = countryName.toLowerCase();
        System.out.println("\nmethod - toLowerCase()");
        System.out.println("countryName -> " + countryName);
        System.out.println("countryNameLowercase -> " + countryNameLowercase);

        /**
         * To convert string-value into UPPERCASE
         * method: toUpperCase()
         * return-type: String
         *
         * This method:
         *      creates a copy of original value
         *      converts the copied-value into UPPERCASE
         *      then return the UPPERCASEd-value
         */
        String countryNameUppercase = countryName.toUpperCase();
        System.out.println("\nmethod - toUpperCase()");
        System.out.println("countryName -> " + countryName);
        System.out.println("countryNameUppercase -> " + countryNameUppercase);

        /**
         * To check if String starts EXACTLY with the given pattern
         * method: startsWith()
         * input: String
         * return-type: boolean
         *
         * if the string EXACTLY starts with given pattern
         *      method returns true
         * otherwise
         *      method returns false
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         *
         * does countryName start with "U"              ->  true
         * does countryName start with "Un"             ->  false
         * does countryName start with "UNiTeD k"       ->  false
         * does countryName start with "KInG"           ->  false
         *
         */
        System.out.println("\nmethod - startsWith()");
        System.out.println("countryName -> " + countryName);
        boolean isStartsWith_U = countryName.startsWith("U");
        System.out.println("does countryName start with 'U' -> " + isStartsWith_U);

        boolean isStartsWith_Un = countryName.startsWith("Un");
        System.out.println("does countryName start with 'Un' -> " + isStartsWith_Un);

        boolean isStartsWith_UNiTeD_k = countryName.startsWith("UNiTeD k");
        System.out.println("does countryName start with 'UNiTeD k' -> " + isStartsWith_UNiTeD_k);

        boolean isStartsWith_KInG = countryName.startsWith("KInG");
        System.out.println("does countryName start with 'KInG' -> " + isStartsWith_KInG);

        /**
         * Question: Check if countryName starts with "Un" (ignoring cases)
         */

        System.out.println("\nQuestion : Check if countryName starts with \"Un\" (ignoring cases)");
        System.out.println("countryName -> " + countryName);

        /**
         * UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND -> united kingdom of great britain and northern ireland
         *
         * Un -> un
         *
         * 1. convert countryName into lowercase
         * 2. convert pattern into lowercase
         * 3. use converted countryName and pattern in startsWith-method
         *
         */
        countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryNameLower = countryName.toLowerCase();

        String pattern = "Un";
        String patternLower = pattern.toLowerCase();

        boolean isCountryNameStartsWith_Un = countryNameLower.startsWith(patternLower);
        System.out.println("is countryName starts with \"" + pattern + "\" (ignoring cases) -> " + isCountryNameStartsWith_Un);

        /**
         * To check if String ends EXACTLY with the given pattern
         * method: endsWith()
         * input: String
         * return-type: boolean
         *
         *
         * if the string EXACTLY ends with given pattern
         *      method returns true
         * otherwise
         *      method returns false
         *
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         *
         * does countryName end with "U"                ->  false
         * does countryName end with "and"              ->  false
         * does countryName end with "erN irElaND"      ->  true
         * does countryName end with "KInG"             ->  false
         *
         */
        System.out.println("\nmethod - endsWith()");
        System.out.println("countryName -> " + countryName);

        boolean isEndsWith_U = countryName.endsWith("U");
        System.out.println("does countryName end with 'U' -> " + isEndsWith_U);

        boolean isEndsWith_and = countryName.endsWith("and");
        System.out.println("does countryName end with 'and' -> " + isEndsWith_and);

        boolean isEndsWith_erN_irElaND = countryName.endsWith("erN irElaND");
        System.out.println("does countryName end with 'erN irElaND' -> " + isEndsWith_erN_irElaND);

        boolean isEndsWith_KInG = countryName.endsWith("KInG");
        System.out.println("does countryName end with 'KInG' -> " + isEndsWith_KInG);

        /**
         * To check if String contains EXACTLY the given pattern
         * method: contains()
         * input: String
         * return-type: boolean
         *
         * if the string EXACTLY contains with given pattern
         *      method returns true
         * otherwise
         *      method returns false
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         *
         * does countryName contain with "U"                ->  true
         * does countryName contain with "Brit"             ->  false
         * does countryName contain with "And"              ->  true
         * does countryName contain with "Dom"              ->  true
         * does countryName contain with "KInG "            ->  false
         * does countryName contain with "D K"              ->  true
         * does countryName contain with "e"                ->  true
         *
         */
        System.out.println("\nmethod - contains()");
        System.out.println("countryName -> " + countryName);

        boolean isContains_U = countryName.contains("U");
        System.out.println("does countryName contain with 'U' -> " + isContains_U);

        boolean isContains_Brit = countryName.contains("Brit");
        System.out.println("does countryName contain with 'Brit' -> " + isContains_Brit);

        boolean isContains_And = countryName.contains("And");
        System.out.println("does countryName contain with 'And' -> " + isContains_And);

        boolean isContains_Dom = countryName.contains("Dom");
        System.out.println("does countryName contain with 'Dom' -> " + isContains_Dom);

        boolean isContains_KInG_ = countryName.contains("KInG ");
        System.out.println("does countryName contain with 'KInG ' -> " + isContains_KInG_);

        boolean isContains_D_K = countryName.contains("D K");
        System.out.println("does countryName contain with 'D K' -> " + isContains_D_K);

        boolean isContains_e = countryName.contains("e");
        System.out.println("does countryName contain with 'e' -> " + isContains_e);

        /**
         * To replace an EXACT pattern from string with a given pattern
         * method: replace()
         * input: String, String
         * return-type: String
         *
         *
         * if the pattern that we want to replace is EXACTLY present in the string
         *      method creates copy of the original-value,
         *          then replaces the pattern with new-pattern in copied-value
         *          then returns the result.
         * otherwise
         *      method creates copy of the original-value,
         *          then returns the copied-value
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         *
         * in countryName replace "e" with "PP"
         *  ->  UNiTPPD KInGDom OF GRPPAt BRiTaIn And NorTHPPrN irElaND
         *
         * in countryName replace "Great" with "Greatest"
         *  ->  UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         */
        System.out.println("\nmethod - replace()");
        System.out.println("countryName -> " + countryName);

        String replace_e_PP = countryName.replace("e", "PP");
        System.out.println("countryName after replace 'e' with 'PP' -> " + replace_e_PP);

        String replace_Great_Greatest = countryName.replace("Great", "Greatest");
        System.out.println("countryName after replace 'Great' with 'Greatest' -> " + replace_Great_Greatest);

        /**
         * To find if two Strings are IDENTICAL
         * method: equals()
         * return-type: boolean
         *
         * if the two strings are identical
         *      method returns true
         * otherwise
         *      method returns false
         *
         * "Hello" equals "Hello"       ->  true
         * "Hello" equals "Hello "      ->  false
         * "Hello" equals "HeLLo"       ->  false
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         * countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         */
        // countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
        String countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryName2 = "United KInGDom OF Great BRiTaIn And NorTHerN irElaND";
        String countryName3 = "United KInGDom OF Great BRiTaIn";
        String countryName4 = "UNiTeD KInGDom OF GReAt BRiTaIn  And NorTHerN irElaND";

        System.out.println("\nmethod - equals()");
        System.out.println("countryName -> " + countryName);
        System.out.println("countryName1 -> " + countryName1);
        System.out.println("countryName2 -> " + countryName2);
        System.out.println("countryName3 -> " + countryName3);
        System.out.println("countryName4 -> " + countryName4);

        boolean isCountryNameEquals_countryName1 = countryName.equals(countryName1);    // true
        System.out.println("is countryName equals countryName1 -> " + isCountryNameEquals_countryName1);

        boolean isCountryNameEquals_countryName2 = countryName.equals(countryName2);    // false
        System.out.println("is countryName equals countryName2 -> " + isCountryNameEquals_countryName2);

        boolean isCountryNameEquals_countryName3 = countryName.equals(countryName3);    // false
        System.out.println("is countryName equals countryName3 -> " + isCountryNameEquals_countryName3);

        boolean isCountryNameEquals_countryName4 = countryName.equals(countryName4);    // false
        System.out.println("is countryName equals countryName4 -> " + isCountryNameEquals_countryName4);

        /**
         * To find if two Strings are having same value (ignoring cases) and have same length
         * method: equalsIgnoreCase()
         * return-type: boolean
         *
         * if the two Strings are having same value (ignoring cases) and have same length
         *      method returns true
         * otherwise
         *      method returns false
         *
         * "Hello" equalsIgnoreCase "Hello"       -> true
         * "Hello" equalsIgnoreCase "Hello "      -> false
         * "Hello" equalsIgnoreCase "HeLLo"      ->  true
         *
         * countryName = UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND
         * countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         */
        /*
            countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
            countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
            countryName2 = "United KInGDom OF Great BRiTaIn And NorTHerN irElaND";
            countryName3 = "United KInGDom OF Great BRiTaIn";
            countryName4 = "UNiTeD KInGDom OF GReAt BRiTaIn  And NorTHerN irElaND";
         */

        System.out.println("\nmethod - equalsIgnoreCase()");
        System.out.println("countryName -> " + countryName);
        System.out.println("countryName1 -> " + countryName1);
        System.out.println("countryName2 -> " + countryName2);
        System.out.println("countryName3 -> " + countryName3);
        System.out.println("countryName4 -> " + countryName4);

        boolean isCountryNameEqualsIgnoreCase_countryName1 =  countryName.equalsIgnoreCase(countryName1);     // true
        System.out.println("is countryName equalsIgnoreCase countryName1 -> " + isCountryNameEqualsIgnoreCase_countryName1);

        boolean isCountryNameEqualsIgnoreCase_countryName2 =  countryName.equalsIgnoreCase(countryName2);     // true
        System.out.println("is countryName equalsIgnoreCase countryName2 -> " + isCountryNameEqualsIgnoreCase_countryName2);

        boolean isCountryNameEqualsIgnoreCase_countryName3 =  countryName.equalsIgnoreCase(countryName3);     // false
        System.out.println("is countryName equalsIgnoreCase countryName3 -> " + isCountryNameEqualsIgnoreCase_countryName3);

        boolean isCountryNameEqualsIgnoreCase_countryName4 =  countryName.equalsIgnoreCase(countryName4);     // false
        System.out.println("is countryName equalsIgnoreCase countryName4 -> " + isCountryNameEqualsIgnoreCase_countryName4);

        /**
         * To find (or get) the character present at any given index in the string
         * method: charAt()
         * input: int (indexValue)
         * return-type: char
         *
         * if the given string is valid (means, 0 to lastIndexNumber)
         *      method returns the char present at given index
         * otherwise
         *      method throw Exception (StringIndexOutOfBoundsException)
         *
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * which char is present at index-2 -> i
         * which char is present at index-5 -> D
         * which char is present at index-17 ->
         * which char is present at index-18 ->
         * which char is present at index-999 -> Java the crash the code right away (Exception -> StringIndexOutOfBoundsException)
         *
         */
        System.out.println("\nmethod - charAt()");
        System.out.println("countryName -> " + countryName);

        char charAt2 = countryName.charAt(2);
        System.out.println("char present in index-2 in countryName -> " + charAt2);

        char charAt5 = countryName.charAt(5);
        System.out.println("char present in index-5 in countryName -> " + charAt5);

        char charAt17 = countryName.charAt(17);
        System.out.println("char present in index-17 in countryName -> " + charAt17);

        char charAt18 = countryName.charAt(18);
        System.out.println("char present in index-18 in countryName -> " + charAt18);

//        char charAt999 = countryName.charAt(999);
//        System.out.println("char present in index-999 in countryName -> " + charAt999);

        /**
         * Find the char present at last-index in countryName
         *
         *
         * 1. find the length of string
         * 2. use length to find the last-index number
         * 3. use last-index number with charAt
         */
        System.out.println("\nQuestion: Find the char present at last-index in countryName");
        countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        int countryNameLength = countryName.length();
        int countryNameLastIndex = countryNameLength - 1;
        char charAtLastIndex = countryName.charAt(countryNameLastIndex);
        System.out.println("char present at last-index in countryName -> " + charAtLastIndex);
























    }
}
