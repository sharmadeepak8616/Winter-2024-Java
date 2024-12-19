package Class3;

public class JavaOperators_Arithmetic {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * Arithmetic (+, -, *, /, %, ++, --)
         *
         * +    ->  Addition
         * -    ->  Subtraction
         * *    ->  Multiplication
         * /    ->  Division
         * %    ->  Modulus
         * ++   ->  Increment
         * --   ->  Decrement
         *
         */
        /**
         * 4x2 = 8
         *
         * 4/3 = 1.333 -> normal world
         * 4/3 = 1 -> coding world
         * 4.0/3 = 1.333 -> coding world
         *
         */
        /**
         * Rule: Type of values/variables involved in calculation, defines the type of result
         * 1. if ALL values/variables are int, final result will be int (means result will never have decimal-point values)
         * 2. if ANY one value/variable is double, final result will be double (means result will have decimal-point values)
         *
         */
        int myCarsCount = 1;
        int mySisCarsCount = 2;
        int myBroCarsCount = 1;

        int totalCars = myCarsCount + mySisCarsCount + myBroCarsCount;  // 4
        System.out.println("Total cars own by my family is " + totalCars);

        int num1=7, num2=18, num3=3;
        double num4=56;     // num4=56.0

        int num3PlusNum1 = num3 + num1;
        System.out.println(num3 + " + " + num1 + " = " + num3PlusNum1);

        int num2MinusNum1 = num2 - num1;
        System.out.println(num2 + " - " + num1 + " = " + num2MinusNum1);

        int num1MultiplyNum3 = num1 * num3;
        System.out.println(num1 + " * " + num3 + " = " + num1MultiplyNum3);

        double num4DivideNum3 = num4 / num3;
        System.out.println(num4 + " / " + num3 + " = " + num4DivideNum3);

        /**
         * Convert degree fahrenheit to Celsius
         *
         * cT = (fTemp − 32) × 5/9
         */
        System.out.println("\nConvert degree fahrenheit to Celsius");
        double fTemp = 32;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp+"°F is equals to "+cTemp+"°C");

        /**
         * %    ->  Modulus
         *
         *
         * Division (tell result & remaining-value without going into decimal point)
         *      16/4    ->      4 (remaining = 0)
         *      18/4    ->      4 (remaining = 2)
         *      7/2     ->      3 (remaining = 1)
         *      5/9     ->      0 (remaining = 5)
         *
         * Modulus (returns the remaining after the division)
         *      16%4    ->      0
         *      18%4    ->      2
         *      7%2     ->      1
         *      5%9     ->      5
         *
         */
        /**
         * We have 53 apples, and we would like to divide it among 3 children. How many apples will remain after equal distribution
         */
        System.out.println("\nOperator - Modulus:");
        int apples = 53;
        int numOfChildren = 3;
        int remainingApples = apples%numOfChildren;
        System.out.println("Remaining apples after distributing "+apples+" apples among "+numOfChildren+" children is : "+remainingApples);

        int number = 4536;
        // Find if the given number if divisible by 6
        System.out.println("Find if the given number("+ number+") if divisible by 6");
        int remainingValue = number % 6;
        System.out.println("remainingValue -> " + remainingValue);

        /**
         * ++   ->  Increment
         *      increments the current value in the variable by 1
         */
        System.out.println("\nOperator - Increment:");
        int inc = 13;
        System.out.println("inc = " + inc);     // 13

        // inc = inc + 1;
        /*
            inc = inc + 1
            inc = 13 + 1
            inc = 14        // 14 will get stored in inc-variable

         */
        inc++;      // increment operator increments the value in inc-variable (inc = inc + 1)
        System.out.println("inc = " + inc);     // 14
        inc++;
        System.out.println("inc = " + inc);     // 15


        /**
         * --   ->  Decrement
         *      decrements the current value in the variable by 1
         */
        System.out.println("\nOperator - Decrement:");
        int dec = 19;
        System.out.println("dec = " + dec);     // 19

        dec--;      // decrement operator decrement the value in dec-variable by 1
        System.out.println("dec = " + dec);     // 18
        dec--;
        System.out.println("dec = " + dec);     // 17
        dec++;
        System.out.println("dec = " + dec);     // 18
        dec++;
        dec++;
        System.out.println("dec = " + dec);     // 20













































    }
}
