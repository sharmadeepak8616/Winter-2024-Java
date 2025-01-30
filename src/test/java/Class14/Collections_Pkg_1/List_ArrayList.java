package Class14.Collections_Pkg_1;

import java.util.ArrayList;

public class List_ArrayList {
    public static void main(String[] args) {
        /**
         * Limitations of Array:
         * 1. In order of create an Array, we have to know either
         *      a) what are the values which you want to store in the array
         *          or,
         *      b) how many values you want to store in the array
         *      Collections allows us to create a new collections even if we don't have above information.
         *
         * 2. Array length is fixed.
         *      Collections expand/contract as we add/remove values.
         *
         * 3. Array can store multiple value but ONLY of same datatype
         *      Collections can store one or more values of multiple datatypes.
         *
         * --> Collection (ArrayList) can be used instead Array to overcome the limitations of Array.
         */

        /**
         * Methods in ArrayList/List:
         *      size()
         *      add()
         *      remove()
         */

        /**
         *
         * ArrayList:
         *  is a non-primitive datatype
         *  can store multiple values of same or multiple datatype
         *
         *  -> ArrayList maintains the order of insertion/addition
         *      ArrayList stores the added values in linear manner in memory to maintain order of insertion.
         */
        /**
         * Syntax to create ArrayList/List:
         *
         * ArrayList<WrapperClass> myArrayList = new Arraylist<>();
         *      OR
         * List<WrapperClass> myList = new Arraylist<>();
         *
         * WrapperClass: Class which represents the primitive datatype.
         * int      ->      Integer
         * double   ->      Double
         * char     ->      Character
         * String   ->      String
         * boolean  ->      Boolean
         *
         * Depending upon the type of values we want to store in ArrayList/List,
         *  use respective WrapperClass while creating the ArrayList/List.
         *
         * NOTE: if you are trying to create an ArrayList/List to store values of MULTIPLE datatype
         * use: Object as WrapperClass
         */
        // Create an ArrayList to store names of student for batch2027
        ArrayList<String> student2027List = new ArrayList<>();      // []
        System.out.println("student2027List -> " + student2027List);

        /**
         * To find the length of ArrayList/List:
         * method: size()
         * return-type: int
         *
         * The method returns the number of values stored in ArrayList/List
         */
        System.out.println("\nmethod - size()");
        int student2027ListSize = student2027List.size();
        System.out.println("student2027ListSize -> "+ student2027ListSize);     // 0
        System.out.println("student2027List -> "+ student2027List);             // []

        /**
         * To add value in ArrayList/List
         * method: add()
         * input: the value which we want to add
         *
         * -> newValue is going to store at next available index in ArrayList/List
         * -> using add-method, we can add ONLY one value at a time.
         * -> ArrayList/List maintains the order of insertion; it will store values in memory in the same order as we added them
         */

        student2027List.add("John");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("LuX");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
        student2027List.add("Jia Lis");
        student2027List.add("King");
        student2027List.add("QUEEN");
        student2027List.add("Dime");

        System.out.println("\nmethod - add()");
        System.out.println("student2027ListSize -> "+ student2027List.size());      // 16
        System.out.println("student2027List -> "+ student2027List);
        // [John, KenDRa, JOHN, JIa, MichAEl, LuX, John, Kendra, Jia, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]

        /**
         * To remove a value from ArrayList/List
         * method: remove()
         *
         *  -> we can remove ONLY one value at a time by using remove()-method.
         *
         * usage:
         *      1. by providing the index-number from which we want to remove the value.
         *      2. by providing the value which we want to remove.
         */
        /**
         * if using remove()-method as #1. by providing the index-number from which we want to remove the value.
         *
         * if the given index-number is within the valid range (0 to lastIndexNumber)
         *      method will remove the value from given index-number and returns the removed-value
         * else
         *      IndexOutOfBoundsException
         *
         */
        System.out.println("method - remove() as #1. by providing the index-number from which we want to remove the value.");
        String removedFromIndex2 = student2027List.remove(2);
        System.out.println("Removed value from index-2 : " + removedFromIndex2);    // JOHN
        // [John, KenDRa, JIa, MichAEl, LuX, John, Kendra, Jia, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]

        String removedFromIndex5 = student2027List.remove(5);
        System.out.println("Removed value from index-5 : " + removedFromIndex5);    // John
        // [John, KenDRa, JIa, MichAEl, LuX, Kendra, Jia, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 14
        System.out.println("student2027List -> "+ student2027List);
        // [John, KenDRa, JIa, MichAEl, LuX, Kendra, Jia, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]

        /**
         * if using remove()-method as #2. by providing the value which we want to remove.
         *
         * if the given value is EXACTLY found in the ArrayList/List
         *      method will remove the FIRST OCCURRENCE of the value and returns true
         * else
         *      method will return false
         */
        System.out.println("method - remove() as #2. by providing the value which we want to remove.");
        boolean isRemoved_JOHN = student2027List.remove("JOHN");        // false
        System.out.println("is 'JOHN' removed successfully? : " + isRemoved_JOHN);

        boolean isRemoved_Jia = student2027List.remove("Jia");          // true
        System.out.println("is 'Jia' removed successfully? : " + isRemoved_Jia);
        // [John, KenDRa, JIa, MichAEl, LuX, Kendra, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]

        boolean isRemoved_Lis = student2027List.remove("Lis");          // false
        System.out.println("is 'Lis' removed successfully? : " + isRemoved_Lis);

        boolean isRemoved_JIa = student2027List.remove("JIa");          // true
        System.out.println("is 'JIa' removed successfully? : " + isRemoved_JIa);
        // [John, KenDRa, MichAEl, LuX, Kendra, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]

        boolean isRemoved_King = student2027List.remove("King");         // true
        System.out.println("is 'King' removed successfully? : " + isRemoved_King);
        // [John, KenDRa, MichAEl, LuX, Kendra, John, JIa, Jia John, Jia Lis, QUEEN, Dime]

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 11
        System.out.println("student2027List -> "+ student2027List);
        // [John, KenDRa, MichAEl, LuX, Kendra, John, JIa, Jia John, Jia Lis, QUEEN, Dime]


    }
}
