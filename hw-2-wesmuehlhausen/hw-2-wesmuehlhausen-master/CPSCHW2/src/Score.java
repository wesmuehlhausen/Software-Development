/**
 *This class is pretty straight forward, it takes in the faces of the dice
 * and scores them for each of the possible scoring categories.
 * CPSC224, Spring 2020
 * No Sources to cite
 * @author Wesley Muehlhausen
 * @version v1.0 02/14/2020
*/

public class Score {
    private int sides;
    private int dice;
    private int rolls;
    private Integer[] hand = new Integer[dice]; //stores the dice values

    /**
     * Calls all of the scoring methods in the class in the correct order
     which calculates and prints the scoreboard
     */
    public void showScorecard(){
        indivChance();
        threeOfK();
        fourOfK();
        fullHouse();
        smallStr();
        largeStr();
        System.out.println("Score "  + chanceLine() + " on Chance Line");
        yahtzee();
    }

    /**
     *Similar to the setup hand method from the hand class, this method
     imports the same values except for the hand array of integers
     * @param dice is the number of dice in play
     * @param hand is an int array of the dice faces rolled
     * @param rolls is the number of rolls per turn
     * @param sides is the number of sides on each die
     */
    public void setupScore(int sides, int dice, int rolls, Integer hand[]){
        this.sides = sides;
        this.dice = dice;
        this.rolls = rolls;
        this.hand = hand;

    }

    /**
     *This method finds three of a kind by looping through and checking if
     an element has the same value as both the elements before and after
     and also prints out the score
     */
    public void threeOfK(){
        boolean triple = false;
        for(int i = 1; i < dice-1; i++){
            if(hand[i] == hand[i-1] && hand[i] == hand[i+1])
                triple = true;
        }
        if(triple == true)
            System.out.println("Score "  + chanceLine() + " on the 3 of Kind Line");
        else
            System.out.println("Score "  + 0 + " on on the 3 of Kind Line");
    }

    /**
     *This method takes the logic from 3OK and checks one more element on top
     of that which then prints the result
     */
    public void fourOfK(){
        boolean quad = false;
        for(int i = 1; i < dice - 2; i++){
            if(hand[i] == hand[i-1] && hand[i] == hand[i+1])
                if(hand[i] == hand[i+2]){
                    quad = true;
                }
        }
        if(quad == true)
            System.out.println("Score "  + chanceLine() + " on the 4 of Kind Line");
        else
            System.out.println("Score "  + 0 + " on on the 4 of Kind Line");
    }

    /**
     * fullHouse first finds three of a kind, and then if that is true, it then
     loops through again to find a pair of which is not the same value as the
     set of three. Then prints it.
     */
    public void fullHouse() {
        boolean triples = false;
        boolean doubles = false;
        if (dice >= 5) {
            int key = -1;

            //checks for a three of a kind
            for (int i = 1; i < dice - 1; i++) {
                if (hand[i] == hand[i - 1] && hand[i] == hand[i + 1]) {
                    triples = true;
                    key = hand[i];
                }
            }
            if (triples == true) {//if there is a set of three...
                for (int i = 0; i < dice - 1; i++) {
                    if(hand[i] == hand[i + 1] && hand[i] != key) {
                        doubles = true;
                    }
                }
            }
        }
        if(doubles == true)
            System.out.println("Score " + 25 + " on on the Full House Line");
        else
            System.out.println("Score " + 0 + " on on the Full House Line");
    }

    /**
     * checks for small straight by looping through and seeing if the following
     element is one larger than the current element.
     */
    public void smallStr(){
        int num = 0;
        for(int i = 0; i < hand.length-1; i++){
            if(hand[i] == hand[i+1]-1){
                num++;
            }
        }
        if(num >= 3){
            System.out.println("Score " + 30 + " on on the Large Straight Line");
        }
        else
            System.out.println("Score " + 0 + " on on the Large Straight Line");
    }

    /**
     * Same as the small straight method but has to be 5 in a row instead of 4
     */
    public void largeStr(){
        int num = 0;
        for(int i = 0; i < hand.length-1; i++){
            if(hand[i] == hand[i+1]-1){
                num++;
            }
        }
        if(num >= 4){
            System.out.println("Score " + 40 + " on on the Large Straight Line");
        }
        else
            System.out.println("Score " + 0 + " on on the Large Straight Line");
    }

    /**
     *checks for yahtzee which is all the same. if one is not the same as another
     if will give a score of 0.
     */
    public void yahtzee(){
        boolean allSame = true;
        for(int i = 0; i < dice; i++){
            if(hand[i] != hand[0])
                allSame = false;
        }
        if(allSame == true)
            System.out.println("Score "  + 50 + " on Yahtzee Line");
        else
            System.out.println("Score "  + 0 + " on Yahtzee Line");
    }

    /**
     * this function calculates and prints the score for each chance slot not to
     be confused with the total chance column.
     */
    public void indivChance() {
        int[] scorecard = new int[sides];
        for (int i = 0; i < dice; i++)
            scorecard[hand[i] - 1] += hand[i];
        for (int i = 0; i < sides; i++)
            System.out.println("Score " + scorecard[i] + " on the " + (i + 1) + " line");
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
            num += hand[i];
        }
        return num;
    }
}
