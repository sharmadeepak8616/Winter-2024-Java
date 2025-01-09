package Class9;

public class ConditionalCode_Concept_2 {
    public static void main(String[] args) {
        /**
         * Conditional Code (Conditional block, Conditional loops):
         * 1. if-else block
         * 2. switch block
         *
         */
        /**
         * switch-block
         *
         * If all below conditions are true in your case, then you can use switch-block as well.
         *  1. all conditions are related to only ONE variable
         *  2. all conditions must check equals or equalsIgnoreCase
         *  3. every scenario either has only ONE condition, or if multiple conditions then combined with OR operator
         *
         */
        /**
         * Syntax for switch-block:
         *
         * switch (variableName) {
         *      case value1:
         *          // case block
         *          // if variableName-value is equals to value1, Java enters in this case-block
         *          // then executes code written in it
         *          // NOTE: it ignores all other case-block
         *          break;  // defines the end of case-block
         *      case value2:
         *          // case block
         *          // if variableName-value is equals to value2, Java enters in this case-block
         *          // then executes code written in it
         *          // NOTE: it ignores all other case-block
         *          break;  // defines the end of case-block
         *      case value3:
         *          // case block
         *          // if variableName-value is equals to value3, Java enters in this case-block
         *          // then executes code written in it
         *          // NOTE: it ignores all other case-block
         *          break;  // defines the end of case-block
         *      default:
         *          // default block
         *          // if variableName-value is NOT equals to any above case-values, Java enters in this default-block
         *          // then executes code written in it
         * }
         */

        /**
         * Question:
         * based on value of num-variable, print the statement
         *
         * if num equals to 5, print "num is five"
         * if num equals to 7, print "num is seven"
         * if num equals to 14, print "num is fourteen"
         * if num equals to 23, print "num is twenty three"
         * if num is not equals to any above value, print the value of num
         */
        System.out.println("\nbased on value of num-variable, print the statement");
        int num = 7;

        System.out.println("\nUsing if-else");
        if (num == 5) {
            System.out.println("num is five");
        } else if (num == 7) {
            System.out.println("num is seven");
        } else if (num == 14) {
            System.out.println("num is fourteen");
        } else if (num == 23) {
            System.out.println("num is twenty three");
        } else {
            System.out.println("num = " + num);
        }

        /**
         *  1. all conditions are related to only ONE variable (Yes)
         *  2. all conditions must check equals or equalsIgnoreCase (Yes)
         *  3. every scenario either has only ONE condition, or if multiple conditions then combined with OR operator
         *      (Yes)
         */
        System.out.println("\nUsing switch");

        switch (num) {
            case 5:
                System.out.println("num is five");
                break;
            case 7:
                System.out.println("num is seven");
                break;
            case 14:
                System.out.println("num is fourteen");
                break;
            case 23:
                System.out.println("num is twenty three");
                break;
            default:
                System.out.println("num = " + num);
        }

        System.out.println("\nPrint message based on dayName");
        System.out.println("Using switch");
        /**
         * if dayName is Sunday or Wednesday -> Print "Join the session"
         * if dayName is Monday or Thursday -> Print "Revise session"
         * if dayName is Tuesday or Friday -> Print "Perform and submit homework"
         * if dayName is Saturday -> Print "Have fun"
         * if user enters incorrect dayName -> Print "Please enter correct day-name"
         */
        String dayName = "suNDay";

        /**
         *  1. all conditions are related to only ONE variable - Yes
         *  2. all conditions must check equals or equalsIgnoreCase - Yes
         *  3. every scenario either has only ONE condition, or if multiple conditions then combined with OR operator
         *      - Yes
         */
        switch (dayName.toLowerCase()) {
            case "sunday":
            case "wednesday":
                System.out.println("Join the session");
                break;
            case "monday":
            case "thursday":
                System.out.println("Revise session");
                break;
            case "tuesday":
            case "friday":
                System.out.println("Perform and submit homework");
                break;
            case "saturday":
                System.out.println("Have fun");
                break;
            default:
                System.out.println("Please enter correct day-name, entered dayName is '"+dayName+"'");
        }

        System.out.println("Question: Print statement based on username-value");

        /**
         * if username equals to Happy
         *      print "Good name"
         * if username equals to Joy
         *      print the name and it's length
         *      print "You name is too short"
         * if username equals to John
         *      print the name is Uppercase
         * if username is noe of the above
         *      print "You have a different name than what we expected"
         *
         */
        String username = "Joy";

        System.out.println("\nif-else");
        if (username.equals("Happy")) {
            System.out.println("Good name");
        } else if (username.equals("Joy")) {
            System.out.println("Username -> " + username);
            System.out.println("Username length -> " + username.length());
            System.out.println("You name is too short");
        } else if (username.equals("John")) {
            System.out.println("Username in uppercase -> " + username.toUpperCase());
        } else {
            System.out.println("You have a different name than what we expected");
        }

        /**
         *  1. all conditions are related to only ONE variable - Yes
         *  2. all conditions must check equals or equalsIgnoreCase - Yes
         *  3. every scenario either has only ONE condition, or if multiple conditions then combined with OR operator
         *      - Yes
         */
        System.out.println("\nswitch");
        switch (username) {
            case "Happy":
                System.out.println("Good name");
                break;
            case "Joy":
                System.out.println("Username -> " + username);
                System.out.println("Username length -> " + username.length());
                System.out.println("You name is too short");
                break;
            case "John":
                System.out.println("Username in uppercase -> " + username.toUpperCase());
                break;
            default:
                System.out.println("You have a different name than what we expected");
        }
    }
}
