package Class9;

public class Loops_Concept_1 {
    public static void main(String[] args) {
        /**
         * Print "Hello World" 20-times
         */
        System.out.println("Hello World"); // thisPrintNumber = 1 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 2 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 3 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 4 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 5 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 6 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 7 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 8 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 9 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 10 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 11 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 12 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 13 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 14 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 15 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 16 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 17 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 18 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 19 stoppingValue=20
        System.out.println("Hello World"); // thisPrintNumber = 20 stoppingValue=20

        System.out.println("\nUsing for-loop");
        for (int i=1 ; i<=20 ; i++) {
            System.out.println("Hello World");
        }

        /**
         * Loops:
         *      when we need to execute lines of code multiple times
         *
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         * 4. Enhanced-for loop
         */
        String[] myFavAnimals = new String[5];
        myFavAnimals[3] = "Horse";
        myFavAnimals[2] = "Dog";
        myFavAnimals[4] = "Cat";
        myFavAnimals[1] = "Zebra";
        myFavAnimals[0] = "Elephant";
        System.out.println("\n\nPrint array-data at each index (0 to 4)");

        // Print array-data at each index (0 to 4)
        System.out.println(myFavAnimals[0]); // index=0, maxIndex=4
        System.out.println(myFavAnimals[1]); // index=1, maxIndex=4
        System.out.println(myFavAnimals[2]); // index=2, maxIndex=4
        System.out.println(myFavAnimals[3]); // index=3, maxIndex=4
        System.out.println(myFavAnimals[4]); // index=4, maxIndex=4

        System.out.println("\nUsing for-loop");
        for (int index=0 ; index<=myFavAnimals.length-1 ; index++) {
            System.out.println(myFavAnimals[index]);
        }
    }
}
