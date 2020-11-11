/**
 * This class is responsible for many operations regarding the mechanics of the
hand a player has. It consists of two ArrayLists, one that keeps track of
the dice in the hand and another for the input of a player in regards to keeping
the die or not. It can also sort and roll the dice in the hand as well as sorting
and other hand related methods. This class also calls the score class which does
the scoring for the game.
 * CPSC224, Spring 2020
 * No Sources to cite
 * @author Wesley Muehlhausen
 * @version v1.0 02/14/2020
*/

import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class Hand {
    //creating score object
    Score score = new Score();
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    private int sides; //Number of sides on a dice
    private int dice; //Number of dice in a hand
    private int rolls; //Number of rolls per turn
    private ArrayList<Integer> hand = new ArrayList<Integer>();//Arraylist of dice faces (int)
    private ArrayList<Character> keepHand = new ArrayList<Character>();//ArrayList of y or n (char)

    /**
     * This methods turns the arraylist hand into a normal array which
     is then exported to the Score class along with teh other private variables
     */
    public void scoreDice(){
        Integer[] handCopy = new Integer[hand.size()];
        hand.toArray(handCopy);
        score.setupScore(sides, dice, rolls, handCopy);
        score.showScorecard();
    }

    /**
     * Sorts the ArrayList hand into numerical order using a bubble sort
     */
    public void sortDice(){
        //Uses basic bubble sorting technique to sort hand
        boolean swapped = true;
        int limit = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            limit++;
            for (int i = 0; i < hand.size() - limit; i++) {
                if (hand.get(i) > hand.get(i+1)) {
                    tmp = hand.get(i);
                    hand.set(i, hand.get(i + 1));
                    hand.set(i+1, tmp);
                    swapped = true;
                }
            }
        }
        //Displays the sorted Hand
        System.out.print("Sorted Hand: ");
        for(int i = 0; i < hand.size(); i++)
            System.out.print(hand.get(i) + " ");
        System.out.println(" ");
    }

    /**
     * Sets up hand where it imports the three values from player (called in player)
     as well as sets initial values in the two ArrayLists to 0 and n
     * @param sides is the number of sides on each die
     * @param dice is the number of dice in play
     * @param rolls is the number of rolls in the turn
     */
    public void setupHand(int sides, int dice, int rolls){
        this.sides = sides;
        this.dice = dice;
        this.rolls = rolls;
        for(int i = 0; i < dice; i++){
           this.hand.add(0);
           this.keepHand.add('n');
        }
    }

    /**
     * For every due, if the user inputted an 'n' for that die when picking,
     that die is rerolled
     */
    public void rollDice(){
        for(int i = 0; i < dice; i++){
            if(keepHand.get(i) == 'n')
                hand.set(i, random.nextInt(sides) + 1);
        }
    }

    /**
     * Displays each one of the dice using a loop
     */
    public void showRoll(){
        System.out.print("Your roll was: ");
        for(int i = 0; i < dice; i++)
            System.out.print(hand.get(i) + " ");
        System.out.println(" ");
    }
    /**
     * Checks for all inputs being 'y' which means the user is happy with
     their hand and wants to skip to the scoring process
     * @return allYes which means user inputted yyyyy... returns false when all 'y'
     */
    public boolean askReRoll(){
        boolean allYes = false;
        System.out.print("Enter dice to keep: ");
        String handYN = input.next();
            for(int i = 0; i < dice; i++) {
                keepHand.set(i, handYN.charAt(i));
                if(handYN.charAt(i) != 'y')
                    allYes = true;
            }
    return allYes;
    }

    /**
     * At the end of the game if the user wants to play the game again
      they can input 'y' for yes
     * @return playAgain will make the game loop back from the beginning
     */
    public boolean playAgain(){
        boolean playAgain = false;
        System.out.print("Enter 'y' to play again: ");
        String inputYN = input.next();
            if(inputYN.charAt(0) == 'y')
                playAgain = true;
            for(int i = 0; i < 3; i++)
                System.out.println(" ");
            return playAgain;
        }
    }

