package app;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter unit distance");


        double miles = 20;
        double km = 20;
        double kilometers = milesToKilometers(miles);
        double mls = kilometersToMiles(km);
        System.out.println("Result is: " + miles + " miles is " + kilometers +
                " kilometers");
        System.out.println("Result is: " + km + " kilometers is " + mls +
                " miles.") ;
    }

    public static double milesToKilometers (double miles) {
        return miles * 1.60934;
    }
    public static double kilometersToMiles (double km) {
        return km / 1.60934;
    }
}
