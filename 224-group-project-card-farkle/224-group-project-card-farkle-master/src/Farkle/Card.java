package Farkle;

public class Card implements Comparable<Card> {
    private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final int suit;
    private final int faceValue;
    private boolean available;

    public Card(int faceValue, int suit) {
        this.faceValue = faceValue;
        this.suit = suit;
        available = true;
    }

    public int getSuit() {
        return suit;
    }
  
    public int getFaceValue() {
        return faceValue;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public int compareTo(Card card) {
        if (this.suit < card.suit)
            return -1;
        if (this.suit > card.suit)
            return 1;
        if (this.faceValue < card.faceValue)
            return -1;
        if (this.faceValue > card.faceValue)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return RANKS[faceValue] + " of " + SUITS[suit];
    }
}
