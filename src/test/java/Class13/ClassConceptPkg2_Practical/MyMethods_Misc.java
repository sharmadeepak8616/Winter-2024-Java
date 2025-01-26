package Class13.ClassConceptPkg2_Practical;

public class MyMethods_Misc {
    public static void helloWorld() {
        System.out.println("Hello World");
    }
    public void welcome(String username) {
        username = username.trim();
        if (username.length() > 0) {
            username = MyMethods_String.titleCaseConverter(username);
            System.out.println("Hello "+username);
        } else {
            System.out.println("Hello User");
        }
    }



}
