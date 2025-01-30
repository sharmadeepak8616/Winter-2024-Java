package Class14.Polymorphism_Pkg;

public class ClassA extends ClassB {
    /*
        assets: variables -> variableA, variableB
                methods -> methodA, methodB, methodB1
     */
    String variableA = "A";
    public void methodB1() {
        System.out.println("Method-A");
    }
    public void methodA() {
        System.out.println("Method-A");
    }
    public void methodA(String varA) {
        System.out.println("Method-A with input="+varA);
    }
    public void methodA(int var1) {
        System.out.println("Method-A with input="+var1);
    }
    public void methodA(String var1, int var2) {
        System.out.println("Method-A with input="+var1+", and "+var2);
    }
    public void methodA(int var1, String var2) {
        System.out.println("Method-A with input="+var1+", and "+var2);
    }
    public void methodA(int var1, int var2) {
        System.out.println("Method-A with input="+var1+", and "+var2);
    }

    public void bookFlight(String src, String dest, String travelDate) {
        // to book one-way tickets
    }

    public void bookFlight(String src, String dest, String travelDate, String returnDate) {
        // to book two-way tickets
    }



}
