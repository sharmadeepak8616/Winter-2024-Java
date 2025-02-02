package Class15.Collections_Pkg_2;

import java.util.ArrayList;

public class List_ArrayList_2 {
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
         * Methods in ArrayList/List covered in Class14/Collections_Pkg_1/List_ArrayList.java:
         *      size()
         *      add()
         *      remove()
         *
         * Methods in ArrayList/List:
         *      get()
         *      set()
         *      indexOf()
         *      lastIndexOf()
         *      contains()
         *      isEmpty()
         *      clear()
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
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("John");
        student2027List.add("Kendra");
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
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
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

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);
        /*
            [John, KenDRa, JOHN, JIa, MichAEl, LuX, John, Kendra, Jia, John, JIa, Jia John,
            Jia Lis, King, QUEEN, Dime, KenDRa, JOHN, JIa, MichAEl, John, Kendra, John, KenDRa,
            JOHN, JIa, MichAEl, LuX, John, Kendra, Jia, John, Jia, John, JIa, Jia John, John,
            Kendra, Jia, John, JIa, Jia John, Jia Lis, King, QUEEN, Dime]
         */

        /**
         * To get the value present at a specific index
         * method: get()
         * input: index-number
         *
         * if the given index-number is within the valid range (0 to last-index-number)
         *      method will return th copy of value stored at the given index-number
         * else
         *      method throw exception (IndexOutOfBoundsException)
         */
        System.out.println("\nmethod - get()");

        String nameAtIndex4 = student2027List.get(4);
        System.out.println("Student name at index-4 : " + nameAtIndex4);

        String nameAtIndex11 = student2027List.get(11);
        System.out.println("Student name at index-11 : " + nameAtIndex11);

        String nameAtIndex24 = student2027List.get(24);
        System.out.println("Student name at index-24 : " + nameAtIndex24);

        // String nameAtIndex46 = student2027List.get(46);
        // System.out.println("Student name at index-46 : " + nameAtIndex46);

        // print the name of student stored at last-index-number
        int lastIndexNumber = student2027List.size() - 1;
        String nameAtIndexLastNumber = student2027List.get(lastIndexNumber);
        System.out.println("Student name at index-last-number : " + nameAtIndexLastNumber);

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         * To replace a value present at a specific index with new-value
         * method: set()
         * input: index-number, new-value
         *
         * if the given index-number is within the valid range (0 to last-index-number)
         *      method will replace the present-value at the index with new-value, and return the replaced-value
         * else
         *      method throw exception (IndexOutOfBoundsException)
         */
        System.out.println("\nmethod - set()");

        String oldValueAtIndex5 = student2027List.set(5, "Liya RIma");
        System.out.println("Old value at index-5 : " + oldValueAtIndex5);

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        String valueAt16 = student2027List.get(16);
        System.out.println("Present value at index-16 : " + valueAt16);

        String oldValueAtIndex16 = student2027List.set(16, "Nina");
        System.out.println("Old value at index-16 : " + oldValueAtIndex16);

        String valueAt16Now = student2027List.get(16);
        System.out.println("Present value at index-16 : " + valueAt16Now);

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         *To find the index of FIRST OCCURRENCE of given value in ArrayList/List
         * method: indexOf()
         *
         * if the given value is EXACTLY present at any given index-number in ArrayList/List
         *      method will return the index-number of FIRST OCCURRENCE of the given value
         * else
         *     method will return -1
         */
        System.out.println("\nmethod - indexOf()");

        int indexOf_JOHN = student2027List.indexOf("JOHN");
        System.out.println("First occurrence of 'JOHN' is present at index -> " + indexOf_JOHN);

        int indexOf_JIA = student2027List.indexOf("JIA");
        System.out.println("First occurrence of 'JIA' is present at index -> " + indexOf_JIA);

        int indexOf_RIma = student2027List.indexOf("RIma");
        System.out.println("First occurrence of 'RIma' is present at index -> " + indexOf_RIma);

        int indexOf_Kendra = student2027List.indexOf("Kendra");
        System.out.println("First occurrence of 'Kendra' is present at index -> " + indexOf_Kendra);

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         *To find the index of LAST OCCURRENCE of given value in ArrayList/List
         * method: lastIndexOf()
         *
         * if the given value is EXACTLY present at any given index-number in ArrayList/List
         *      method will return the index-number of LAST OCCURRENCE of the given value
         * else
         *     method will return -1
         */
        System.out.println("\nmethod - lastIndexOf()");

        int lastIndexOf_JOHN = student2027List.lastIndexOf("JOHN");
        System.out.println("Last occurrence of 'JOHN' is present at index -> " + lastIndexOf_JOHN);

        int lastIndexOf_JIA = student2027List.lastIndexOf("JIA");
        System.out.println("Last occurrence of 'JIA' is present at index -> " + lastIndexOf_JIA);

        int lastIndexOf_RIma = student2027List.lastIndexOf("RIma");
        System.out.println("Last occurrence of 'RIma' is present at index -> " + lastIndexOf_RIma);

        int lastIndexOf_Kendra = student2027List.lastIndexOf("Kendra");
        System.out.println("Last occurrence of 'Kendra' is present at index -> " + lastIndexOf_Kendra);

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         * To find if a given value is EXACTLY present at any index-number if ArrayList/List
         * method: contains()
         *
         * if the given-value is EXACTLY present at any index-number in ArrayList/List
         *      method will return true
         * else
         *      method will return false
         *
         */
        System.out.println("\nmethod - contains()");

        boolean isContains_RIma = student2027List.contains("RIma");
        System.out.println("is student2027List contains 'RIma' : " + isContains_RIma);

        boolean isContains_JOHN = student2027List.contains("JOHN");
        System.out.println("is student2027List contains 'JOHN' : " + isContains_JOHN);

        boolean isContains_Jia_John = student2027List.contains("Jia John");
        System.out.println("is student2027List contains 'Jia John' : " + isContains_Jia_John);

        boolean isContains_JIA = student2027List.contains("JIA");
        System.out.println("is student2027List contains 'JIA' : " + isContains_JIA);

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         * To check/find if ArrayList/List is empty
         * method: isEmpty()
         *
         * if ArrayList/List has no value in it (means size is equals to 0)
         *      method will return true
         * else
         *      method will return false
         */
        System.out.println("\nmethod - isEmpty()");

        boolean isStudent2027ListEmpty = student2027List.isEmpty();
        System.out.println("is student2027List empty? -> " + isStudent2027ListEmpty);
        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         * To clear/empty your ArrayList/List (or to remove ALL values from ArrayList/List)
         * method: clear()
         */
        System.out.println("\nmethod - clear()");

        student2027List.clear();
        System.out.println("Clearing student2027List");

        boolean isStudent2027ListEmpty_AfterClear = student2027List.isEmpty();
        System.out.println("\nis student2027List empty (after using clear-method)? -> " + isStudent2027ListEmpty_AfterClear);
        System.out.println("student2027ListSize -> "+ student2027List.size());      // 0
        System.out.println("student2027List -> "+ student2027List);

        /**
         * ************************************************************************************
         * Create ArrayList to store multiple values of different datatypes
         * ************************************************************************************
         */

        ArrayList<Object> multiTypeValuesArrayList = new ArrayList<>();
        multiTypeValuesArrayList.add("Queen");
        multiTypeValuesArrayList.add(2);
        multiTypeValuesArrayList.add(10.2);
        multiTypeValuesArrayList.add(true);
        multiTypeValuesArrayList.add('a');

        System.out.println("\n\nArrayList with multiple datatypes -> " + multiTypeValuesArrayList);




    }
}
