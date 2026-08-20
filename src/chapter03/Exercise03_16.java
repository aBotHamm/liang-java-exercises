package chapter03;

public class Exercise03_16 {
    public static void main(String[] args) {
        /* Write a program that displays a random coordinate in a rectangle.
         The rectangle is centered at (0, 0) with width 100 and height 200.*/

        //x is width MIN 0 MAX 100
        // y is height MIN 0 MAX 200
        int x1 = 0, y1 = 0;

        x1 = (int) (Math.random() * 101 - 50);
        y1 = (int) (Math.random() * 201 - 100);

        System.out.println("Rectangles new coordinates: (" + x1 + "," + y1 + ")");
    }
}
