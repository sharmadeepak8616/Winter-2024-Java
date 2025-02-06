package Class16.Collections_Pkg_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_HashSet {
    public static void main(String[] args) {

        /**
         * Create HashSet and fill the values from an ArrayList
         */
        System.out.println("\n\nCreate HashSet and fill the values from an ArrayList");
        ArrayList<String> student2027List = new ArrayList<>();
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
        System.out.println("student2027List-ArrayList -> " + student2027List);
        System.out.println("student2027List-ArrayList size -> " + student2027List.size());  // 11
        // [John, KenDRa, JOHN, JIa, MichAEl, LuX, John, Kendra, Jia, John, JIa]

        // Created HashSet and filled the values from an ArrayList
        HashSet<String> student2027List_HashSet = new HashSet<>(student2027List);
        // All unique values from ArrayList will get added in HashSet automatically.

        System.out.println("student2027List-HashSet -> " + student2027List_HashSet);
        System.out.println("student2027List-HashSet size -> " + student2027List_HashSet.size());


        /**
         * Create ArrayList and fill the values from a HashSet
         */
        System.out.println("\n\nCreate ArrayList and fill the values from a HashSet");
        HashSet<String> emailAddressBatch2027 = new HashSet<>();
        emailAddressBatch2027.add("john@test.com");
        emailAddressBatch2027.add("jia@test.com");
        emailAddressBatch2027.add("JIA@test.com");
        emailAddressBatch2027.add("liY@test.com");
        emailAddressBatch2027.add("JohnJia@test.com");
        emailAddressBatch2027.add("KenDRa@test.com");
        emailAddressBatch2027.add("rome@test.com");
        System.out.println("emailAddressBatch2027-HashSet -> " + emailAddressBatch2027);
        System.out.println("emailAddressBatch2027-HashSet size -> " + emailAddressBatch2027.size());

        // Created ArrayList and filled the values from a HashSet
        ArrayList<String> emailAddressBatch2027_ArrayList = new ArrayList<>(emailAddressBatch2027);
        System.out.println("emailAddressBatch2027-ArrayList -> " + emailAddressBatch2027_ArrayList);
        System.out.println("emailAddressBatch2027-ArrayList size -> " + emailAddressBatch2027_ArrayList.size());

        // 8:40pm














    }
}
