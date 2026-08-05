package chapter02;

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lengthOfCylinder, radiusOfCylinder, areaOfCylinder, volumeOfCylinder;
        System.out.print("Enter the radius of the cylinder: ");
        radiusOfCylinder = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        lengthOfCylinder = input.nextDouble();


        areaOfCylinder = radiusOfCylinder * radiusOfCylinder *Math.PI;
        volumeOfCylinder = areaOfCylinder * lengthOfCylinder;

        System.out.println("The area is " + areaOfCylinder);
        System.out.println("The volume is " + volumeOfCylinder);
    }
}
