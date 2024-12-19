package Class3;

public class JavaOperators_Comparison {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * Comparison (>, <, >=, <=, ==, !=)
         *
         * >    :   is Greater than
         * <    :   is Less than
         * >=   :   is Greater than or Equals to
         * <=   :   is Less Than or Equals to
         * ==   :   is Equals to
         * !=   :   is NOT Equals to
         *
         * is 5 > 7             -> true/false (boolean)
         * is myHeight == 6ft   -> true/false (boolean)
         *
         * Result of every comparison operation is always going to be a boolean
         *
         */

        int num1 = 34, num2 = 34;
        String name = "John Doe";

        boolean num2GrNum1 = num2 > num1;       // false
        System.out.println("is "+num2+" greater than "+num1+"? : "+num2GrNum1);

        boolean num2LeNum1 = num2 < num1;       // false
        System.out.println("is "+num2+" less than "+num1+"? : "+num2LeNum1);

        boolean num2GrEqNum1 = num2 >= num1;    // true
        System.out.println("is "+num2+" greater than or equals to "+num1+"? : "+num2GrEqNum1);

        boolean num2LeEqNum1 = num2 <= num1;    // true
        System.out.println("is "+num2+" less than or equals to "+num1+"? : "+num2LeEqNum1);

        boolean num2EqNum1 = num2 == num1;      // true
        System.out.println("is "+num2+" equals to "+num1+"? : "+num2EqNum1);

        boolean num2NtEqNum1 = num2 != num1;    // false
        System.out.println("is "+num2+" not equals to "+num1+"? : "+num2NtEqNum1);










    }
}
