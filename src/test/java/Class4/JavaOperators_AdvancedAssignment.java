package Class4;

public class JavaOperators_AdvancedAssignment {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * 5. Advanced assignment (+=, -=, *=, /=, %=)
         */
        double accountBalance = 2000000;
        System.out.println("Account balance : "+accountBalance);

        // deposit 40000
        double depositAmount = 40000;
        accountBalance+=depositAmount;      // accountBalance = accountBalance + depositAmount;
        System.out.println("Account balance : "+accountBalance);

        double withdrawAmount = 10000;
        accountBalance-=withdrawAmount;   // accountBalance = accountBalance - withdrawAmount

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = "+num1);     // 10
        System.out.println("num2 = "+num2);     // 20

        System.out.println(num1+"*="+num2);
        num1*=num2;     // num1=num1*num2
        System.out.println("num1 = "+num1);     // 200
        System.out.println("num2 = "+num2);     // 20

        System.out.println(num2+"/="+num1);
        num2/=num1;     // num2=num2/num1 -> num2=20/200 -> num2=0
        System.out.println("num1 = "+num1);     // 200
        System.out.println("num2 = "+num2);     // 0

        num2=230;
        System.out.println(num2+"%="+num1);
        num2%=num1;     // num2=num2%num1 -> num2=230%200 -> num2=30
        System.out.println("num1 = "+num1);     // 200
        System.out.println("num2 = "+num2);     // 30




    }
}
