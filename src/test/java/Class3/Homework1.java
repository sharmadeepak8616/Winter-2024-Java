package Class3;

public class Homework1 {
    public static void main(String[] args) {
        /**
         * Formula sheet -> https://www.rapidtables.com/convert/temperature/fahrenheit-to-celsius.html
         *
         * F -> C
         * F -> K
         *
         * C -> F
         * C -> K
         *
         * K -> F
         * K -> C
         *
         */
        // F -> C
        double fTemp = 56;
        double cTemp_fTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp+"°F is equals to "+cTemp_fTemp+"°C");

        // F -> K
        double kTemp_fTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp+"°F is equals to "+kTemp_fTemp+"°K");




    }
}
