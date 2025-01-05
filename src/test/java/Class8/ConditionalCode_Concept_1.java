package Class8;

public class ConditionalCode_Concept_1 {
    public static void main(String[] args) {
        /**
         * Conditional Code (Conditional block, Conditional loops):
         * 1. if-else block
         * 2. switch block
         *
         */

        /**
         * 1. if-else block
         *      if block
         *      if-else block
         *      if-else if-else block
         */

        /**
         * if it's going to rain today
         *      take umbrella
         */
        /**
         * Syntax if-block:
         *
         * if (condition(s)) {
         *      // if-block
         *      // code written in the block is going to execute when if-condition(s) result into true
         * }
         *
         * Java reviews the given if-condition(s),
         *  if condition(s) result into true -> Java enters in the if-block and executes the code written in it.
         *  if condition(s) result into false -> Java does NOT even enter in the if-block
         */
        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        System.out.println("\nif block");
        if (countryName.contains("n")) {
            System.out.println("Country name contains 'n'");
        }
        System.out.println("Outside the if-block");

        /**
         * Syntax if-else block:
         *
         * if (condition(s)) {
         *      // if-block
         *      // code written in the block is going to execute when if-condition(s) result into true
         * } else {
         *      // else block
         *      // code written in the block is going to execute when if-condition(s) result into false
         * }
         *
         * Java reviews the given if-condition(s),
         *  if condition(s) result into true -> Java enters in the if-block; executes the code written in it and ignore else-block
         *  if condition(s) result into false -> Java enters in the else-block automatically.
         */
        /**
         * if countryName contains "n"          -> print "Country name contains 'n'"
         * if countryName does not contain "n"  -> print the countryName
         */

        System.out.println("\nif-else block");
        countryName = "Russia";
        System.out.println("CountryName = " + countryName);
        if (countryName.contains("n")) {
            System.out.println("Country name contains 'n'");
        } else {
            System.out.println("CountryName = " + countryName);
        }

        System.out.println("Outside the if-else block");

        /**
         * Syntax if-else if-else block:
         *
         * if (condition(s)) {
         *      // if-block
         *      // code written in the block is going to execute when if-condition(s) result into true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code written in the block is going to execute when else-if-condition(s) result into true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code written in the block is going to execute when else-if-condition(s) result into true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code written in the block is going to execute when else-if-condition(s) result into true
         * } else {
         *      // else block
         *      // code written in the block is going to execute when if-condition(s) result into false
         * }
         *
         * Java reviews the given if-condition(s),
         *  if condition(s) result into true -> Java enters in the if-block; executes the code written in it and ignore below else-if and else-block (if present)
         *  if condition(s) result into false -> Java reviews the next condition(s) mentioned with 1st else-if block.
         *
         *  if condition(s) result into true ->  Java enters in that else-if-block; executes the code written in it and ignore below else-if and else-block (if present)
         *  if condition(s) result into false -> Java reviews the next condition(s) mentioned with 2nd else-if block.
         *
         * and so no....
         *
         * when all condition(s) mentioned with if or else-if blocks are false -> Java automatically enters in the else-block (if present)
         *
         */

        System.out.println("\nif_else-if_else block");
//        countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
//        System.out.println("countryName -> " + countryName);
        System.out.println("Print message based on dayName");
        /**
         * if dayName is Sunday or Wednesday -> Print "Join the session"
         * if dayName is Monday or Thursday -> Print "Revise session"
         * if dayName is Tuesday or Friday -> Print "Perform and submit homework"
         * if dayName is Saturday -> Print "Have fun"
         * if user enters incorrect dayName -> Print "Please enter correct day-name"
         */
        String dayName = "tUEsDaY";

        if (dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Join the session");
        } else if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("Revise session");
        } else if (dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Perform and submit homework");
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Have fun");
        } else {
            System.out.println("Please enter correct day-name");
        }

        System.out.println("Outside the if_else-if_else block");




        /**
         * NOTE:
         * else-if block and else-block are OPTIONAL with if-block
         * (add else-if or else blocks if needed on your code scenario)
         */



    }
}
