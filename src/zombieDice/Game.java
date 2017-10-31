package zombieDice;

//import Frame.PlayerPanel;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Game {
    public static void startGame() {

        //makes players
        //goes threw every players rounds
        //once a player gets 13 brains run one round for every other player
        //end the game showing the winner

        //Variables
        Scanner scanner = new Scanner(System.in);
        List<Players> Player = new LinkedList<Players>();

        String playerx = "";
        String input;
        boolean makePlayer = true;
        boolean nameCheck = true;
        boolean playRounds = true;
        int listLength = 0;

        //Player Creation
        while (makePlayer) {
            while (nameCheck) {
                System.out.println("Please enter the name of the Player: ");
                playerx = scanner.nextLine();
                if (!playerx.equals("")) {
                    nameCheck = false;
                }
            }

            Player.add(new Players(playerx));
            //PlayerPanel.PlayerEdit(playerx);

            System.out.println("Is there another player?: (yes/no)");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                makePlayer = false;
            }else{
                nameCheck = true;
            }
        }

        //Finds number of players
        for (Players x : Player) {
            listLength++;
        }

        //plays rounds
        while (playRounds){
            for (int i = 0; i < listLength; i++){
                Rounds.Round(i, Player);
                if (Player.get(i).braincount() >= 13) {
                    i = listLength+1;
                    playRounds = false;
                }
            }
            playRounds = false;
        }
    }
}

