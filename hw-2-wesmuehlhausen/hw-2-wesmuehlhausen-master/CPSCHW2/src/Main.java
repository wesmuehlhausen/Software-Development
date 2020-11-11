/**
 * This program runs a game of yahtzee. It is single player and ony
plays a single turn. Each turn the game can be configured by the
user to set the amount of dice in hand, the amount of sides on
the dice, as well as how many rolls per turn. This program also has
scoring and file I/O capabilities.
 * CPSC224, Spring 2020
 * No Sources to cite
 * @author Wesley Muehlhausen
 * @version v1.0 02/14/2020
*/

public class Main {
    public static void main(String[] args) {
        Player play = new Player();
        play.loadFile();//loads file
        play.playGame();//runs game
        play.closeFile();//closes file
    }
}
