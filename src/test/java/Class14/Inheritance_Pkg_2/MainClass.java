package Class14.Inheritance_Pkg_2;

public class MainClass {
    public static void main(String[] args) {
        // use methodA from ClassA
        ClassA aObject = new ClassA();
        aObject.methodA();
        aObject.methodB();  // MainClass -> ClassA -> ClassB

        // use methodB from ClassB
        ClassB bObject = new ClassB();
        bObject.methodB();
    }
}
