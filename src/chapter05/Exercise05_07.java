package chapter05;

public class Exercise05_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        final double INCREASE = .05;

        for (int i = 0; i < 10; i++) {
            tuition += tuition * INCREASE;
        }
        System.out.println("Tuition in ten years is " + tuition);

        double totalFourYear = 0;
        for (int j = 0; j < 4; j++) {
            totalFourYear += tuition;
            tuition += tuition * INCREASE;
        }
        System.out.println("The four-year total tuition in ten years is " + totalFourYear);
    }
}