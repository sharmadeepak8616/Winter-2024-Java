package Class4;

public class JavaOperators_Ternary {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * 6. Ternary (?:)
         *      used in a situation when we have TWO values to assign to a variable.
         *      But, which particular value to be assigned to variable depends on result of condition(s)
         *
         */
        /**
         * Syntax:
         * variable = condition(s) ? valueToAssignIfConditionTrue : valueToAssignIfConditionFalse;
         */
        int customerCreditScore = 670;
        double mortgageRate = 0.0;
        /**
         * Bank offer: if customer credit score is greater than 650,
         *                  give mortgage rate as 6.0; otherwise 7.0
         */
        System.out.println("\nif customer credit score is greater than 650");
        mortgageRate = customerCreditScore > 650 ? 6.0 : 7.0;
        System.out.println("Customer credit score : " + customerCreditScore);
        System.out.println("Mortgage rate : " + mortgageRate);

        int customerAge = 38;
        /**
         * Bank offer: if customer credit score is greater than 650 and has age 35 or more,
         *                  give mortgage rate as 6.0; otherwise 7.0
         */
        System.out.println("\nif customer credit score is greater than 650 and has age 35 or more");
        mortgageRate = customerCreditScore > 650 && customerAge >= 35 ? 6.0 : 7.0;

        System.out.println("Customer credit score : " + customerCreditScore);
        System.out.println("Customer age : " + customerAge);
        System.out.println("Mortgage rate : " + mortgageRate);


    }
}
