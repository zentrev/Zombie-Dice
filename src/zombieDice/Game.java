package zombieDice;

import java.util.Scanner;

public class Game {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);



        //makes players
        //goes threw every players rounds
        //once a player gets 13 brains run one round for every other player
        //end the game showing the winner


// for some reasons the two scanners are not the same

        boolean p = true;
        boolean n = true;
        String playerx = "";
        while (p) {
            while (n) {
                System.out.println("Please enter the name of the Player: ");
                playerx = scanner.nextLine();
                if (!playerx.equals("") && playerx.length() > 0) {
                    n = false;
                }
            }

            Players.add(new Players(playerx));
            System.out.println("Is there another player?: ");
            String input = scanner.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                p = false;
            }
        }

    }
}

