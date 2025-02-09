package Class17.Collections_Pkg_4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_HashMap_1 {
    public static void main(String[] args) {
        /**
         * Datatypes which can store only one value at a time
         *      int
         *      double
         *      boolean
         *      String
         *      char
         *
         * Datatypes which can store one or more value at a time
         *      Array   {11, 12, 13, 11, 15}
         *      ArrayList   [11, 11, 13, 14, 15]
         *      HashSet     [11, 12, 13, 14, 15]
         *      -> at each index, these datatypes can store only one value at a time
         *
         * Datatype which can store one or more pair at a time
         *      HashMap     [{1,"Apple"}, {2,"Google"}, {3,"Meta"}, {4,"Tesla"}]
         *      -> at each index, this datatype can store a pair at a time
         */
        /**
         * HashMap
         *      is a non-primitive datatype
         *      can store one or more pair of same or multiple datatypes
         *
         * HashMap uses Hashing technique to store a pair in memory
         *  due to this, HashMap does NOT maintain the order of insertion
         *  and, does NOT support the concept of index
         *
         * HashMap pair can be considered as the combination of Key-data and Value-data
         * {(key1->value1) , (key2->value2) , (key3->value3) , (key4->value4)}
         * In a Pair,
         *      first data is known Key
         *      second data is known as Value linked with the Key
         *
         * Key is HashMap must be UNIQUE
         * bcz, using the ket, we can get the value linked with it.
         *
         * Values linked with different Keys can be duplicate.
         */
        /**
         * Syntax to create HashMap/Map:
         *
         * HashMap<WrapperClassKey, WrapperClassValue> myHashMap = new HashMap<>();
         *      OR
         * Map<WrapperClassKey, WrapperClassValue> myMap = new HashMap
         *
         * WrapperClass: Class which represents the primitive datatype.
         * int      ->      Integer
         * double   ->      Double
         * char     ->      Character
         * String   ->      String
         * boolean  ->      Boolean
         *
         * Depending upon the type of Key and Values we want to store in HashMap/Map,
         *  use respective WrapperClass while creating the HashMap/Map.
         *
         */
        /**
         * Create HashMap to store current temp of different states
         * stateSymbol as Key
         * { (NY->44) , (NJ->42) , (TX->70.0) }
         * Key datatype -> String
         * Value datatype -> Double
         */

        /**
         * Methods in HashMap/Map:
         *      size()
         *      put()
         *      remove()
         *      get()
         *      keySet()
         *      values()
         *      containsKey()
         *      containsValue()
         *      isEmpty()
         *      clear()
         */

        HashMap<String, Double> statesTempData = new HashMap<>();
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To find the number of pair stored in HashMap/Map
         * method: size()
         * return-type: int
         */
        System.out.println("\nMethod - size()");
        int statesTempDataCount = statesTempData.size();
        System.out.println("statesTempDataCount -> " + statesTempDataCount);
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To add a pair in HashMap/Map
         * method: put()
         * input: pair that we want to add (firstInputData is considered as Key, secondInputData considered as Value)
         *
         * -> newPair is to store a part of HashMap/Map
         * -> we can add ONLY one pair at a time
         * -> does NOT maintain the order of insertion due to Hashing technique
         * -> if you try to add a pair, & it's key already exists in HashMap then old pair will be replaced by new-pair
         *
         *
         */
        System.out.println("\nMethod - put()");
        statesTempData.put("NY", 44.0);
        statesTempData.put("NJ", 35.8);
        statesTempData.put("TX", 55.9);
        statesTempData.put("CA", 65.9);
        statesTempData.put("MI", 33.8);
        statesTempData.put("AL", 44.0);
        statesTempData.put("TX", 55.0);
        statesTempData.put("VI", 64.2);

        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To remove a pair from HashMap/Map
         * method: remove()
         *
         * usage:
         *      1. by providing the Key-data of the pair that you want to remove.
         *      2. by providing the complete-pair(key,value) that you want to remove.
         *
         */
        /**
         * if using remove as #1. by providing the Key-data of the pair that you want to remove.
         *
         * if the given key is EXACTLY found in HashMap (as a Key)
         *      the pair will be removed
         *      and, method returns the value linked with the key
         * else
         *      method returns null
         */
        // statesTempData -> {VI=64.2, TX=55.0, NY=44.0, AL=44.0, NJ=35.8, MI=33.8, CA=65.9}
        System.out.println("\nmethod - remove() - using as #1. by providing the Key-data of the pair that you want to remove.");
        Double valueWith_MI = statesTempData.remove("MI");
        System.out.println("Removed pair with key=MI, linked value with 'MI' -> " + valueWith_MI);      // 33.8

        Double valueWith_Nj = statesTempData.remove("Nj");
        System.out.println("Removed pair with key=Nj, linked value with 'Nj' -> " + valueWith_Nj);      // null

        Double valueWith_55_0 = statesTempData.remove("55.0");
        System.out.println("Removed pair with key=55.0, linked value with '55.0' -> " + valueWith_55_0);    // null

        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * if using remove as #2. by providing the complete-pair(key,value) that you want to remove.
         *
         * if the given pair is EXACTLY found in HashMap
         *      the pair will be removed
         *      and, method returns true
         * else
         *      method returns false
         */
        // statesTempData -> {VI=64.2, TX=55.0, NY=44.0, AL=44.0, NJ=35.8, CA=65.9}
        System.out.println("\nmethod - remove() - using as #2. by providing the complete-pair(key,value) that you want to remove.");

        boolean isRemoved_VI_642 = statesTempData.remove("VI",64.2);
        System.out.println("is \"(VI,64.2)\" removed -> " + isRemoved_VI_642);      // true

        boolean isRemoved_NY_358 = statesTempData.remove("NY",35.8);
        System.out.println("is \"(NY,35.8)\" removed -> " + isRemoved_NY_358);      // false

        boolean isRemoved_550_TX = statesTempData.remove("55.0", "TX");
        System.out.println("is \"(55.0,TX)\" removed -> " + isRemoved_550_TX);      // false

        boolean isRemoved_TX_550 = statesTempData.remove("TX", "55.0");
        System.out.println("is \"(TX,55.0)\" removed -> " + isRemoved_TX_550);      // false

        boolean isRemoved_CT_402 = statesTempData.remove("CT",40.2);
        System.out.println("is \"(CT,40.2)\" removed -> " + isRemoved_CT_402);      // false

        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To get the value linked with a given key
         * method: get()
         * input: the Key-data for which we want to get the value
         *
         * if the given key is EXACTLY found in HashMap/Map
         *      method returns the value linked with the given-key
         * else
         *      method returns null
         */
        // statesTempData -> {TX=55.0, NY=44.0, AL=44.0, NJ=35.8, CA=65.9}
        System.out.println("\nmethod - get()");

        Double valueWith_Tx = statesTempData.get("Tx");
        System.out.println("Value linked with Key=Tx -> " + valueWith_Tx);      // null

        Double valueWith_VI = statesTempData.get("VI");
        System.out.println("Value linked with Key=VY -> " + valueWith_VI);      // null

        Double valueWith_NJ = statesTempData.get("NJ");
        System.out.println("Value linked with Key=NJ -> " + valueWith_NJ);      // 35.8

        Double valueWith_440 = statesTempData.get("44.0");
        System.out.println("Value linked with Key=44.0 -> " + valueWith_440);   // null

        Double valueWith_CT = statesTempData.get("CT");
        System.out.println("Value linked with Key=CT -> " + valueWith_CT);      // null

        Double valueWith_TX = statesTempData.get("TX");
        System.out.println("Value linked with Key=TX -> " + valueWith_TX);      // 55.0

        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To get all the Keys from HashMap/map in a new variable
         * method: keySet()
         *
         * This method copies all the Key-data from HashMap, stores into a Set, then returns Set
         */
        System.out.println("\nmethod - keySet()");
        Set<String> allStatesSymbol = statesTempData.keySet();
        System.out.println("All states symbols from statesTempData-HashMap -> " + allStatesSymbol);
        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To get all the Values from HashMap/map in a new variable
         * method: values()
         *
         * This method copies all the Values-data from HashMap, stores into a Collection, then returns Collection
         */
        System.out.println("\nmethod - values()");
        Collection<Double> allTempValues = statesTempData.values();
        System.out.println("All temp-values from statesTempData-HashMap -> " + allTempValues);
        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To find if given data is present as one of the Keys in HashMap/Map
         * method: containsKey()
         *
         * if the given data is EXACTLY present as one of the Keys in HashMap/Map
         *      method returns true
         * else
         *      method returns false
         */
        // statesTempData -> {TX=55.0, NY=44.0, AL=44.0, NJ=35.8, CA=65.9}
        System.out.println("\nmethod - containsKey()");

        boolean is_TX_PresentAsKey = statesTempData.containsKey("TX");      // true
        System.out.println("is 'TX' present as one of the keys in statesTempData-HashMap -> " + is_TX_PresentAsKey);

        boolean is_Ca_PresentAsKey = statesTempData.containsKey("Ca");      // false
        System.out.println("is 'Ca' present as one of the keys in statesTempData-HashMap -> " + is_Ca_PresentAsKey);

        boolean is_NY_PresentAsKey = statesTempData.containsKey("NY");      // true
        System.out.println("is 'NY' present as one of the keys in statesTempData-HashMap -> " + is_NY_PresentAsKey);

        boolean is_440_PresentAsKey = statesTempData.containsKey("44.0");   // false
        System.out.println("is '44.0' present as one of the keys in statesTempData-HashMap -> " + is_440_PresentAsKey);

        boolean is_VI_PresentAsKey = statesTempData.containsKey("VI");      // false
        System.out.println("is 'VI' present as one of the keys in statesTempData-HashMap -> " + is_VI_PresentAsKey);

        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To find if given data is present as one of the Values in HashMap/Map
         * method: containsValues()
         *
         * if the given data is EXACTLY present as one of the Values in HashMap/Map
         *      method returns true
         * else
         *      method returns false
         */
        // statesTempData -> {TX=55.0, NY=44.0, AL=44.0, NJ=35.8, CA=65.9}
        System.out.println("\nmethod - containsValues()");

        boolean is_440_PresentAsValue = statesTempData.containsValue("44.0");   // false
        System.out.println("is \"44.0\" present as a Value in statesTempData-HashMap -> " + is_440_PresentAsValue);

        boolean is_440_PresentAsValue2 = statesTempData.containsValue(44.0);    // true
        System.out.println("is 44.0 present as a Value in statesTempData-HashMap -> " + is_440_PresentAsValue2);

        boolean is_NY_PresentAsValue = statesTempData.containsValue("NY");      // false
        System.out.println("is \"NY\" present as a Value in statesTempData-HashMap -> " + is_NY_PresentAsValue);

        boolean is_559_PresentAsValue = statesTempData.containsValue(55.9);      // false
        System.out.println("is 55.9 present as a Value in statesTempData-HashMap -> " + is_559_PresentAsValue);

        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To find if Hashmap/Map is empty (or has no pair stored in it or has size equals to 0)
         * method: isEmpty()
         *
         * if HashMap/Map is empty (means has no pair stored in it)
         *      method will return true
         * else
         *      method will return false
         */
        System.out.println("\nmethod - isEmpty()");
        boolean isStatesTempDataEmpty = statesTempData.isEmpty();       // false
        System.out.println("is statesTempData empty? -> " + isStatesTempDataEmpty);
        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * To clear/empty your Hashmap/Map (or to remove ALL Pairs from Hashmap/Map)
         * method: clear()
         */
        System.out.println("\nmethod - clear()");
        statesTempData.clear();
        System.out.println("**** Using clear()-method ****");

        boolean isStatesTempDataEmpty_afterClean = statesTempData.isEmpty();       // true
        System.out.println("\nis statesTempData empty (after clear()-method) ? -> " + isStatesTempDataEmpty_afterClean);
        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

    }
}
