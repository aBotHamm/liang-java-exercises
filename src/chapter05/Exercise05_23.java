package chapter05;

public class Exercise05_23 {
    public static void main(String[] args) {
        final int N = 50000;
        float leftToRight = 0;
        for (int i = 1; i <= N; i++) {
            leftToRight += 1.0f / i;
        }
        float rightToLeft = 0;
        for (int i = N; i >= 1; i--) {
            rightToLeft += 1.0f / i;
        }

        System.out.println("Left to right: " + leftToRight);
        System.out.println("Right to left: " + rightToLeft);
    }
}