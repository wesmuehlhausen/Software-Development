import java.util.ArrayList;
import java.util.Collections;
/**
 *This class is pretty straight forward, it takes in the faces of the dice
 * and scores them for each of the possible scoring categories.
 * CPSC224, Spring 2020
 * No Sources to cite
 * @author Wesley Muehlhausen
 * @version v2.0 02/28/2020
 */

public class Score {
    protected int sides;
    protected int dice;
    protected int rolls;
    protected ArrayList<Integer> hand = new ArrayList<Integer>();
    protected ArrayList<Boolean> alreadyUsed = new ArrayList<Boolean>();

    /**
     Constructor for Score class
     */
    public Score(){
        sides = 0;
        dice = 0;
        rolls = 0;
    }

    /**
     * This prints out the score for each turn by calling all of the below score methods
     */
    public void showScore(){
        //System.out.println("Dice before Scoring " + hand);
        for (int i = 0; i < sides; i++){
            if(alreadyUsed.get(i) == false)
                System.out.println("[" + (i + 1) + "] Score on Line " +  (i + 1) + ":             " + indivChance(i));
        }
        System.out.println(" ");
        if(alreadyUsed.get(sides) == false)
            System.out.println("[TK] Score for 3 of Kind:        "  + threeOfK());
        if(alreadyUsed.get(sides + 1) == false)
            System.out.println("[FK] Score for 4 of Kind:        "  + fourOfK());
        if(alreadyUsed.get(sides + 2) == false)
            System.out.println("[FH] Score for Full House:       " + fullHouse());
        if(alreadyUsed.get(sides + 3) == false)
            System.out.println("[SS] Score for Small Straight:   " + smallStr());
        if(alreadyUsed.get(sides + 4) == false)
            System.out.println("[LS] Score for Large Straight:   " + largeStr());
        if(alreadyUsed.get(sides + 5) == false)
            System.out.println("[C]  Score for Chance:           "  + chanceLine());
        if(alreadyUsed.get(sides + 6) == false)
            System.out.println("[Y]  Score for Yahtzee:          "  + yahtzee());
    }

    /**
     *Similar to the setup hand method from the hand class, this method
     imports the same values except for the hand array of integers
     * @param dice is the number of dice in play
     * @param rolls is the number of rolls per turn
     * @param sides is the number of sides on each die
     */
    public void setupScore(int sides, int dice, int rolls){
        this.sides = sides;
        this.dice = dice;
        this.rolls = rolls;
        int size = sides + 7;
        for(int i = 0; i < size; i++)
            alreadyUsed.add(false);
        for(int i = 0; i < dice; i++)
            hand.add(0);
    }

    /**
     * Updates the hand for scoring otherwise the scoring would score the previous hand
     * @param pos is the index of where the value is loaded
     * @param value is the value which goes into the hand at the index position
     */
    public void updateScore(int pos, int value){
        hand.set(pos, value);
    }

    /**
     * Sorts the hand so scoring functions work
     */
    public void sortScore(){
        Collections.sort(hand);
    }
//
    /**
     *This method finds three of a kind by looping through and checking if
     an element has the same value as both the elements before and after
     and also prints out the score
     * @return the score of the function
     */
    public int threeOfK(){
        boolean triple = false;
        for(int i = 1; i < dice-1; i++){
            if(hand.get(i) == hand.get(i-1) && hand.get(i) == hand.get(i+1)){
                triple = true;
            }
        }
        if(triple == true)
            return chanceLine();
        else
            return 0;
    }

    /**
     *This method takes the logic from 3OK and checks one more element on top
     of that which then prints the result
     *@return the score of the function
     */
    public int fourOfK(){
        boolean quad = false;
        for(int i = 1; i < dice - 2; i++){
            if(hand.get(i) == hand.get(i-1) && hand.get(i) == hand.get(i+1))
                if(hand.get(i) == hand.get(i+2)){
                    quad = true;
                }
        }
        if(quad == true)
            return chanceLine();
        else
            return 0;
    }

    /**
     * fullHouse first finds three of a kind, and then if that is true, it then
     loops through again to find a pair of which is not the same value as the
     set of three. Then prints it.
     *@return the score of the function
     */
    public int fullHouse() {
        boolean triples = false;
        boolean doubles = false;
        if (dice >= 5) {
            int key = -1;
            //checks for a three of a kind
            for (int i = 1; i < dice - 1; i++) {
                if (hand.get(i) == hand.get(i-1) && hand.get(i) == hand.get(i+1)) {
                    triples = true;
                    key = hand.get(i);
                }
            }
            if (triples == true) {//if there is a set of three...
                for (int i = 0; i < dice - 1; i++) {
                    if(hand.get(i) == hand.get(i+1) && hand.get(i) != key) {
                        doubles = true;
                    }
                }
            }
        }
        if(doubles == true)
            return 25;
        else
            return 0;
    }

    /**
     * checks for small straight by looping through and seeing if the following
     element is one larger than the current element.
     *@return the score of the function
     */
    public int smallStr(){
        int num = 0;
        for(int i = 0; i < hand.size()-1; i++){
            if(hand.get(i) == hand.get(i+1)-1){
                num++;
            }
        }
        if(num >= 3){
            return 30;
        }
        else
            return 0;
    }

    /**
     * Same as the small straight method but has to be 5 in a row instead of 4
     *@return the score of the function
     */
    public int largeStr(){
        int num = 0;
        for(int i = 0; i < hand.size()-1; i++){
            if(hand.get(i) == hand.get(i+1)-1){
                num++;
            }
        }
        if(num >= 4){
            return 40;
        }
        else
            return 0;
    }

    /**
     *checks for yahtzee which is all the same. if one is not the same as another
     if will give a score of 0. This is not made for just 5 in a row, they all have
     to be the same
     *@return the score of the function
     */
    public int yahtzee(){
        boolean allSame = true;
        for(int i = 0; i < dice; i++){
            if(hand.get(i) != hand.get(0))
                allSame = false;
        }
        if(allSame == true)
            return 50;
        else
            return 0;
    }

    /**
     * this function calculates and prints the score for each chance slot not to
     be confused with the total chance column.
     * @param pos determines which individual chance line to score
     *@return the score of the function
     */
    public int indivChance(int pos) {
        int[] scorecard = new int[sides];
        for(int die = 0; die < dice; die++){//for every die
            for(int side = 1; side <= sides; side++){//check if each side matches with the current face
                if(hand.get(die) == side)
                    scorecard[side-1] += side;
            }
        }
        return scorecard[pos];
    }

    /**
     * The chance line is the sum of all the single chance lines. I have this as
     return type int instead of void because it is used as the score for some of
     the other methods too.
     * @return num is the score on the chance line
     */
    public int chanceLine(){
        int num = 0;
        for(int i = 0; i < dice; i++){
            num += hand.get(i);
        }
        return num;
    }

}
