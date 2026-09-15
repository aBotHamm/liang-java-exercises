package chapter05;

public class Exercise05_06 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s| %-10s%s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        for (int i = 1; i <= 10; i++) {
            double km = 20 + 5 * (i - 1);
            double rightMiles = km / 1.609;
            System.out.printf("%-10d%-15.3f| %-10.0f%.3f%n", i, i * 1.609, km, rightMiles);
        }
    }
}