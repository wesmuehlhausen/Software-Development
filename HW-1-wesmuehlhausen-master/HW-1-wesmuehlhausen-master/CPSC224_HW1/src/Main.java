//Yahtzee game that runs yahtzee
//CPSC224
//Homework 1
//Wesley Muehlhausen
//Feb 2 2020

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyB = new Scanner(System.in);

        //creates object and runs game
        Dice dice = new Dice();
        dice.runGame();

    }

}
