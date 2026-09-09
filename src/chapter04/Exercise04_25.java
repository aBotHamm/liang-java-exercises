package chapter04;

import java.util.Random;

public class Exercise04_25 {
    public static void main(String[] args) {
        Random rand = new Random();

        int letterNum1 = rand.nextInt(65, 91);
        char letter1 = (char) letterNum1;
        int letterNum2 = rand.nextInt(65, 91);
        char letter2 = (char) letterNum2;
        int letterNum3 = rand.nextInt(65, 91);
        char letter3 = (char) letterNum3;

        int num1 = rand.nextInt(0, 10);
        int num2 = rand.nextInt(0, 10);
        int num3 = rand.nextInt(0, 10);
        int num4 = rand.nextInt(0, 10);

        System.out.print("A random vehicle plate number: " + letter1 + letter2 + letter3 + num1 + num2 + num3 + num4);
    }
}
