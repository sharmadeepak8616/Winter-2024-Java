package Class13.Inheritance_Pkg;

public class MainClass {
    public static void main(String[] args) {
        // use methodA from ClassA
        ClassA aObject = new ClassA();
        aObject.methodA();
        aObject.methodB();

        // use methodB from ClassB
        ClassB bObject = new ClassB();
        bObject.methodB();
    }
}
