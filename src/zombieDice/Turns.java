package zombieDice;


import Frame.GamePanel;

import javax.swing.*;

public class Turns {

    //Varibles
    private static int shots = 0;
    private static int brains;
    private static Dice[] die = {new Dice(), new Dice(), new Dice()};


    //Runs turns
    public static void takeTurn() {


        //checks if we have a runner
        for (int i = 0; i < 3; i++) {
            if (!(die[i].getStatus()).equals("Runner")) {
                die[i].changeColor();
            }

            die[i].rollDice();
            if((die[i].getStatus()).equals("Brains")){
                brains++;
            }
            if((die[i].getStatus()).equals("SHOT!")){
                shots++;
            }
            System.out.println("\u001b[33m" + "the color is " + die[i].getColor() + ", the state is " + die[i].getStatus());

        }


    }

    //return statements
    public static int returnBrains() {
        return brains;
    }
    public static int returnShots() {
        return shots;
    }
    public static void resetTurns(){
        shots = 0;
        brains = 0;
    }
}
