package Class17.Collections_Pkg_4;

import java.util.*;

public class Map_HashMap_Practice {
    public static void main(String[] args) {
        HashMap<String, Double> statesTempData = new HashMap<>();
        statesTempData.put("NY", 44.0);
        statesTempData.put("NJ", 35.8);
        statesTempData.put("TX", 55.9);
        statesTempData.put("CA", 65.9);
        statesTempData.put("MI", 33.8);
        statesTempData.put("WI", 33.8);
        statesTempData.put("AL", 44.0);
        statesTempData.put("VI", 64.2);
        System.out.println("statesTempDataCount -> " + statesTempData.size());
        System.out.println("statesTempData -> " + statesTempData);

        /**
         * Find the average of temp-values
         */
        System.out.println("\nFind the average of temp-values");
        /*
            1. use values()-method get all Values-data in a Collection
            2. apply loop on the Collection to find temp-total
            3. divide temp-total with Collection.size
         */
        Collection<Double> allTempData = statesTempData.values();
        Double tempTotal = 0.0;
        for(Double tempData : allTempData) {
            tempTotal += tempData;
        }
        double averageTempValue = tempTotal/allTempData.size();
        System.out.println("The average of temp-values -> " + averageTempValue);


        /**
         * Find the temp-value of given state-symbol (ignore-cases)
         *
         * if the given state-symbol(ignore-cases) present in Hashmap,
         *      print it's temp-value
         * else
         *      print "State not found"
         */
        // statesTempData -> {VI=64.2, TX=55.9, NY=44.0, AL=44.0, NJ=35.8, MI=33.8, CA=65.9}
        System.out.println("\nFind the temp-value of given state-symbol (ignore-cases)");
        String findTempFor = "cT";
        System.out.println("Given state symbol -> " + findTempFor);
        Double foundTemp = 9999.99;
        Set<String> allStateSymbols = statesTempData.keySet();
        for(String stateSymbol : allStateSymbols) {
            if (stateSymbol.equalsIgnoreCase(findTempFor)) {
                foundTemp = statesTempData.get(stateSymbol);
                break;
            }
        }
        if (foundTemp != 9999.99) {
            System.out.println("Temp for " + findTempFor + " is -> " + foundTemp);
        } else {
            System.out.println("State not found. Available states -> " + allStateSymbols);
        }



        /**
         * Find which state has lowest temp-value
         */
        // statesTempData -> {VI=64.2, TX=55.9, NY=44.0, AL=44.0, NJ=35.8, MI=33.8, CA=65.9}
        /*
            1. get all temp-values in a variable
            2. run a loop and find the lowest temp-value
            3. run another loop on Hashmap to print all States where temp value equals to the lowestTemp-value
         */
        System.out.println("\nFind which state has lowest temp-value");
        Collection<Double> allTempDataAgain = statesTempData.values();
        Double lowestTempValue = 999999.99;
        Set<String> stateWithLowestTemp = new HashSet<>();
        for(Double tempValue : allTempDataAgain) {
            if (tempValue < lowestTempValue) {
                lowestTempValue = tempValue;
            }
        }
        Set<String> allStates = statesTempData.keySet();
        for(String state : allStates) {
            if (Objects.equals(statesTempData.get(state), lowestTempValue)) {
                stateWithLowestTemp.add(state);
            }
        }
        System.out.println("Lowest temp value = "+ lowestTempValue+"\nStates with lowest temp value -> " + stateWithLowestTemp);




    }
}
