package zombieDice;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Rounds {
        //Should set shots and brains to 0 and dice != runner (see below)
        //check if strikes are lower then 3 if not end round
        //run turns until round is over
        //stores brains until round is over
        //give option to end round and collect current brains
        //we need to set the dice array in turns to shots or brains, This way we don't carry the runners from the last round


    public static void Round(int playerNumber, List<Players> Player){
        Scanner scanner = new Scanner(System.in);

        Turns.resetTurns();
        System.out.println(Player.get(playerNumber).getPlayerName() + "'s Turn!");
        int shots = 0;
        int brains = 0;
        while (shots < 3) {
            Turns.takeTurn();
           // shots = Turns.returnShots();
            System.out.println(shots);
            shots = Turns.returnShots();
            brains = Turns.returnBrains();
            System.out.println("You got " + brains + " brains");
            System.out.println("Total brains: " + Player.get(playerNumber).getBrains());
            System.out.println("would you like to roll again or eat your brains(r or b)");
            String roll = scanner.nextLine();
            if (roll.equalsIgnoreCase("b")){
                shots = 3;
                Player.get(playerNumber).addbrain(brains);
            }
        }


     //   Turns.resetTurns();



        //Placeholder2 players = new Placeholder2();
    }
}
