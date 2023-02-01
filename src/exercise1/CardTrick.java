package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(rand.nextInt(13) + 1);
            hand[i].setSuit(Card.SUITS[rand.nextInt(4)]);
            String play = hand[i].toString();
            System.out.println(play);

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of your card (1-13): ");
        int valueInt = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the suit of your card (0(Hearts), 1(Diamonds), 2(Spades), or 3(Clubs)): ");
        int suitInt = Integer.parseInt(scanner.nextLine());

        System.out.println("Your card is the " + valueInt + " of " + Card.SUITS[suitInt]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == valueInt && card.getSuit().equals(Card.SUITS[suitInt])) {
                match = true;
                break;
            }
        }

        if (match) {
            printInfo();
        } else {
            System.out.println("Wrong, Game Over");
        }
    }

    // insert code to ask the user for Card value and suit, create their card
    // and search the hand here.
    // Hint: You can ask for values 1 to 10, and then
    // 11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
    // 1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
    //
    // Then loop through the cards in the array to see if there's a match.

    // If the guess is successful, invoke the printInfo() method below.

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * 
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Hammad");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Playing Games");
        System.out.println("-- Listining to Music");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my bicycle");

        System.out.println();

    }

}