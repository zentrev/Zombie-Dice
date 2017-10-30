//import Frame.MainFrame;
//import Frame.PlayerPanel;
import zombieDice.Game;

import javax.swing.*;

public class Main {
    //runs the game
    public static void main(String[] args) {


        //Just messing around with some dice visuals
        System.out.println("\u001b[32m"+
                "┍━━━━━━━━━━━━┓ \n" +
                "│  BRAIN!  │ \n" +
                "│    oO@o  │ \n" +
                "│  oO@@O@' │ \n" +
                "┕━━━━━━━━━━━━┙  ");
        System.out.println("\u001b[33m"+
                "┍━━━━━━━━━━━━┓ \n" +
                "│  Runner  │ \n" +
                "│ O>    O> │ \n" +
                "│>   O>   O│ \n" +
                "┕━━━━━━━━━━━━┙ ");
        System.out.println("\u001b[31m" +
                "┍━━━━━━━━━━━━┓ \n" +
                "│   Shot   │ \n" +
                "│   ===&#  │ \n" +
                "│  //      │ \n" +
                "┕━━━━━━━━━━━━┙ ");
        //uncomment below me to see
//        SwingUtilities.invokeLater(new Runnable(){
//            public void run() {
//                new MainFrame();
//            }
//        });
//        Game game = new Game();
        Game.startGame();
    }
}

