package Class15.Collections_Pkg_2;

import java.util.ArrayList;

public class List_ArrayList_Practice {
    public static void main(String[] args) {
        /**
         *
         * To replace a given-value with new-value
         *
         * Find the number of times given value is present in ArrayList
         *
         * Check contains with ignore-case
         *
         */
        ArrayList<Double> bills = new ArrayList<>();
        bills.add(101.01);
        bills.add(89.76);
        bills.add(564.93);
        bills.add(98.65);
        bills.add(7.98);
        bills.add(23.17);
        bills.add(983.89);
        bills.add(64.83);
        bills.add(57.7);
        bills.add(101.01);
        bills.add(112.9);
        bills.add(2.32);
        bills.add(12.34);
        bills.add(98.45);
        bills.add(98.65);
        bills.add(1198.45);
        bills.add(3566.0);
        bills.add(879.09);
        bills.add(57.7);
        bills.add(23.98);
        bills.add(564.93);
        bills.add(98.65);
        bills.add(7.98);
        bills.add(23.17);
        bills.add(983.89);
        bills.add(64.83);
        bills.add(57.7);
        bills.add(101.01);
        bills.add(112.9);
        bills.add(2.32);
        bills.add(12.34);
        bills.add(98.45);
        bills.add(98.65);
        bills.add(7.98);
        bills.add(23.17);
        bills.add(983.89);
        bills.add(64.83);

        System.out.println("Bills size -> " + bills.size());
        System.out.println("Bills -> " + bills);

        /**
         * To replace a given-value with new-value
         *
         * replace 57.7 with 577.7
         *
         * -> find the index of 57.7 using indexOf()
         * -> use the found index with set()
         */
        System.out.println("\n\nreplace 57.7 with 577.7\n");
        int indexOf_57_7 = bills.indexOf(57.7);
        bills.set(indexOf_57_7, 577.7);

        System.out.println("Bills size -> " + bills.size());
        System.out.println("Bills -> " + bills);


        ArrayList<String> companyNames = new ArrayList<>();
        companyNames.add("Apple");
        companyNames.add("LogiTeCH");
        companyNames.add("appLE");
        companyNames.add("HOnDa");
        companyNames.add("tesLa");
        companyNames.add("Home DePot");
        companyNames.add("SAM");
        companyNames.add("TriPod");
        companyNames.add("DolPhin");
        companyNames.add("AdoBe");
        companyNames.add("boeIng");
        companyNames.add("Green Apple");
        companyNames.add("micROSofT");
        companyNames.add("META");
        companyNames.add("SamSung");
        companyNames.add("LogiTeCH");
        companyNames.add("appLE");
        companyNames.add("HOnDa");
        companyNames.add("tesLa");
        companyNames.add("Home DePot");
        companyNames.add("HOnDa");
        companyNames.add("tesLa");
        companyNames.add("Home DePot");
        companyNames.add("SAM");
        companyNames.add("TriPod");
        companyNames.add("DolPhin");
        companyNames.add("AdoBe");
        companyNames.add("TeSLA");
        companyNames.add("EtiHAd");
        companyNames.add("FiAT");
        companyNames.add("honDA");
        companyNames.add("APPle");
        companyNames.add("ApplEIon");
        companyNames.add("CraNE");
        companyNames.add("MicRO software");
        companyNames.add("Apple");
        companyNames.add("samsung");
        companyNames.add("Apple");
        companyNames.add("EtiHAd");
        companyNames.add("SAM");
        companyNames.add("TriPod");
        companyNames.add("DolPhin");
        companyNames.add("AdoBe");
        companyNames.add("TeSLA");
        companyNames.add("samsung");
        companyNames.add("Apple");
        companyNames.add("EtiHAd");
        companyNames.add("FiAT");
        companyNames.add("honDA");
        companyNames.add("APPle");
        companyNames.add("ApplEIon");
        companyNames.add("CraNE");
        companyNames.add("MicRO software");
        companyNames.add("Apple");


        System.out.println("\n\ncompanyNames size -> " + companyNames.size());
        System.out.println("companyNames -> " + companyNames);

        /**
         * To replace a given-value with new-value
         *
         * replace Apple with Orange
         *      -> ignore case
         *      -> replace ALL
         *
         * [Apple, LogiTeCH, appLE, HOnDa, tesLa, Home DePot, SAM]
         *
         * for, while, do-while, foreach
         *
         * for
         *      pick-index-0-value
         *      if (index-0-value equalsIgnoreCase to Apple)
         *          set(0, Orange)
         *      pick-index-1-value
         *      if (index-1-value equalsIgnoreCase to Apple)
         *          set(1, Orange)
         *      pick-index-2-value
         *      if (index-2-value equalsIgnoreCase to Apple)
         *          set(2, Orange)
         *          ...
         *          ...
         *      pick-index-last-value
         *      if (index-last-value equalsIgnoreCase to Apple)
         *          set(last, Orange)
         *
         *
         */
        System.out.println("\nReplace all instances of 'Apple' with 'Orange'");
        int replacedValueCounter = 0;
        for(int i=0 ; i<=companyNames.size()-1 ; i++) {
            // get-index-0-value
            String name = companyNames.get(i);
            // index-last-value equalsIgnoreCase to Apple
            if (name.equalsIgnoreCase("Apple")) {
                companyNames.set(i, "Orange");
                replacedValueCounter++;
            }
        }

        System.out.println("Total number of replacements done -> " + replacedValueCounter);
        System.out.println("\ncompanyNames size -> " + companyNames.size());
        System.out.println("companyNames -> " + companyNames);


        /**
         * Find the number of times given value is present in ArrayList
         *
         * -> Ignore case
         */
        /*
            [Apple, LogiTeCH, appLE, HOnDa, tesLa, Home DePot, SAM]

            int counter=0
            get-index-0-value
            if(index-0-value equals ignore case to Apple)
                counter++
            get-index-1-value
            if(index-1-value equals ignore case to Apple)
                counter++
            get-index-2-value
            if(index-2-value equals ignore case to Apple)
                counter++
            ...
            ...
            get-index-last-value
            if(index-last-value equals ignore case to Apple)
                counter++
         */

        System.out.println("\n\nFind the number of times 'TeSlA' (ignore cases) is present in companyNames-ArrayList");
        int counter=0;

        for (String name : companyNames) {
            if (name.equalsIgnoreCase("TeSlA")) {
                counter++;
            }
        }

        System.out.println("Result : " + counter);
        System.out.println("\ncompanyNames size -> " + companyNames.size());
        System.out.println("companyNames -> " + companyNames);

        /**
         * Check if companyNames-ArrayList contains 'Honda' (ignore cases)
         */
        /*
            [Apple, LogiTeCH, appLE, HOnDa, tesLa, Home DePot, SAM]
            boolean result = false

            get-index-0-value
            if(index-0-value equals ignore case to Honda)
                result = true
                Stop the loop
            get-index-1-value
            if(index-1-value equals ignore case to Apple)
                result = true
                Stop the loop
            get-index-2-value
            if(index-2-value equals ignore case to Apple)
                result = true
                Stop the loop
            ...
            ...
            get-index-last-value
            if(index-last-value equals ignore case to Apple)
                result = true
                Stop the loop

         */
        System.out.println("\nCheck if companyNames-ArrayList contains 'Honda' (ignore cases)");
        boolean result = false;
        for (String name : companyNames) {
            if (name.equalsIgnoreCase("Honda")) {
                result = true;
                break;
            }
        }

        System.out.println("does companyNames-ArrayList contain 'Honda' (ignore cases) -> " + result);
        System.out.println("\ncompanyNames size -> " + companyNames.size());
        System.out.println("companyNames -> " + companyNames);

    }
}
