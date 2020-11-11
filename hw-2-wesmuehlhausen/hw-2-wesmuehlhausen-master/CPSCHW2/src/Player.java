/**
 * This class has a couple of responsibilities. It is responsible for the file
 for loading the file and closing the file at the end as well as calling the
 dice class to carry out the game operations.
 * CPSC224, Spring 2020
 * No Sources to cite
 * @author Wesley Muehlhausen
 * @version v1.0 02/14/2020
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Player {
    Hand hand = new Hand();//new object named hand

    private int sides; //Number of sides on a dice
    private int dice; //Number of dice in a hand
    private int rolls; //Number of rolls per turn

    /**
     * Player is the constructor for the class
     */
    public Player(){
        this.sides = 6;
        this.dice = 5;
        this.rolls = 3;
    }
    /**
     * Although not used in this code, this method is used for displaying
     the dice values for observation
     */
    public void displayConfigurations(){
        System.out.println("Game settings: ");
        System.out.println("Sides: " + this.sides);
        System.out.println("Dice:  " + this.dice);
        System.out.println("Rolls: " + this.rolls);
    }
    /**
     * This methods runs the game using the hand object. It loops through
     and sets up the game and plays it until the user tells the program
     to stop. Inside that loop there is another loop that controls the
     gameplay like setting the parameters, rolling, and scoring the dice.
     */
    public void playGame(){
        do {
            setupConfigurations();
            hand.setupHand(sides, dice, rolls);
            boolean loop = true;
            int loops = 0;
            while (loop == true) {
                loops++;
                hand.rollDice();
                hand.showRoll();
                if (loops >= rolls) break;
                loop = hand.askReRoll(); //runs reRoll and sets loop at the same time
            }
            hand.sortDice();
            hand.scoreDice();
            //playAgain = hand.playAgain();
        }while(hand.playAgain());
    }
    /**
     * This method asks the user if they want to change any of the preset
     parameters of the game such as number of dice and then loads those
     changes into the game
     */
    public void setupConfigurations() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("You are playing with " + this.dice + " " + this.sides + "-sided dice");
        System.out.println("You get " + rolls + " rolls per hand");
        System.out.println(" ");
        System.out.print("Enter 'y' if you would like to change the configuration: ");
        char value = scnr.nextLine().charAt(0);
        if(value == 'y') {
            System.out.print("Enter the number of sides on each die: ");
            this.sides = Integer.parseInt(scnr.nextLine());
            System.out.print("Enter the number of dice in play: ");
            this.dice = Integer.parseInt(scnr.nextLine());
            System.out.print("Enter the number of rolls per hand: ");
            this.rolls = Integer.parseInt(scnr.nextLine());
        }
    }
    /**
     *This method loads scorecard.txt which holds the three parameters: sides,
     dice, and rolls.
     */
    public void loadFile() {
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("scorecard.txt"));
            while (inFile.hasNextLine()) {//next three lines are put into variables
                this.sides = Integer.parseInt(inFile.nextLine());
                this.dice = Integer.parseInt(inFile.nextLine());
                this.rolls = Integer.parseInt(inFile.nextLine());
              }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("scorecard.txt not found");
        }
    }
    /**
     *This method sets the new parameter and then closes the txt file
     */
    public void closeFile() {
        try {
            PrintStream outFile = new PrintStream(new File("scorecard.txt"));
            outFile.println(this.sides); // these three lines output our values
            outFile.println(this.dice);// back into the file.
            outFile.println(this.rolls);
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file for writing");
        }
    }
}
