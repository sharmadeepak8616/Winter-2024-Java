package Class7;

public class Homework2_Discussion {
    public static void main(String[] args) {
        String countryName1 = "Japan";
        int result1;
        /**
         * Assign value in the result1-variable
         * if the countryName-length is greater or equals to 6
         *      assign 10 in result1
         * otherwise
         *      assign 20 in result1
         *
         * Hint: Ternary operator
         *
         * countryLength >= 6 , assign 10 in result1 otherwise assign 20 in result1
         *
         * two values -> 10(if true) , 20 (if false)
         * condition -> countryLength >= 6
         *
         * variable = condition(s) ? valueToAssignIfConditionTrue : valueToAssignIfConditionFalse;
         * result1 = countryName1Length >= 6 ? 10 : 20;
         */
        int countryName1Length = countryName1.length();
        result1 = countryName1Length >= 6 ? 10 : 20;
        System.out.println("Question-1:");
        System.out.println("countryName1 -> " + countryName1);
        System.out.println("result1 -> " + result1);

        System.out.println("\n\nQuestion-2:");
        /**
         * Ignore-cases for all below tasks
         *
         * 1. find if countryName2 contains R
         * 2. find if countryName2 starts with Ki
         * 3. find if countryName2 and countryName1 are having same value
         * 4. replace "D" in countryName2 with "SiGMa"
         */

        /**
         * Ignore-cases for all below tasks
         * 1. find if countryName2 contains R
         */
        String countryName2 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryName2Lowercase = countryName2.toLowerCase();
        System.out.println("\nmethod - toLowerCase()");
        System.out.println("countryName2 -> " + countryName2);
        System.out.println("countryName2Lowercase -> " + countryName2Lowercase);

        String pattern = "R";
        String patternLowercase = pattern.toLowerCase();
        System.out.println("\nmethod - toLowerCase()");
        System.out.println("pattern -> " + pattern);
        System.out.println("patternLowerCase -> " + pattern.toLowerCase());
        boolean isContains_R = countryName2Lowercase.contains(patternLowercase);
        System.out.println("does countryName2 contain 'R' -> " + isContains_R);

        /**
         * Ignore-cases for all below tasks
         * 2. find if countryName2 starts with Ki
         */
        String countryName2UpperCase = countryName2.toUpperCase();
        System.out.println("\nmethod - toUpperCase()");
        System.out.println("countryName2UpperCase -> " + countryName2UpperCase);

        String pattern1  = "Ki";
        String pattern1UpperCase = pattern1.toUpperCase();
        System.out.println("\nmethod - toUpperCase()");
        System.out.println("pattern1 -> " + pattern1);
        System.out.println("pattern1UpperCase -> " + pattern1UpperCase);
        boolean isCountryName2StartsWith_Ki = countryName2UpperCase.startsWith(pattern1UpperCase);
        System.out.println("is countryName2 starts with \"" + pattern1 + "\" (ignoring cases) -> " + isCountryName2StartsWith_Ki);

        /**
         * Ignore-cases for all below tasks
         * 3. find if countryName2 and countryName1 are having same value
         */
        System.out.println("\nmethod - equalsIgnoreCase()");
        System.out.println("countryName1 -> " + countryName1);
        System.out.println("countryName2 -> " + countryName2);
        boolean isCountryName1EqualsIgnoreCase_countryName2 =  countryName2.equalsIgnoreCase(countryName1);
        System.out.println("is countryName1 equalsIgnoreCase countryName2 -> " + isCountryName1EqualsIgnoreCase_countryName2);


        /**
         * Ignore-cases for all below tasks
         * 4. replace "D" in countryName2 with "SiGMa"
         */

        System.out.println("\nmethod - replace()");
        String toReplace = "D";
        String toReplaceLowercase = toReplace.toLowerCase();
        System.out.println("countryName2 -> " + countryName2);
        String replace_D_SiGMa = countryName2Lowercase.replace(toReplaceLowercase, "SiGMa");
        System.out.println("countryName2 after replace 'D' with 'SiGMa' -> " + replace_D_SiGMa);

        System.out.println(" ---- Another way ---- ");

        /**
         * countryName2 = "UNiTeD KInGdom";
         *      replace "D" with "SiGMa"
         * replace_D_SiGMa_1 = "UNiTeSigMa KInGdom"
         *      replace "d" with "SiGMa"
         * replace_d_SiGMa_1 = "UNiTeSigMa KInGSiGMaom"
         */

        String replace_D_SiGMa_1 = countryName2.replace("D", "SiGMa");
        String replace_d_SiGMa_1 = replace_D_SiGMa_1.replace("d", "SiGMa");
        System.out.println("countryName2 after replace 'D' with 'SiGMa' -> " + replace_d_SiGMa_1);

    }
}