package Class8;

import java.util.Arrays;

public class StringConcept_4 {
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
         * Methods in StringConcept_3.java:
         *      indexOf()
         *      lastIndexOf()
         *      trim()
         *      substring()
         *
         * Methods:
         *      split()
         */
        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * To cut/divide a String at a specific pattern into multiple pieces/String
         * method: split()
         * input: String (pattern at which we want to make a cut)
         * return-type: String[]
         *
         * if the given pattern is EXACTLY present in the string
         *      method cuts the String wherever EXACT pattern is present; and
         *          returns the multiple Strings pieces into a String-Array (String[])
         * otherwise
         *      method returns a String-Array with entire String present at index-0
         *
         * Examples:
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> "R"
         *      {"UNiTeD KInGDom OF G", "eAt B", "iTaIn And NorTHerN irElaND"}
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> "XYZ"
         *      {"UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"}
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> " "    (this will cut the String into words)
         *      {"UNiTeD","KInGDom","OF","GReAt","BRiTaIn","And","NorTHerN","irElaND"}
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> ""
         *      {"U","N","i","T","e","D"," ","K","I","n","G","D","o","m"," ","O",.....}
         *
         */
        System.out.println("\nmethod - split()");
        System.out.println("countryName -> " + countryName);

        String[] splitBy_R = countryName.split("R");
        int splitBy_R_length = splitBy_R.length;
        System.out.println("split by 'R' -> " + Arrays.toString(splitBy_R));
        System.out.println("Length of splitBy_R -> " + splitBy_R_length);

        String[] splitBy_XYZ = countryName.split("XYZ");
        int splitBy_XYZ_length = splitBy_XYZ.length;
        System.out.println("split by 'XYZ' -> " + Arrays.toString(splitBy_XYZ));
        System.out.println("Length of splitBy_XYZ -> " + splitBy_XYZ_length);

        String[] splitBy_space = countryName.split(" ");
        int splitBy_space_length = splitBy_space.length;
        System.out.println("split by ' ' -> " + Arrays.toString(splitBy_space));
        System.out.println("Length of splitBy_space -> " + splitBy_space_length);

        /**
         * Find the number of words in given String
         *
         * 1. Use split(" ") to break String into Array (Array will have each word at every index)
         * 2. Find the length of the Array to get number of words in the String
         *
         */
        System.out.println("\n\nQuestion: Find the number of words in given String");
        String para = "Google aims to make it easier to stay informed by using technology to organize and help people access information about current issues and events. News experiences across Google are built to help you easily find news from a diversity of trusted sources so you can stay up-to-date and informed on the stories that matter most to you.";
        String[] para_Array = para.split(" ");
        int totalWordsInPara = para_Array.length;
        System.out.println("Paragraph -> " + para);
        System.out.println("Total words in paragraph -> " + totalWordsInPara);

    }
}
