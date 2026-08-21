package chapter03;

public class Exercise03_24 {
    public static void main(String[] args) {
        // Generate rank (1-13) and suit (1-4)
        int rank = (int) (Math.random() * 13) + 1;
        int suit = (int) (Math.random() * 4) + 1;

        // Determine the rank name
        System.out.print("The card you picked is ");
        switch (rank) {
            case 1:
                System.out.print("Ace");
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            default:
                System.out.print(rank);
                break;
        }

        // Determine the suit
        System.out.print(" of ");
        switch (suit) {
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Hearts");
                break;
            case 4:
                System.out.println("Spades");
                break;
        }
    }
}