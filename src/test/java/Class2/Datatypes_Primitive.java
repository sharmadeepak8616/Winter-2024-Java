package Class2;

public class Datatypes_Primitive {
    public static void main(String[] args) {

        /**
         * byte: is a primitive datatype.
         *          can be used to store only whole number ranging from -128 to 127
         */

        /**
         * short: is a primitive datatype.
         *          can be used to store only whole number ranging from -32,768 to 32,767
         */

        /**
         * int: is a primitive datatype.
         *          can be used to store only whole number ranging from -2,147,000,000 to 2,147,000,000
         *
         * By default, Java treats every whole number as int
         * In general, we use int-variable to store whole number
         */

        /**
         * long: is a primitive datatype.
         *          can be used to store only whole number ranging from
         *              -9,000,000,000,000,000,000, to 9,000,000,000,000,000,000
         *
         * To store any value as long-datatype in java-memory or to inform java to treat value as long
         *  we need to add L after the value
         *
         * L is an indicator for Java to treat value as Long instead int
         */
        long population = 88982398237L;
        System.out.println("Population is "+population);

        /**
         * double: is a primitive datatype.
         *          can be used to store decimal-point number
         *          can show upto 16-digits after decimal-point
         *
         * By default, Java treats every decimal-point number as double
         * In general, we use double-variable to store decimal-point number
         */

        /**
         * float: is a primitive datatype.
         *          can be used to store decimal-point number
         *          can show upto 8-digits after decimal-point
         *
         * To store any value as float-datatype in java-memory or to inform java to treat value as float
         *  we need to add f after the value
         *
         * f is an indicator for Java to treat value as float instead double
         */
        float height = 2.3f;

        /**
         * char: is a primitive datatype
         *      can store only single-character of anything
         *
         * -> value must be enclosed in single-quotes
         */
        char grade = 'A';
        char abcd = '1';

        /**
         * boolean: is a primitive datatype
         *      can store either true or false
         */
        boolean isItRaining = false;    // true
        boolean canIVote = true;

        // Java Operators


    }
}
