package zombieDice;

import java.lang.reflect.Array;

public class Turns {

    //get three dice and colors, runners must be selected
    //roll dice based on color chances
    //return brains and strikes

    private int shots;
    private int brains;
    private Dice[] die = new Dice[3];

    //Runs turns
    private void takeTurn(){

        //checks if we have a periveus runner
        for(int i = 0; i < 3; i++){
            if(!die[i].getStatus().equals("runner")){
                //randomize the dice color
                //die[i].randomize();
            }
        }

        //rolls dice based on color
        for(int i = 0; i < 3; i++){
            if(die[i].getColor().equals("green")){
                switch((int)(Math.random() * 6)){
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
            if(die[i].getColor().equals("yellow")){
                switch((int)(Math.random() * 6)){
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
            if(die[i].getColor().equals("red")){
                switch((int)(Math.random() * 6)){
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
            //die[i].dispaly(); or something, maybe i will put in a gui and do it there
        }
    }

    //return statements
    public int returnBrains(){
        return brains;
    }

    public int returnShots(){
        return shots;
    }

    public Dice[] getDice(int i){
        return die;
    }
}
