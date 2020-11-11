package Farkle;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Deck {
    private int numDecks;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(int numDecks) {
        this.numDecks = numDecks;
        for (int index = 0 ; index < numDecks ; ++index) {
            for (int i = 0; i <= 3; ++i) {
                for (int j = 0; j <= 12; ++j) {
                    Card card = new Card(j, i);
                    cards.add(card);
                }
            }
        }
    }

    public void printAllCards() {
        for (Card card : cards) {
            if (card.isAvailable())
                System.out.println("    FREE " + card);
            else
                System.out.println("NOT FREE " + card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public Card getAt(int index){
        return cards.get(index);
    }

    // Class Functions
    public boolean checkAvailable(int exactIndex) {
        boolean available = true;
        Card card = cards.get(exactIndex);
          if (!card.isAvailable())
            available = false;
        return available;
    }

    public Card getCard(int cardValue, int suit) {
        cardValue = cardValue * numDecks;
        Collections.sort(cards);
        for (int deckOffset = 0 ; deckOffset < numDecks ; ++deckOffset) {
            int offset = 13 * suit + deckOffset;
            int exactIndex = offset + cardValue;

            if (checkAvailable(exactIndex)) {
                cards.get(exactIndex).setAvailable(false);
                return cards.get(offset + cardValue);
            }
        }
        return null;
    }

    public Card drawRandCard() {
        for (int tries = 1; tries <= numDecks * 52; ++tries) {
            Collections.shuffle(cards);
            Card card = cards.get(0);
            if (card == null) {
                break;
            }
            Collections.sort(cards);
            int suitOffset = 13 * card.getSuit() * numDecks;
            int rankOffset = card.getFaceValue() * numDecks;
            int exactIndex = suitOffset + rankOffset;
            for (int i = 0; i < numDecks; ++i) {
                Card newCard = cards.get(exactIndex + i);
                int tmmp = exactIndex + i;
                if (newCard.isAvailable()) {
                    newCard.setAvailable(false);
                    return newCard;
                }
            }
        }
        return null;
    }

    public void putBackInDeck(ArrayList<Card> retCards) {
        Collections.sort(retCards);
        Collections.sort(cards);

        for (Card retCard : retCards) {
            int suit = retCard.getSuit();
            int rank = retCard.getFaceValue();
            int suitOffset = 13 * suit * numDecks;
            int rankOffset = rank * numDecks;
            int exactIndex = suitOffset + rankOffset;
            for (int i = 0; i < numDecks; ++i) {
                Card card = cards.get(exactIndex + i);
                if (!card.isAvailable()) {
                    card.setAvailable(true);
                    break;
                }
            }
        }
    }

    public void resetDeck() {
        for (Card card : cards) {
            card.setAvailable(true);
        }
    }
}
