package Class9;

import java.util.Arrays;

public class Homework3_Discussion {
    public static void main(String[] args) {

        /**
         * Question-1:
         * Create an empty array which can store 5-string values
         * using index-values, store 5-names in it.
         *
         * a) Print the entire array
         * b) if index-2-name has more than 5 characters, print the total number of characters present in the name
         *      otherwise, print the name in uppercase
         *
         */
        String[] myFavAnimals = new String[5];
        myFavAnimals[3] = "Horse";
        myFavAnimals[2] = "Dog";
        myFavAnimals[4] = "Cat";
        myFavAnimals[1] = "Zebra";
        myFavAnimals[0] = "Elephant";
        System.out.println(myFavAnimals[0]);
        System.out.println(myFavAnimals[1]);
        System.out.println(myFavAnimals[2]);
        System.out.println(myFavAnimals[3]);
        System.out.println(myFavAnimals[4]);

        System.out.println("My fav animals -> " + Arrays.toString(myFavAnimals));

        /**
         * b) if index-2-name has more than 5 characters, print the total number of characters present in the name
         *      otherwise, print the name in uppercase
         */
        if (myFavAnimals[2].length() > 5) {
            System.out.println("Length of index-2 animal's name -> " + myFavAnimals[2].length());
        } else {
            System.out.println("Index-2 animal's name in Uppercase -> " + myFavAnimals[2].toUpperCase());
        }

        // did same for other indexes for practice
        if (myFavAnimals[0].length() > 5) {
            System.out.println(myFavAnimals[0].length());
        } else {
            System.out.println(myFavAnimals[0].toUpperCase());
        }
        if (myFavAnimals[1].length() > 5) {
            System.out.println(myFavAnimals[1].length());
        } else {
            System.out.println(myFavAnimals[1].toUpperCase());
        }
        if (myFavAnimals[3].length() > 5) {
            System.out.println(myFavAnimals[3].length());
        } else {
            System.out.println(myFavAnimals[3].toUpperCase());
        }
        if (myFavAnimals[4].length() > 5) {
            System.out.println(myFavAnimals[4].length());
        } else {
            System.out.println(myFavAnimals[4].toUpperCase());
        }


        /**
         * Question-2:
         * Create a String-variable and store any 4-words sentence in it
         *  4-words sentence example:
         *          Have a happy life
         *          have a great day
         *          wOrk HaRD paRTy HArdEr
         *          stay humble keep smiling
         *
         * convert the String into Titlecase (convert 1st-letter of each word into Uppercase and all other letters into lowercase)
         * wOrk HaRD paRTy HArdEr   -> Work Hard Party Harder
         * stay humble keep smiling -> Stay Humble Keep Smiling
         */
        /**
         * wOrk HaRD paRTy HArdEr -> ["wOrk", "HaRD", "paRTy", "HArdEr"]
         * index-0-value = "wOrk"
         *      index-0-data (w)        from-index-1-data ("Ork")
         *      Uppercase (W)           lowercase (ork)
         *      W + ork = Work
         *
         * index-1-value = "HaRD"
         *      index-0-data (H)        from-index-1-data ("aRD")
         *      Uppercase (H)           lowercase (ard)
         *      H + ard = Hard
         *
         */
        String question2 = "stAy huMBle kEep smiLiNg";
        System.out.println("question2 string -> " + question2);
        String[] splitBy_space = question2.split(" ");      // ["wOrk", "HaRD", "paRTy", "HArdEr"]

        String index0Word = splitBy_space[0];   // "wOrk"
        String index0Letter_0 = index0Word.substring(0,1);
        String index0Letter_0_Uppercase = index0Letter_0.toUpperCase();
        String fromIndex1Letter_0 = index0Word.substring(1);
        String fromIndex1Letter_0_Lowercase = fromIndex1Letter_0.toLowerCase();
        splitBy_space[0] = index0Letter_0_Uppercase + fromIndex1Letter_0_Lowercase;     // ["Work", "HaRD", "paRTy", "HArdEr"]

        String index1Word = splitBy_space[1];   // "HaRD"
        String index0Letter_1 = index1Word.substring(0,1);  // "H"
        String index0Letter_1_Uppercase = index0Letter_1.toUpperCase(); // "H"
        String fromIndex1Letter_1 = index1Word.substring(1);    // "aRD"
        String fromIndex1Letter_1_Lowercase = fromIndex1Letter_1.toLowerCase(); // "ard"
        splitBy_space[1] = index0Letter_1_Uppercase + fromIndex1Letter_1_Lowercase;     // ["Work", "Hard", "paRTy", "HArdEr"]

        String index2Word = splitBy_space[2];   // "paRTy"
        String index0Letter_2 = index2Word.substring(0,1);  // "p"
        String index0Letter_2_Uppercase = index0Letter_2.toUpperCase(); // "P"
        String fromIndex1Letter_2 = index2Word.substring(1);    // "aRTy"
        String fromIndex1Letter_2_Lowercase = fromIndex1Letter_2.toLowerCase(); // "arty"
        splitBy_space[2] = index0Letter_2_Uppercase + fromIndex1Letter_2_Lowercase;     // ["Work", "Hard", "Party", "HArdEr"]

        String index3Word = splitBy_space[3];   // "HArdEr"
        String index0Letter_3 = index3Word.substring(0,1);  // "H"
        String index0Letter_3_Uppercase = index0Letter_3.toUpperCase(); // "H"
        String fromIndex1Letter_3 = index3Word.substring(1);    // "ArdEr"
        String fromIndex1Letter_3_Lowercase = fromIndex1Letter_3.toLowerCase(); // "arder"
        splitBy_space[3] = index0Letter_3_Uppercase + fromIndex1Letter_3_Lowercase;     // ["Work", "Hard", "Party", "Harder"]

        String question2Result = splitBy_space[0] + " " + splitBy_space[1] + " " + splitBy_space[2] + " " + splitBy_space[3];
                        //          "Work" + " " + "Hard" + " " + "Party" + " " + "Harder"

        System.out.println("question2Result -> " + question2Result);




    }
}
