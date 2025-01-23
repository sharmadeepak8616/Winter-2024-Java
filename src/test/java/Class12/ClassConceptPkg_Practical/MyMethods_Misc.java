package Class12.ClassConceptPkg_Practical;

public class MyMethods_Misc {
    /**
     * Create a method to print "Hello World"
     */
    /**
     *  1. what is the purpose of the method?
     *      helloWorld , printHelloWorld , sayHelloWorld
     *  2. do we need any input-data from the user? - No
     *  3. should we return the final result back to user? - No
     */
    public static void helloWorld() {
        System.out.println("Hello World");
    }


    /**
     * Create a method which greets to user like:
     * Hello <username>
     *
     * if username has length greater than 0
     *  print "Hello <username>" (print username in Titlecase)
     * else
     *  print "Hello User"
     */
    /**
     *  1. what is the purpose of the method? (purpose helps use to find name for the method)
     *      welcome, helloUser, greetUser, welcomeUser
     *  2. do we need any input-data from the user? - Yes
     *      If yes, a) how many input-values we need from user - 1
     *              b) what are the datatypes of input-values - String
     * 3. should we return the final result back to user? - void
     *      If yes, a) what is the datatype of final-result-value
     */
    public static void welcome(String username) {
        username = username.trim();
        if (username.length() > 0) {
            username = MyMethods_String.titleCaseConverter(username);
            System.out.println("Hello "+username);
        } else {
            System.out.println("Hello User");
        }
    }



}
