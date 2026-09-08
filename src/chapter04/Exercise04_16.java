package chapter04;

import java.util.Random;

public class Exercise04_16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(65, 91);

        String letter = String.valueOf(num);
        System.out.print(letter);
    }
}
