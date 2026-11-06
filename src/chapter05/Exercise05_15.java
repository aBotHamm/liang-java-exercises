package chapter05;

public class Exercise05_15 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 33; i <= 126; i++) {
            char letter = (char) i;
            System.out.print(letter + " ");
            counter++;
            if (counter == 10) {
                System.out.print("\n");
                counter = 0;
            }
        }
    }
}
