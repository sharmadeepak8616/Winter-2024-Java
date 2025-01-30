package Class14.Polymorphism_Pkg;

public class MainClass {
    public static void main(String[] args) {
        // use methodA from ClassA
        ClassA aObject = new ClassA();
        aObject.methodA();
        aObject.methodB();  // MainClass -> ClassA -> ClassB

        // use methodB from ClassB
        ClassB bObject = new ClassB();
        bObject.methodB();

        aObject.methodA(2);
        aObject.methodA("Hello");
        aObject.methodA(2,5);
        aObject.methodA();
        aObject.methodA(2, "Hello");
        aObject.methodA("Hello", 2);

        aObject.bookFlight("NY", "JPN", "88");
        aObject.bookFlight("NY", "JPN", "88", "99");


        aObject.methodB1();
        bObject.methodB1();



    }
}
