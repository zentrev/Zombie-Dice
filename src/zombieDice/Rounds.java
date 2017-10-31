package zombieDice;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Rounds {

    public static void Round(int playerNumber, List<Players> Player){
        Scanner scanner = new Scanner(System.in);

        Turns.resetTurns();
        System.out.println("\u001B[1m" + Player.get(playerNumber).getPlayerName() + "'s Turn!");
        int shots = 0;
        int brains = 0;
        String confirm;
        while (shots < 3) {
            Turns.takeTurn();
           // shots = Turns.returnShots();
            shots = Turns.returnShots();
            brains = Turns.returnBrains();
            if(shots < 3) {
                System.out.println("You got " + brains + " brains and you have " + shots + " Shots");
                System.out.println("Total brains: " + Player.get(playerNumber).getBrains());
                System.out.println("would you like to roll again or eat your brains(R/B)");
                String roll = scanner.nextLine();
                if (roll.equalsIgnoreCase("b")) {
                    shots = 3;
                    Player.get(playerNumber).addbrain(brains);
                    System.out.println("\u001B[1m" + "\u001B[32m" +Player.get(playerNumber).getPlayerName() + " ate the brains and how has " + Player.get(playerNumber).getBrains() + " Brains! (enter to continues)" + "\n");
                    confirm = scanner.nextLine();
                }
            }else{
                System.out.println("\u001B[1m" + "\u001B[31m" + "You took to many shots and lost " + brains + " Brains! (enter to continue)");
                confirm = scanner.nextLine();
            }
        }
    }
}
