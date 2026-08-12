package chapter02;

import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in fahrenheit between -58F and 41F: ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windspeed = input.nextDouble();

        double outsideTemp = (35.74 + .6215 * temp - (35.75 * (Math.pow(windspeed,.16))) + (.4275 * temp * (Math.pow(windspeed,.16))));

        System.out.print("The windchill index is " + outsideTemp);
    }
}
