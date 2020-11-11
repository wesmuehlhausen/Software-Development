
//Yahtzee game that runs yahtzee
//CPSC224
//Homework 1
//Wesley Muehlhausen
//Feb 2 2020


public class Hand {
    //private variables
    private char[] curHand = new char[5];
    private String curHandS;

    public Hand() {
        for(int i = 0; i < this.curHand.length; i++) {
            this.curHand[i] = 'n';
        }
        this.curHandS = "";
    }

    //simple out statement for asking which dice to keep
    public void yesNo() {
        System.out.print("enter dice to keep (y or n) ");
    }

    //simple out statement for asking to continue
    public void setContinue() {
        System.out.print("enter 'y' to continue ");
    }

    //returns if user wants to continue
    public boolean continueGame(String cont) {
        if(cont != "y"){
            return false;
        }
        else return true;
    }

    //turns string hand into chars for comparison
    public void setHand(String hand) {
        for (int i = 0; i < hand.length(); i++) {
            this.curHand[i] = hand.charAt(i);
        }
        this.curHandS = hand;
    }
    public String getHandS(){
        return this.curHandS;
    }
    public char getHand(int pos){
        return curHand[pos];
    }

    //checks to possibly skip asking the user again
    public boolean allYes(){
        int key = 0;
        for(int i = 0; i < curHand.length-1; i++){
            if(curHand[i] == curHand[i+1]){
                key++;
            }
        }
        //System.out.println(key);
        if(key == 4){return true;}
        else return false;
    }
//    @Override
//    public String toString() {
//        return "Value: " + this.curHand[3];


}