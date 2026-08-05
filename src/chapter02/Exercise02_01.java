package chapter02;

import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        double celcius, fahrenheit;

        Scanner input = new Scanner(System.in);

        System.out.print("Celcius: ");
        celcius = input.nextDouble();

        fahrenheit = (9.0 / 5) * celcius + 32;

        System.out.println(celcius + " celcius is " + fahrenheit + " fahrenheit");


    }
}
