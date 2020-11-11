import java.util.ArrayList;
import java.util.Scanner;

/**
 *This class inherets from the Score class and uses its methods to create a scorecard
 * CPSC224, Spring 2020
 * No Sources to cite
 * @author Wesley Muehlhausen
 * @version v2.0 02/28/2020
 */

public class Scorecard extends Score {
    Scanner input2 = new Scanner(System.in);
    private int subTotal;//Subtotal Score
    private int bonus;//Bonus value
    private int upperTotal;
    private int lowerTotal;
    private int grandTotal;
    private int linesLeft;//Number of rounds left in game. At 0 the game over pops up

    private ArrayList<String> rows = new ArrayList<String>();//Keeps track of the name of each row ex. "Y" for yahtzee
    private ArrayList<Integer> score = new ArrayList<Integer>();//Keeps track of scores for each line in scorecard

    /**
     * Constructor for Scorecard default values 0
     */
    public Scorecard() {
        super();
        this.subTotal = 0;
        this.bonus = 0;
        this.upperTotal = 0;
        this.lowerTotal = 0;
        this.grandTotal = 0;
    }

    /**
     * creates an empty scorecard so the viewScorecard method has something to print
     */
    public void createScorecard() {
        linesLeft = sides + 7;
        for (int i = 1; i <= sides; i++) {
            rows.add(i + "");
            score.add(0);
        }
        for (int i = 0; i < 7; i++)
            score.add(0);
        rows.add("TK");
        rows.add("FK");
        rows.add("FH");
        rows.add("SS");
        rows.add("LS");
        rows.add("C ");//size 7
        rows.add("Y ");
    }

    /**
     * Displays the contents of the scorecard. Including subtotal, bonus, lower, upper, and grand scores
     */
    public void viewScorecard() {

        if (subTotal >= 63) {
            bonus = 35;
        } else {
            bonus = 0;
        }
        System.out.println("Line              Score");
        System.out.println("-----------------------");
        for (int i = 1; i <= sides; i++) {
            System.out.println(rows.get(i - 1) + "                     " + score.get(i - 1));
        }
        System.out.println("-----------------------");
        System.out.println("Sub Total             " + subTotal);
        System.out.println("Bonus                 " + bonus);
        System.out.println("-----------------------");
        System.out.println("Upper Total           " + (upperTotal + bonus));
        System.out.println("_______________________");
        System.out.println(" ");

        for (int i = sides + 1; i <= sides + 7; i++)
            System.out.println(rows.get(i - 1) + "                    " + score.get(i - 1));
        System.out.println("-----------------------");
        System.out.println("Lower Total           " + lowerTotal);
        System.out.println("-----------------------");
        System.out.println("Grand Total           " + (grandTotal + bonus));
        System.out.println("_______________________");
    }

    /**
     * This function scores the line. User inputs which line they want to be scored ex "FH"
     * and it updates the scorecard with the score that was selected.
     */
    public void scoreLine() {
        System.out.print("Line to be scored: ");
        String inputYN = input2.next();

        //UPPER SCORECARD
        if (inputYN.charAt(0) == 'T' && inputYN.charAt(1) == 'K') {
            if (alreadyUsed.get(sides) == false) {
                alreadyUsed.set(sides, true);
                score.set(sides, threeOfK());
                lowerTotal += threeOfK();
                grandTotal += threeOfK();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else if (inputYN.charAt(0) == 'F' && inputYN.charAt(1) == 'K') {
            if (alreadyUsed.get(sides + 1) == false) {
                alreadyUsed.set(sides + 1, true);
                score.set(sides + 1, fourOfK());
                lowerTotal += fourOfK();
                grandTotal += fourOfK();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else if (inputYN.charAt(0) == 'F' && inputYN.charAt(1) == 'H') {
            if (alreadyUsed.get(sides + 2) == false) {
                alreadyUsed.set(sides + 2, true);
                score.set(sides + 2, fullHouse());
                lowerTotal += fullHouse();
                grandTotal += fullHouse();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else if (inputYN.charAt(0) == 'S' && inputYN.charAt(1) == 'S') {
            if (alreadyUsed.get(sides + 3) == false) {
                alreadyUsed.set(sides + 3, true);
                score.set(sides + 3, smallStr());
                lowerTotal += smallStr();
                grandTotal += smallStr();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else if (inputYN.charAt(0) == 'L' && inputYN.charAt(1) == 'S') {
            if (alreadyUsed.get(sides + 4) == false) {
                alreadyUsed.set(sides + 4, true);
                score.set(sides + 4, largeStr());
                lowerTotal += largeStr();
                grandTotal += largeStr();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else if (inputYN.charAt(0) == 'C') {
            if (alreadyUsed.get(sides + 5) == false) {
                alreadyUsed.set(sides + 5, true);
                score.set(sides + 5, chanceLine());
                lowerTotal += chanceLine();
                grandTotal += chanceLine();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else if (inputYN.charAt(0) == 'Y') {
            if (alreadyUsed.get(sides + 6) == false) {
                alreadyUsed.set(sides + 6, true);
                score.set(sides + 6, yahtzee());
                lowerTotal += yahtzee();
                grandTotal += yahtzee();
            } else {
                System.out.println("ERROR: ALREADY USED");
            }
        } else {
            int result = Integer.parseInt(inputYN);
            //UPPER SCORECARD
            for (int i = 0; i < sides; i++) {
                if (result == i + 1) {
                    if (alreadyUsed.get(i) == false) {
                        alreadyUsed.set(i, true);
                        score.set(i, indivChance(i));
                        upperTotal += indivChance(i);
                        subTotal += indivChance(i);
                        grandTotal += indivChance(i);
                    } else {
                        System.out.println("ERROR: ALREADY USED");
                    }
                }
            }
        }
        System.out.println("Turns left: " + linesLeft);
        System.out.println("_______________________");
        linesLeft--;
        if (linesLeft == 0) {
            System.out.println("GAME OVER");
            System.out.println("FINAL SCORE " + grandTotal);
        } else {
            System.out.println("STARTING NEW HAND: ");
        }
    }
}
