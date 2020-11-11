//Yahtzee game that runs yahtzee
//CPSC224
//Homework 1
//Wesley Muehlhausen
//Feb 2 2020

import java.util.Random;
import java.util.Scanner;

public class Dice {
    Random randRef = new Random();
    Scanner keyB = new Scanner(System.in);
    Hand hand = new Hand();
    Score score = new Score();
       private int sides;
    private int face;
    private int[] diceNums = new int[5];
    private boolean reRoll;
    private boolean newGame;
    private int rolls;

    //Default value constructor
    public Dice() {
        this.sides = 6;
        this.face = 0;
        this.reRoll = true;
        this.rolls = 0;
        this.newGame = true;

    }

    // sets the number of sides the die has
//    public void setNumSides(int sides){
//        this.sides = sides;
//    }



    //simple get
    public int getRoll(int pos) {
        return diceNums[pos];
    }

    //sets value of die
    public void rollDie(int pos) {
        this.diceNums[pos] = randRef.nextInt(sides) + 1;
    }

    //displays the roll and asks if they want to reRoll. Most of the program
    public void configureDie(){
        System.out.print("Your roll was: ");
        for(int i = 0; i < diceNums.length; i++){
                if(hand.getHand(i) == 'n'){
                    rollDie(i);
                }
                score.setDice(getRoll(i), i);
                System.out.print(getRoll(i) + " ");
                }
            System.out.println(" ");
    }

    //runs game. this is where everything is called.
   public void runGame() {
       while (newGame == true) {
           while (reRoll == true && rolls < 2) {
               configureDie();
               hand.yesNo();
               hand.setHand(keyB.nextLine());
               if (hand.allYes() == true) {
                   reRoll = false;
               }
               rolls++;
           }
           if (hand.allYes() == false) {
               configureDie();
           }
           score.showScorecard();


           hand.setContinue();
           newGame = hand.continueGame(keyB.nextLine());
       }
   }



//    @Override
//    public String toString() {
//        return "Sides: " + sides + " Face: " + face;
//    }
}
