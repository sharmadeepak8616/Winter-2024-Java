package Class4;

public class StringConcept_1 {
    public static void main(String[] args) {
        /**
         * String:
         *      is a user-defined class
         *      is a non-primitive datatype
         *      can store one or more characters
         *      value MUST BE enclosed in double-quotes
         */
        /**
         * Methods:
         *      length()
         */
        String str1 = "Hello";
        String str2 = "GoOd DaY";
        String str3 = "Read full articles, watch videos, browse thousands of titles and more on the Home page topic with Google News.";

        /*
             How many memory-locations used by str1 - 5
                OR
             How many characters are in str1 OR length of str1 - 5
             start index = 0
             last index = 4
             lastIndex = stringLength - 1
         */
        /*
             How many memory-locations used by str2 - 8
                OR
             How many characters are in str2 OR length of str2 - 8
             start index = 0
             last index = 7
         */

        /**
         * Formula to find lastIndex-number:
         *      lastIndex = length - 1
         */
        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * to find the length of String
         *  OR
         * to the find number of characters in String
         * method: length()
         * return-type: int
         */
        System.out.println("\nmethod - length()");
        int str1Length = str1.length();
        System.out.println("str1 -> " + str1);
        System.out.println("str1 length -> " + str1Length);
        System.out.println("str1 last-index -> " + (str1Length-1));

        int str2Length = str2.length();
        System.out.println("str2 -> " + str2);
        System.out.println("str2 length -> " + str2Length);
        System.out.println("str2 last-index -> " + (str2Length-1));

        int str3Length = str3.length();
        System.out.println("str3 -> " + str3);
        System.out.println("str3 length -> " + str3Length);
        System.out.println("str3 last-index -> " + (str3Length-1));

        int countryNameLength = countryName.length();
        System.out.println("countryName -> " + countryName);
        System.out.println("countryName length -> " + countryNameLength);
        System.out.println("countryName last-index -> " + (countryNameLength-1));






    }
}
