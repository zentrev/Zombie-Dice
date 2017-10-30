package zombieDice;



public class Turns {

    //Varibles
    private static int shots = 0;
    private static int brains;
    private static Dice[] die = {new Dice(), new Dice(), new Dice()};


    //Runs turns
    public static void takeTurn() {

        die[0].setColor("green");
        die[1].setColor("yellow");
        die[2].setColor("red");

        //checks if we have a runner
        for (int i = 0; i < 3; i++) {
            if (!(die[i].getStatus()).equals("runner")) {
                System.out.println("Insert randomize for dice");
            }
        }

        //rolls dice based on color

        for (int i = 0; i < 3; i++) {
            if (die[i].getColor().equals("green")) {
                switch ((int) (Math.random() * 6)) {
                    case 0:
                    case 1:
                    case 2:
                        brains++;
                        die[i].setStatus("brain");
                        break;
                    case 3:
                    case 4:
                        die[i].setStatus("runner");
                        break;
                    case 5:
                        shots++;
                        die[i].setStatus("shot");
                        break;
                }
            }
            if (die[i].getColor().equals("yellow")) {
                switch ((int) (Math.random() * 6)) {
                    case 0:
                    case 1:
                        brains++;
                        die[i].setStatus("brain");
                        break;
                    case 2:
                    case 3:
                        die[i].setStatus("runner");
                        break;
                    case 4:
                    case 5:
                        shots++;
                        die[i].setStatus("shot");
                        break;
                }
            }
            if (die[1].getColor().equals("red")) {
                switch ((int) (Math.random() * 6)) {
                    case 0:
                        brains++;
                        die[i].setStatus("brain");
                        break;
                    case 1:
                    case 2:
                        die[i].setStatus("runner");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        shots++;
                        die[i].setStatus("shot");
                        break;
                }

            }


            System.out.println("\u001b[33m" + "the color is " + die[i].getColor() + ", the state is " + die[i].getStatus());

            //die[i].display(); or something, maybe i will put in a gui and do it there
        }
    }

    //return statements
    public static int returnBrains() {
        return brains;
    }

    public static int returnShots() {
        return shots;
    }
}
