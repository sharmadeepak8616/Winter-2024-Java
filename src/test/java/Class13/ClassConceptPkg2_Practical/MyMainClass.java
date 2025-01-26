package Class13.ClassConceptPkg2_Practical;

import java.util.Arrays;

/**
     * If you want to use a method which is present in another class
     * 1. check if the method (which you want to use) is static or not
     * 2. if static
     *         use className (in which method is present) to access the method.
     *         like: className.methodName
     *    if NOT static
     *         use classObject (of the Class in which method is present) to access the method.
 *             -> create classObject (if already not created) in the class where you want to use/access the method.
 *              Syntax to create classObject --> ClassName objectVariableName = new ClassName();
     *         like: classObjectName.methodName
     */
public class MyMainClass {
    public static void main(String[] args) {
        // welcome user which has username is "King KoNg"
        // welcome() from MyMethods_Misc-Class
        System.out.println("Welcome user with username as \"King KoNg\"");
        MyMethods_Misc miscObject = new MyMethods_Misc();
        miscObject.welcome("King KoNg");

        // Find the first word which contains "e" in below array
        String[] words = {"joy", "happy", "king", "learn", "meet"};
        // eFinder() from MyMethods_Array-Class
        System.out.println("\nFind the first word which contains \"e\" in below array");
        String wordWithE = MyMethods_Array.eFinder(words);
        System.out.println("Array -> " + Arrays.toString(words));
        System.out.println("Word -> " + wordWithE);

        // Find the total of given array
        int[] numbers = {45, 78, 12, 90, 34, 75};
        MyMethods_Array arrayObject = new MyMethods_Array();
        int result = arrayObject.getArrayTotal(numbers);
        System.out.println("\nFind the total of given array");
        System.out.println("Array -> " + Arrays.toString(numbers));
        System.out.println("Total -> " + result);

        int[] numbers1 = {10, 2, 3, -2, -3};
        int result1 = arrayObject.getArrayTotal(numbers1);
        System.out.println("\nFind the total of given array");
        System.out.println("Array -> " + Arrays.toString(numbers1));
        System.out.println("Total -> " + result1);

        // Reverse given array
        int[] myArray = {45, 78, 12, 90, 34, 75};
        int[] reverseArray = MyMethods_Array.reverseArray(myArray);
        System.out.println("\nReverse given array");
        System.out.println("Array -> " + Arrays.toString(myArray));
        System.out.println("Array (reverse) -> " + Arrays.toString(reverseArray));





    }
}
