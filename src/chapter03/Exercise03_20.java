package chapter03;

import java.util.Scanner;

public class Exercise03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        if (temp >= -58 && temp <= 41 && windSpeed >= 2) {
            double windChill = 35.74 + 0.6215 * temp
                    - 35.75 * Math.pow(windSpeed, 0.16)
                    + 0.4275 * temp * Math.pow(windSpeed, 0.16);

            System.out.println("The wind chill index is " + windChill);
        } else {
            System.out.println("Temperature and/or wind speed is invalid");
        }

        input.close();
    }
}