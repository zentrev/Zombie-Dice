package zombieDice;

public class Dice {

    private String color = null;
    private String status = "";

    public Dice() {
        this.color = "";
        this.status = "";

    }

    public String getColor() {
        return color;


    }

    public String getStatus() {
        return status;


    }

    public void changeColor() {
        int Rando = (int) (Math.random() * 100);
        if (Rando <= 46) {
            this.color = "green";
        }
        else if (Rando > 46 && Rando <= 77){
            this.color = "yellow";
        }
        else if (Rando > 77) {
            this.color = "RED";
        }
    }

    public void rollDice(){
        int Mando = (int) (Math.random() * 6);
        if (this.getColor().equals("green") ) {

            switch (Mando) {
                case 0:
                case 1:
                case 2:
                    this.status = "Brains";
                    break;
                case 3:
                case 4:
                    this.status = "Runner";
                    break;
                case 5:
                    this.status = "SHOT!";
                    break;
            }
        }
        else if (this.getColor().equals("yellow")){
            switch (Mando){
                case 0:
                case 1:
                    this.status = "Brains";
                    break;
                case 2:
                case 3:
                    this.status = "Runner";
                    break;
                case 4:
                case 5:
                    this.status = "SHOT!";
                    break;
            }
        }
        else if (this.getColor().equals("RED")){
            switch (Mando){
                case 0:
                    this.status = "Brains";
                    break;
                case 1:
                case 2:
                    this.status = "Runner";
                    break;
                case 3:
                case 4:
                case 5:
                    this.status = "SHOT!";
                    break;
            }
        }



    }
}
