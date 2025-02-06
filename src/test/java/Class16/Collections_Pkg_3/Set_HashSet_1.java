package Class16.Collections_Pkg_3;

import java.util.HashSet;

public class Set_HashSet_1 {
    public static void main(String[] args) {
        /**
         * HashSet:
         *     is a non-primitive datatype
         *     can store multiple UNIQUE values of same or multiple datatype
         *     (HashSet canNOT store duplicate values)
         */
        /**
         * HashSet vs ArrayList
         *
         * 1. HashSet does NOT store duplicate values
         *     if we try to add duplicate value, it will simply ignore it.
         *
         * 2. HashSet uses Hashing technique to store a value in memory
         *    ArrayList uses sequential technique to store value in memory
         *      due to this,
         *          a. HashSet does NOT maintain the order of insertion (means it has NO concept) of index
         *             ArrayList maintains the order of insertion
         *          b. There is NO concept of index in HashSet
         *             ArrayList has the concept of index.
         */
        /**
         * Syntax to create HashSet/Set:
         *
         * HashSet<WrapperClass> myHashSet = new HashSet<>();
         *      OR
         * Set<WrapperClass> mySet = new HashSet<>();
         *
         * WrapperClass: Class which represents the primitive datatype.
         * int      ->      Integer
         * double   ->      Double
         * char     ->      Character
         * String   ->      String
         * boolean  ->      Boolean
         *
         * Depending upon the type of values we want to store in HashSet/Set,
         *  use respective WrapperClass while creating the HashSet/Set.
         *
         * NOTE: if you are trying to create an HashSet/Set to store values of MULTIPLE datatype
         * use: Object as WrapperClass
         */

        /**
         * Methods in HashSet/Set:
         *      size()
         *      add()
         *      remove()
         *      contains()
         *      isEmpty()
         *      clear()
         */
        // ArrayList, HashSet, Array
        /*
            store names of student for batch2027 -> ArrayList<String>
            store temp values for this week -> ArrayList<Double>
            EmailAddress of batch2027 -> HashSet<String>
         */

        HashSet<String> emailAddressBatch2027 = new HashSet<>();    // []

        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);

