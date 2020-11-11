package Farkle;



import java.util.ArrayList;
/////////////////////////////////////////////////
//Use this code to test it and see how it works:
//        hand.showHand();
//        hand.selectCard(1, true);
//        hand.selectCard(3, true);
//        hand.shuffleHand();
//        hand.showHand();
//        hand.sortHand();
//        hand.showHand();
/////////////////////////////////////////////////
public class Hand {
    private static final int NUM_DECKS = 2;
    private final int cards;
    private int cardsInHand;
    private ArrayList<Card> hand = new ArrayList<Card>(); //The array of cards
    private ArrayList<Card> handToScore = new ArrayList<Card>();
    private ArrayList<Card> returnCards = new ArrayList<Card>(); //Cards in this array are put back into the deck
    private ArrayList<Boolean> keepCard = new ArrayList<Boolean>();//This keeps track of which cards are to be kept or na

    Deck deck = new Deck(NUM_DECKS);//uses two decks.

    public Hand(){
        this.cards = 8;
        this.cardsInHand = 8;
        for(int i = 0; i < cards; i++) {
            hand.add(deck.drawRandCard());
            keepCard.add(false);//all cards set to not keep initially
        }
    }

    public void setKeepCard(int pos, boolean value){
        keepCard.set(pos, value);
    }

    public boolean getKeepCard(int pos){
        return keepCard.get(pos);
    }


    public void setNumberofCards(int num){
         cardsInHand = num;
    }

    public void removeAllCards()
    {
        hand.clear();
        cardsInHand = 0;
    }
    
    public void setCard(int suit, int value)
    {
        Card tmpCard = new Card(value, suit);
        tmpCard.setAvailable(true);
        hand.add(tmpCard);
        ++cardsInHand;
    }
    
    public void removeCard()
    {
        hand.remove(0);
        cardsInHand--;
    }


    public void shuffleHand(){
        //If the card is not kept, the card is added to the return array
        for(int i = 0; i < cardsInHand; i++){
            if(keepCard.get(i) == false)
                returnCards.add(hand.get(i));
        }
        //put cards back in deck
        deck.putBackInDeck(returnCards);

        //clear the remove cards ArrayList for next use
        for(int i = 0; i < returnCards.size(); i++)
            returnCards.remove(i);

        //Replace the cards that aren't selected to be kept
        for(int i = 0; i < cardsInHand; i++){
            if(keepCard.get(i) == false)
                hand.set(i, deck.drawRandCard());
        }
    }



    //If a card is set to TRUE: Card will stay in deck through shuffleDeck()
    //If a card is set to FALSE: Card will get disposed when shuffleDeck()
    public void selectCard(int pos, Boolean keepThisCard){
        keepCard.set(pos, keepThisCard);
    }

    //get a card's value
    public int getCardValue(int pos){
        return hand.get(pos).getFaceValue();
    }
    
    public boolean getCardAvailability(int pos)
    {
        return hand.get(pos).isAvailable();
    }
    
    public void setCardAvailibility(int pos, boolean bool)
    {
        hand.get(pos).setAvailable(bool);
    }

    //get the number of cards
    public int getCards(){return cardsInHand;}

    //get a card's suit
    public int getCardSuit(int pos){return hand.get(pos).getSuit();}

    public void sortHand(){
        //Uses basic bubble sorting technique to sort hand
        boolean swapped = true;
        int limit = 0;
        Card tmp;
        while (swapped) {
            swapped = false;
            limit++;
            for (int i = 0; i < cardsInHand - limit; i++) {
                //If the card has an equal value but the suits are out of order, swap the cards
                  if(hand.get(i).getFaceValue() > hand.get(i+1).getFaceValue() && hand.get(i).getSuit() > hand.get(i+1).getSuit()){
                      tmp = hand.get(i);
                      hand.set(i, hand.get(i+1));
                      hand.set(i+1, tmp);
                      swapped = true;
                  }
                  //If the card has a larger face value than the next one, swap.
                  else if(hand.get(i).getFaceValue() > hand.get(i+1).getFaceValue()){
                      tmp = hand.get(i);
                      hand.set(i, hand.get(i+1));
                      hand.set(i+1, tmp);
                      swapped = true;
                  }
            }
        }
    }

    public void setAllCardAvalibility(boolean bool)
    {
        for (int i = 0; i < cardsInHand; ++i)
        {
            setCardAvailibility(i, bool);
        }   
    }
    //Use to see whats going on
    public void showHand(){
        System.out.println(hand);
        //System.out.println(keepCard);
    }
    
    public String getCardName(int pos) {
        return hand.get(pos).toString();
    }
    
    public void shuffleWholeHand() {
        deck.resetDeck();
        hand.clear();
        cardsInHand = 8;
        
        for(int i = 0; i < cardsInHand; i++) {
            hand.add(deck.drawRandCard());
            keepCard.set(i, false);
        } 
        
    }
    
    public void printCards() {
        deck.printAllCards();
    }
}
