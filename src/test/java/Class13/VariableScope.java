package Class13;

public class VariableScope {
    /**
     * Types of Variables:
     *
     * 1. Local Variables
     *      Variables which we create inside a method.
     *
     * 2. Field Variables (Global Variables, Class Variables)
     *      Variables which we create inside the Class but outside ALL methods
     *      scope: entire class
     *      When we want to use a variable in multiple methods of same class, we create it as a Field-Variable.
     *
     * 3. Final Variable (Constant Variable)
     *      Once the value is assigned in the variable, it cannot be reassigned.
     *      Final variable can be Field or Local variable.
     *      -> to create final variable, we use "final" keyword when creating the variable.
     */
    /**
     * Scope of a variable depends on where the variable is created
     */

    final int wtcZipCode = 12345;    // Field Variable
    final String dollarSymbol = "$";

    public static void main(String[] args) {

        final int n = 20;       // we cannot reassign value in n-variable.

        int a = 10;     // created in main-method , means I can use this variable anywhere within main-method

        if (a == 20) {
            String name = "John";       // name is created in if-block, means we can use it inside the if-block
            System.out.println(name);
        } else {
            double dValue = 10.01;
            System.out.println(dValue);
        }

    }

    public void normalMethod() {
        int b = 10;
        System.out.println(b);

        String name = "King";
        System.out.println(name);
    }

}
