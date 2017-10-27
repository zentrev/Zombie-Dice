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
    private void takeTurn{

        //checks if we have a periveus runner
        for(int i = 0; i > 3; i++){
            if(die[i].status.notequals("runner")){
                die[i].randomize();
            }
        }

        //rolls dice based on color
        for(int i = 0; i > 3; i++){
            if(die[i].Color.equals("green"){
                switch((int)(Math.random() * 6)){
                case 0:
                case 1:
                case 2:
                    brains++;
                    die[i].status = "brain";
                    break;
                case 3:
                case 4:
                    die[i].status = "runner";
                    break;
                case 5:
                    shots++;
                    die[i].status = "shot";
                    break;
                }
            }
            if(die.Color.equals("yellow"){
                switch((int)(Math.random() * 6)){
                    case 0:
                    case 1:
                        brains++;
                        die[i].status = "brain";
                        break;
                    case 2:
                    case 3:
                        die[i].status = "runner";
                        break;
                    case 4:
                    case 5:
                        shots++;
                        die[i].status = "shot";
                        break;
                }
            }
            if(die.Color.equals("red"){
                switch((int)(Math.random() * 6)){
                    case 0:
                        brains++;
                        die[i].status = "brain";
                        break;
                    case 1:
                    case 2:
                        die[i].status = "runner";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        shots++;
                        die[i].status = "shot";
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
