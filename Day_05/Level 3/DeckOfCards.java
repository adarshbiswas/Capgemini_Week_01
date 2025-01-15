// Q.10 Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    // Initialize ranks and suits
    private static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
            "Ace" };

    public static void main(String[] args) {
        // Create and initialize the deck
        List<String> deck = initializeDeck();
        System.out.println("Original Deck:");
        System.out.println(deck);

        // Shuffle the deck
        shuffleDeck(deck);
        System.out.println("\nShuffled Deck:");
        System.out.println(deck);

        // Distribute cards to players
        int numberOfPlayers = 4; // Change as needed
        int cardsPerPlayer = 5; // Change as needed
        String[][] distributedCards = distributeCards(deck, numberOfPlayers, cardsPerPlayer);

        // Print players and their cards
        printPlayerCards(distributedCards);
    }

    // Method to initialize the deck
    private static List<String> initializeDeck() {
        List<String> deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    private static void shuffleDeck(List<String> deck) {
        for (int i = 0; i < deck.size(); i++) {
            int randomIndex = i + (int) (Math.random() * (deck.size() - i));
            Collections.swap(deck, i, randomIndex);
        }
    }

    // Method to distribute cards to players
    private static String[][] distributeCards(List<String> deck, int numberOfPlayers, int cardsPerPlayer) {
        if (numberOfPlayers * cardsPerPlayer > deck.size()) {
            throw new IllegalArgumentException("Not enough cards to distribute!");
        }

        String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck.get(cardIndex++);
            }
        }
        return players;
    }

    // Method to print players and their cards
    private static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }
}
