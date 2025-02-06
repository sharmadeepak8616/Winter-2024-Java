package Class16.Collections_Pkg_3;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_HashSet_Practice {
    public static void main(String[] args) {

        HashSet<String> companyNames = new HashSet<>();
        companyNames.add("Apple");
        companyNames.add("Tesla");
        companyNames.add("logitech");
        companyNames.add("Sam");
        companyNames.add("HOnDa");
        companyNames.add("AppTech");
        companyNames.add("TeslA");
        companyNames.add("SteslA");
        companyNames.add("Home");
        companyNames.add("LogiTeCH");
        companyNames.add("ReD appLE");
        companyNames.add("appLE");
        companyNames.add("Honda");
        companyNames.add("TESLA");
        companyNames.add("Hondapple");
        companyNames.add("SAM");
        companyNames.add("APPlecation");
        companyNames.add("APPle");
        companyNames.add("HONDA");
        companyNames.add("aPPle");
        companyNames.add("teSla");


        System.out.println("\nTotal companyNames -> " + companyNames.size());   // 21
        System.out.println("companyNames -> " + companyNames);
        /*
            [Hondapple, APPle, LogiTeCH, aPPle, teSla, logitech, Honda, SteslA, appLE, Apple, AppTech,
            APPlecation, TESLA, Tesla, HOnDa, TeslA, ReD appLE, Home, Sam, SAM, HONDA]
         */

        /**
         * Find the number of company names which contains 'app' (ignore cases)
         */
        System.out.println("\n\nQ1: Find the number of company names which contains 'app' (ignore cases)");
        int appCounter = 0;     // assuming no companyName contains 'app'
        for(String name: companyNames) {
            if (name.toLowerCase().contains("app")) {
                appCounter++;
            }
        }
        System.out.println("Number of company names which contains 'app' (ignore cases) -> " + appCounter);

        /*
            [Hondapple, APPle, LogiTeCH, aPPle, teSla, logitech, Honda, SteslA, appLE, Apple, AppTech,
            APPlecation, TESLA, Tesla, HOnDa, TeslA, ReD appLE, Home, Sam, SAM, HONDA]
         */
        /**
         * Except one, remove all other occurrences of 'Tesla' (ignore cases) in companyNames-HashSet
         */
        System.out.println("\n\nQ2: Except one, remove all other occurrences of 'Tesla' (ignore cases) in companyNames-HashSet");
        System.out.println("\nTotal companyNames -> " + companyNames.size());   // 21
        System.out.println("companyNames -> " + companyNames);
        int teslaCounter = 0;
        ArrayList<String> allTeslaNames = new ArrayList<>();
        for(String name : companyNames) {
            if (name.equalsIgnoreCase("Tesla")) {
                teslaCounter++;
                if (teslaCounter > 1) {
                    allTeslaNames.add(name);
                }
            }
        }
        System.out.println("Total allTeslaNames -> " + allTeslaNames.size());
        System.out.println("allTeslaNames -> " + allTeslaNames);

        for(String name : allTeslaNames) {
            companyNames.remove(name);
        }

        System.out.println("Total companyNames -> " + companyNames.size());
        System.out.println("companyNames -> " + companyNames);

    }
}
