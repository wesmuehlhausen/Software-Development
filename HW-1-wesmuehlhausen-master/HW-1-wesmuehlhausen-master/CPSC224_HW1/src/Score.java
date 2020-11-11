//Yahtzee game that runs yahtzee
//CPSC224
//Homework 1
//Wesley Muehlhausen
//Feb 2 2020

public class Score {

    private int[] curDice = new int[5];
    private int[] scoreCard = new int [6];
    //private int[] curDiceTest = new int []{1,1,1,1,1};

    public Score() {
        for(int i = 0; i < this.curDice.length; i++) {
            this.curDice[i] = 1;
            this.scoreCard[i] = 0;
        }
    }
    //set function
    public void setDice(int num, int pos){
        curDice[pos] = num;
    }

    public void sortDice(){
        //Uses basic bubble sorting technique to sort hand
        boolean swapped = true;
        int limit = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            limit++;
            for (int i = 0; i < curDice.length - limit; i++) {
                if (curDice[i] > curDice[i + 1]) {
                    tmp = curDice[i];
                    curDice[i] = curDice[i + 1];
                    curDice[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

        //Displays the sorted Hand
        System.out.print("Sorted Hand: ");

        for(int i = 0; i < curDice.length; i++){
            System.out.print(curDice[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    //scores chance points
    public void scoreChance(){
        for(int i = 0; i < curDice.length; i++){
            if(curDice[i] == 1){scoreCard[0] += 1;}
            if(curDice[i] == 2){scoreCard[1] += 2;}
            if(curDice[i] == 3){scoreCard[2] += 3;}
            if(curDice[i] == 4){scoreCard[3] += 4;}
            if(curDice[i] == 5){scoreCard[4] += 5;}
            if(curDice[i] == 6){scoreCard[5] += 6;}
        }

    }

    //scores 3OC points
    public int scoreThreeOfAKind() {
        for(int i = 1; i < curDice.length -1; i++){
            if(curDice[i] == curDice[i-1] && curDice[i] == curDice[i+1]){
                return chance();
            }
        }
        return 0;
    }

    //scores 4OC points
    public int scoreFourOfAKind(){
        for(int i = 1; i < curDice.length - 2; i++){
            if(curDice[i] == curDice[i-1] && curDice[i] == curDice[i+1])
                if(curDice[i] == curDice[i+2]){
                    return chance();
                }
        }
        return 0;
    }

    //scores FH points
    public int scoreFullHouse(){
        int match = 0;
        for(int i = 0; i < curDice.length-1; i++){
           if(curDice[i] == curDice[i+1]){
               match++;
           }
        }
        if(match == 3){
            return 25;
        }
        else return 0;

    }

    //scores yahtzee points
    public int checkYat(){
        for(int i = 1; i < curDice.length - 2; i++){
            if(curDice[i] == curDice[i-1] && curDice[i] == curDice[i+1])
                if(curDice[i+1] == curDice[i+2] && curDice[i+2] == curDice[i+3]){
                    return 50;
                }
        }
        return 0;
    }

    //scores Small Straight points
    public int scoreSmallStraight(){
        int key1 = 0;
        int key2 = 0;
        for(int i = 0; i < curDice.length-2; i++) {
            if(curDice[i] == curDice[i+1]-1) {
                key1++;
            }
        }
        for(int i = 1; i < curDice.length-1; i++) {
            if(curDice[i] == curDice[i+1]-1) {
                key2++;
            }
        }
        if(key1 == 3 || key2 == 3){
            return 30;
        }
        else return 0;
    }

    //scores large straight points
    public int scoreLargeStraight(){
        int num = 0;
        for(int i = 0; i < curDice.length-1; i++){
            if(curDice[i] == curDice[i+1]-1){
                num++;
            }
        }
        //System.out.println(num); //matches
        if(num == 4){
            return 40;
        }
        else return 0;
    }

    //adds chance points
    public int chance(){
        int num = 0;
        for(int i = 0; i < curDice.length; i++){
            if(curDice[i] == 1){num += 1;}
            if(curDice[i] == 2){num += 2;}
            if(curDice[i] == 3){num += 3;}
            if(curDice[i] == 4){num += 4;}
            if(curDice[i] == 5){num += 5;}
            if(curDice[i] == 6){num += 6;}
        }
        return num;
    }

    //outputs the scores
    public void showScorecard(){
        sortDice();
        scoreChance();

        System.out.println("Score " + scoreCard[0] + " on the 1 line");
        System.out.println("Score " + scoreCard[1] + " on the 2 line");
        System.out.println("Score " + scoreCard[2] + " on the 3 line");
        System.out.println("Score " + scoreCard[3] + " on the 4 line");
        System.out.println("Score " + scoreCard[4] + " on the 5 line");
        System.out.println("Score " + scoreCard[5] + " on the 6 line");
        System.out.println("Score " + scoreThreeOfAKind() + " on the 3 of a Kind Line");
        System.out.println("Score " + scoreFourOfAKind() + " on the 4 of a Kind Line");
        System.out.println("Score " + scoreFullHouse() + " on the Full House Line");
        System.out.println("Score " + scoreSmallStraight() + " on the Small Straight Line");
        System.out.println("Score " + scoreLargeStraight() + " on the Large Straight Line");
        System.out.println("Score "  + chance() + " on Chance Line");
        System.out.println("Score "  + checkYat() + " on Yahtzee Line");
    }
}
