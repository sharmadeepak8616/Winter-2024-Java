package Class4;

public class JavaOperators_Logical {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * Logical (&&, ||, !)
         *
         * we use logical operators to join two or more conditions/comparisons
         * && (and-operator)
         *  if left-and-right sides of comparisons result to true, &&-operator results into true
         *  if any side of comparisons results to false, &&-operator results into false
         *
         * || (or-operator)
         *  if any side of comparisons results to true, ||-operator results into true
         *  if left-and-right sides of comparisons result to false, ||-operator results into false
         *
         * ! (not-operator)
         *  makes true into false and vice-versa
         */

        /**
         * Bank Data: is customer has credit score greater than 650
         */
        int customerCreditScore = 660;

        boolean isCustomerCS_GreaterThan650 = customerCreditScore > 650;
        /**
         * to store boolean-type value, variable should be boolean-datatype
         */

        System.out.println("Customer credit score: " + customerCreditScore);
        System.out.println("is Customer credit score greater than 650: " + isCustomerCS_GreaterThan650);

        customerCreditScore = 670;
        int customerAge = 20;
        /**
         * Bank Data: is customer has credit score greater than 650 and age greater than or equals to 30
         *
         */
        boolean isAndExample = customerCreditScore > 650 && customerAge >= 30;
        System.out.println(customerCreditScore+" > 650 && "+customerAge+" >= 30 -> " + isAndExample);
        /*
            customerCreditScore > 650 && customerAge >= 30
            670 > 650 && 20 >= 30
            true && false
            false
         */

        /**
         * Bank Data: is customer has credit score greater than 650 or age greater than or equals to 30
         */
        boolean isOrExample = customerCreditScore > 650 || customerAge >= 30;
        System.out.println(customerCreditScore+" > 650 || "+customerAge+" >= 30 -> " + isOrExample);
        /*
            customerCreditScore > 650 || customerAge >= 30
            670 > 650 || 20 >= 30
            true || false
            true
         */

        boolean isNotExample = customerCreditScore > 650 && !(customerAge >= 30);
        System.out.println(customerCreditScore+" > 650 && !("+customerAge+" >= 30) -> " + isNotExample);
        /*
            customerCreditScore > 650 && !(customerAge >= 30)
            670 > 650 && !(20 >= 30)
            true && !(false)
            true && true
            true
         */





















    }
}