        /**
         * To find the length of HashSet/Set:
         * method: size()
         * return-type: int
         *
         * The method returns the number of values stored in HashSet/Set
         */
        System.out.println("\nmethod - size()");
        int totalEmailAddresses = emailAddressBatch2027.size();
        System.out.println("Total email addresses -> " + totalEmailAddresses);
        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);

        /**
         * To add value in HashSet/Set
         * method: add()
         * input: the value which we want to add
         *
         * -> newValue is going to store
         * -> using add-method, we can add ONLY one value at a time.
         * -> HashSet/Set does NOT maintain the order of insertion
         *    bcz, it will store values in memory in the random order
         */
        emailAddressBatch2027.add("john@test.com");
        emailAddressBatch2027.add("jia@test.com");
        emailAddressBatch2027.add("JIA@test.com");
        emailAddressBatch2027.add("liY@test.com");
        emailAddressBatch2027.add("JohnJia@test.com");
        emailAddressBatch2027.add("KenDRa@test.com");
        emailAddressBatch2027.add("rome@test.com");
        emailAddressBatch2027.add("JIA@test.com");
        emailAddressBatch2027.add("AnnA@test.com");
        emailAddressBatch2027.add("Max@test.com");
        emailAddressBatch2027.add("JimmY@test.com");
        emailAddressBatch2027.add("King@test.com");
        emailAddressBatch2027.add("audrey@test.com");
        emailAddressBatch2027.add("queen@test.com");
        emailAddressBatch2027.add("Holly@test.com");
        emailAddressBatch2027.add("holly@test.com");

        System.out.println("\nmethod - add()");
        System.out.println("Total email addresses -> " + emailAddressBatch2027.size());
        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);
        /*
            [audrey@test.com, JIA@test.com, KenDRa@test.com, queen@test.com, King@test.com,
            holly@test.com, JohnJia@test.com, AnnA@test.com, Max@test.com, john@test.com,
            Holly@test.com, rome@test.com, jia@test.com, liY@test.com, JimmY@test.com]
         */

        /**
         * To remove a value from HashSet/Set
         * method: remove()
         *
         *  -> we can remove ONLY one value at a time by using remove()-method.
         *
         * usage: by providing the value which we want to remove.
         *
         * if the given value is EXACTLY found in HashSet/Set
         *      method will remove the value and return true
         * else
         *      method will return false
         */
        System.out.println("\nmethod - remove()");

        boolean is_KenDRa_Email_Removed = emailAddressBatch2027.remove("KenDRa@test.com");
        System.out.println("is 'KenDRa@test.com' removed successfully -> " + is_KenDRa_Email_Removed);  // true

        boolean is_ueen_Email_Removed = emailAddressBatch2027.remove("ueen@test.com");
        System.out.println("is 'ueen@test.com' removed successfully -> " + is_ueen_Email_Removed);      // false

        boolean is_king_Email_Removed = emailAddressBatch2027.remove("king@test.com");
        System.out.println("is 'king@test.com' removed successfully -> " + is_king_Email_Removed);      // false

        boolean is_KenDRa_Email_Removed2 = emailAddressBatch2027.remove("KenDRa@test.com");
        System.out.println("is 'KenDRa@test.com' removed successfully -> " + is_KenDRa_Email_Removed2);  // false

        System.out.println("\nTotal email addresses -> " + emailAddressBatch2027.size());
        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);

        /**
         * To find if a given value is EXACTLY present in HashSet/Set
         * method: contains()
         *
         * if the given-value is EXACTLY present in HashSet/Set
         *      method will return true
         * else
         *      method will return false
         *
         */
        System.out.println("\nmethod - contains()");
        /*
            [audrey@test.com, JIA@test.com, queen@test.com, King@test.com, holly@test.com,
            JohnJia@test.com, AnnA@test.com, Max@test.com, john@test.com, Holly@test.com,
            rome@test.com, jia@test.com, liY@test.com, JimmY@test.com]
         */

        boolean is_jia_test_com_present = emailAddressBatch2027.contains("jia@test.com");   // true
        System.out.println("does 'jia@test.com' present in emailAddressBatch2027 -> " + is_jia_test_com_present);

        boolean is_King_test_com_present = emailAddressBatch2027.contains("King@test.com"); // true
        System.out.println("does 'King@test.com' present in emailAddressBatch2027 -> " + is_King_test_com_present);

        boolean is_john_present = emailAddressBatch2027.contains("john");   // false
        System.out.println("does 'john' present in emailAddressBatch2027 -> " + is_john_present);

        boolean is_Queen_test_com_present = emailAddressBatch2027.contains("Queen@test.com");   // false
        System.out.println("does 'Queen@test.com' present in emailAddressBatch2027 -> " + is_Queen_test_com_present);

        boolean is_JimmY_test_com_present = emailAddressBatch2027.contains("JimmYtest.com");    // false
        System.out.println("does 'JimmYtest.com' present in emailAddressBatch2027 -> " + is_JimmY_test_com_present);

        System.out.println("\nTotal email addresses -> " + emailAddressBatch2027.size());
        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);

        /**
         * To check/find if HashSet/Set is empty
         * method: isEmpty()
         *
         * if HashSet/Set has no value in it (means size is equals to 0)
         *      method will return true
         * else
         *      method will return false
         */
        System.out.println("\nmethod - isEmpty()");

        boolean isEmailAddressBatch2027Empty = emailAddressBatch2027.isEmpty();
        System.out.println("is emailAddressBatch2027 empty? -> " + isEmailAddressBatch2027Empty);
        System.out.println("Total email addresses -> " + emailAddressBatch2027.size());
        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);

        /**
         * To clear/empty your HashSet/Set (or to remove ALL values from HashSet/Set)
         * method: clear()
         */
        System.out.println("\nmethod - clear()");

        emailAddressBatch2027.clear();
        System.out.println("Clearing emailAddressBatch2027");

        boolean isEmailAddressBatch2027Empty_AfterClear = emailAddressBatch2027.isEmpty();
        System.out.println("\nis student2027List empty (after using clear-method)? -> " + isEmailAddressBatch2027Empty_AfterClear);
        System.out.println("Total email addresses -> " + emailAddressBatch2027.size());
        System.out.println("Email address of batch2027 -> " + emailAddressBatch2027);

    }
}
