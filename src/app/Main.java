package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter unit distance");


        double miles = 20;
        double kilometers = milesToKilometers(miles);
        System.out.println("Result is: " + miles + " miles is " + kilometers +
                " kilometers");
    }

    public static double milesToKilometers (double miles) {
        return miles * 1.60934;
    }
}
