package Class7;

import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        /**
         * Array:
         *  is a non-primitive datatype
         *  can store multiple values of SAME datatype
         */
        /**
         * Things to know before creating an array:
         * 1. what will be the datatypes of values that you want to store in the array
         * 2. a) what are the values which you want to store in the array
         *      OR
         * 2. b) how many values you want to store in the array
         *
         * if 1 and 2a:
         *      ans1[] arrayName = {ans2a by comma-separated};
         *      datatype[] arrayName = {value1, value2, value3, value4};
         *      // creates an array of given datatype with given values stored in it
         *
         * if 1 and 2b:
         *      ans1[] arrayName = new ans1[ans2b];
         *      datatype[] arrayName = new datatype[totalNumberOfValues];
         *      // creates an empty array of given datatype which can store given number of values of mentioned datatype
         *
         */
        /**
         * store top 5 company names of 2025 -> an array which can store 5-string values
         * 1. what will be the datatypes of values that you want to store in the array -> String
         * 2. a) what are the values which you want to store in the array -> X
         *      OR
         * 2. b) how many values you want to store in the array -> 5
         * 1 and 2b
         */
        String[] top5Companies2025 = new String[5]; // top5Companies2025 = [  ,  ,  ,  ,  ]
         /**
          * store top 3 bill amount from yesterday's shopping -> an array which can store 3-double values
          * 1. what will be the datatypes of values that you want to store in the array -> double
          * 2. a) what are the values which you want to store in the array -> 213.23, 198.0, 115.67
          *      OR
          * 2. b) how many values you want to store in the array -> 3
          * 1 and 2a
          */
        double[] top3Bills = {213.23, 198.0, 115.67}; // top3Bills = [213.23, 198.0, 115.67]

        /**
         * To print entire array
         */
        System.out.println("top5Companies2025 -> " + Arrays.toString(top5Companies2025));
        System.out.println("top3Bills -> " + Arrays.toString(top3Bills));

        /**
         * Index concept in array
         *
         * top5Companies2025 = [  ,  ,  ,  ,  ] = total values that can be stored = 5 (array length = 5)
         *                      0   1  2  3  4
         *
         *
         * top3Bills = {213.23, 198.0, 115.67} = (total values that can be stored = 3 ( array length = 3)
         *                0       1       2
         */

        /**
         * Fill or Replace values in array using index-numbers
         *
         * arrayName[indexNumber] = value;
         */
        System.out.println("\nFill or Replace values in array using index-numbers");
        top5Companies2025[2] = "Cisco";     // [ , ,"Cisco", , ]
        top5Companies2025[0] = "Apple";     // ["Apple", ,"Cisco", , ]
        top5Companies2025[1] = "Amazon";    // ["Apple", "Amazon,"Cisco", , ]
        top5Companies2025[4] = "Google";    // ["Apple", "Amazon,"Cisco", ,"Google"]
        top5Companies2025[3] = "Apple";     // ["Apple", "Amazon,"Cisco","Tesla","Google"]

        System.out.println("top5Companies2025 -> " + Arrays.toString(top5Companies2025));
        System.out.println("top3Bills -> " + Arrays.toString(top3Bills));

        /**
         * To get the value stored at particular-index in the array
         * arrayName[indexNumber]
         *
         * top3Bills[1] -> represents (gets) the value present at index-1 in top3Bills-Array
         *
         */
        System.out.println("\nTo get the value stored at particular-index in the array");
        double index1BillAmount = top3Bills[1];
        System.out.println("Bill amount stored at index-1 is $" + index1BillAmount);

        /**
         * To find the total number of values that can be stored in array( in simple words, to find length of Array)
         * property: length
         *
         */
        System.out.println("\nArray length");
        int top3BillsLength = top3Bills.length;
        System.out.println("Length of top3BillsLength -> " + top3BillsLength);

        int top5Companies2025Length = top5Companies2025.length;
        System.out.println("Length of top5Companies2025Length -> " + top5Companies2025Length);

        int[] ssnData = new int[10];
        /**
         *      Array -> [ , , , , , , , , , ]
         *      index ->  0 1 2 3 4 5 6 7 8 9
         */
        int ssnDataLength = ssnData.length;
        System.out.println("Length of ssnData-Array -> " + ssnDataLength);











    }
}
