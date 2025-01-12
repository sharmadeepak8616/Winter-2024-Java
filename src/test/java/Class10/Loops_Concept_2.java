package Class10;

import java.util.Arrays;

public class Loops_Concept_2 {
    public static void main(String[] args) {
        /**
         * Loops:
         *      when we need to execute lines of code multiple times
         *
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         * 4. Enhanced-for loop
         */

        String[] words = {"Joy", "smile", "learn", "smile", "learn", "smile", "learn"};
        /*
            Print all values from array at each index on separate lines
            Given Array -> String[] words = {"Hello", "Hi"};
            Result ->
            Hello
            Hi
            System.out.println(words[0]);   // Hello
            System.out.println(words[1]);   // Hi

            Given Array -> String[] words = {"Joy", "Happy", "Celebrate"};
            System.out.println(words[0]);
            System.out.println(words[1]);
            System.out.println(words[2]);



            System.out.println(words[X]);   // X=0 , X=0,1,..,lastIndexNumber (X<=lastIndexNumber) X++

         */

        System.out.println("\nPrint all values from array at each index on separate lines");
        System.out.println("Given array -> " + Arrays.toString(words));
        System.out.println("Result using for-loop");
        for (int x=0 ; x<=words.length-1 ; x++) {
            System.out.println(words[x]);
        }

        /**
         * 1. for loop
         *
         * Syntax:
         * for (initialization ; condition ; changeInValue) {
         *      for loop
         *      code block
         *      -> code will execute until the for-loop-condition becomes false
         * }
         */
        /**
         * for-loop execution steps:
         * 1. Create the for-loop-variable mentioned in initialization section with mentioned value
         * 2. check for-loop-condition with present value of for-loop-variable
         * 3. if true
         *      Java enters in the for-loop and executes the for-loop-code
         *    if false
         *      Java does not enter in the for-loop and moves ahead in the code file.
         * 4. once all for-loop-code is executed, Java the changeInValue-section-code
         * 5. check for-loop-condition with present value of for-loop-variable
         * 6. if true
         *      Java enters in the for-loop and executes the for-loop-code
         *    if false
         *      Java does not enter in the for-loop and moves ahead in the code file.
         * 7. once all for-loop-code is executed, Java the changeInValue-section-code.
         * 8. check for-loop-condition with present value of for-loop-variable
         * 9. if true
         *      Java enters in the for-loop and executes the for-loop-code
         *    if false
         *      Java does not enter in the for-loop and moves ahead in the code file.
         * 10. once all for-loop-code is executed, Java the changeInValue-section-code.
         * 11. and so-on...
         */

        String[] words2 = {"Joy", "earn", "learn", "smile", "Give", "beautiful", "Kim"};
        System.out.println("\nPrint values from array which has length greater than 4 on separate lines");
        /**
         *  if (index-0-value-length > 4)
         *      print index-0-value
         *  if (index-1-value-length > 4)
         *      print index-1-value
         *  if (index-2-value-length > 4)
         *      print index-2-value
         *  ...
         *  ...
         *  if (index-last-value-length > 4)
         *      print index-last-value
         */
        /*
            if (words2[0].length() > 4) {
                System.out.println(words2[0]);
            }
            if (words2[1].length() > 4) {
                System.out.println(words2[1]);
            }
            if (words2[2].length() > 4) {
                System.out.println(words2[2]);
            }

            y=0   y<=lastIndexNumber (y=0,1,2,...,lastIndexNumber)     y++
            if (words2[y].length() > 4) {
                System.out.println(words2[y]);
            }
         */
        System.out.println("Given array -> " + Arrays.toString(words2));
        System.out.println("Result using for-loop");
        for (int y=0 ; y<= words2.length-1 ; y++) {
            if (words2[y].length() > 4) {
                System.out.println(words2[y]);
            }
        }

        String[] words3 = {"Hello", "Hi", "Smile", "Joy"};
        System.out.println("\nPrint all values from array in reverse order at each index on separate lines");
        /*
            Given Array -> String[] words3 = {"Hello", "Hi", "Smile", "Joy"};
            Result ->
            Joy     (sout(words3[lastIndexNumber]))
            Smile   (sout(words3[lastIndexNumber-1]))
            Hi      (sout(words3[lastIndexNumber-2]))
            Hello   (sout(words3[0]))

            Given Array -> String[] words3 = {"Joy", "earn", "learn", "smile", "Give", "beautiful", "Kim"};
            Result ->
            Kim         (sout(words3[lastIndexNumber]))
            beautiful   (sout(words3[lastIndexNumber-1]))
            Give        (sout(words3[lastIndexNumber-2]))
            ...
            ...
            earn        (sout(words3[1]))
            Joy         (sout(words3[0]))
         */
        /*
            System.out.println(words3[words3.length-1]);
            System.out.println(words3[words3.length-2]);
            System.out.println(words3[words3.length-3]);
            ...
            ...
            System.out.println(words3[0]);

            X=words3.length-1   X>=0 (X=words3.length-1,words3.length-2,words3.length-3,...,1,0)   X--
            System.out.println(words3[X]);
         */
        System.out.println("Given array -> " + Arrays.toString(words3));
        System.out.println("Result using for-loop");
        for (int x=words3.length-1 ; x>=0 ;x--) {
            System.out.println(words3[x]);
        }

        /**
         * 2. while loop
         *
         * Syntax:
         * initialization
         * while (condition) {
         *      while loop
         *      code block
         *      -> code will execute until the while-loop-condition becomes false
         *      changeInValue;   <-- LAST LINE inside the while-loop-code-block
         * }
         */

        System.out.println("Result using while-loop");
        int w=words3.length-1;
        while (w>=0) {
            System.out.println(words3[w]);
            w--;
        }

        System.out.println("\nPrint values from array which has length greater than 4 on separate lines");
        System.out.println("Given array -> " + Arrays.toString(words2));
        System.out.println("Result using while-loop");
        int y=0;
        while (y<= words2.length-1) {
            if (words2[y].length() > 4) {
                System.out.println(words2[y]);
            }
            y++;
        }

        /**
         * 3. do-while loop
         *
         * Syntax:
         * initialization
         * do {
         *      do-while loop
         *      code block
         *      -> code will execute until the do-while-loop-condition becomes false
         *      changeInValue;   <-- LAST LINE inside the do-while-loop-code-block
         * } while (condition);
         */

        System.out.println("Result using do-while-loop");
        int d=0;
        do {
            if (words2[d].length() > 4) {
                System.out.println(words2[d]);
            }
            d++;
        } while (d<= words2.length-1);



    }
}
