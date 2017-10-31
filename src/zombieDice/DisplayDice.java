package zombieDice;


public class DisplayDice {

    private static String d1c = null;
    private static String d11 = null;
    private static String d12 = null;
    private static String d13 = null;
    private static String d14 = null;
    private static String d15 = null;
    private static String d2c = null;
    private static String d21 = null;
    private static String d22 = null;
    private static String d23 = null;
    private static String d24 = null;
    private static String d25 = null;
    private static String d3c = null;
    private static String d31 = null;
    private static String d32 = null;
    private static String d33 = null;
    private static String d34 = null;
    private static String d35 = null;

    public static void setD1(String color, String state){
        if(color.equals("green")) {
            d1c = "\u001b[32m";
        }
        else if(color.equals("yellow")){
            d1c = "\u001b[33m";
        }
        else if(color.equals("RED")){
            d1c = "\u001b[31m";
        }

        if(state.equals("Brains")){
            d11 = "┍━━━━━━━━━━━━┓ ";
            d12 = "│  BRAIN!  │ ";
            d13 = "│    oO@o  │ ";
            d14 = "│  oO@@O@' │ ";
            d15 = "┕━━━━━━━━━━━━┙ ";
        }
        else if(state.equals("Runner")){
            d11 = "┍━━━━━━━━━━━━┓ ";
            d12 = "│  Runner  │ ";
            d13 = "│ O>    O> │ ";
            d14 = "│>   O>   O│ ";
            d15 = "┕━━━━━━━━━━━━┙ ";
        }
        else if(state.equals("SHOT!")){
            d11 = "┍━━━━━━━━━━━━┓ ";
            d12 = "│   Shot   │ ";
            d13 = "│   ===&#  │ ";
            d14 = "│  //      │ ";
            d15 = "┕━━━━━━━━━━━━┙ ";
        }
    }
    public static void setD2(String color, String state){
        if(color.equals("green")) {
            d2c = "\u001b[32m";
        }
        else if(color.equals("yellow")){
            d2c = "\u001b[33m";
        }
        else if(color.equals("RED")){
            d2c = "\u001b[31m";
        }

        if(state.equals("Brains")){
            d21 = "┍━━━━━━━━━━━━┓ ";
            d22 = "│  BRAIN!  │ ";
            d23 = "│    oO@o  │ ";
            d24 = "│  oO@@O@' │ ";
            d25 = "┕━━━━━━━━━━━━┙ ";
        }
        else if(state.equals("Runner")){
            d21 = "┍━━━━━━━━━━━━┓ ";
            d22 = "│  Runner  │ ";
            d23 = "│ O>    O> │ ";
            d24 = "│>   O>   O│ ";
            d25 = "┕━━━━━━━━━━━━┙ ";
        }
        else if(state.equals("SHOT!")){
            d21 = "┍━━━━━━━━━━━━┓ ";
            d22 = "│   Shot   │ ";
            d23 = "│   ===&#  │ ";
            d24 = "│  //      │ ";
            d25 = "┕━━━━━━━━━━━━┙ ";
        }
    }
    public static void setD3(String color, String state){
        if(color.equals("green")) {
            d3c = "\u001b[32m";
        }
        else if(color.equals("yellow")){
            d3c = "\u001b[33m";
        }
        else if(color.equals("RED")){
            d3c = "\u001b[31m";
        }

        if(state.equals("Brains")){
            d31 = "┍━━━━━━━━━━━━┓ ";
            d32 = "│  BRAIN!  │ ";
            d33 = "│    oO@o  │ ";
            d34 = "│  oO@@O@' │ ";
            d35 = "┕━━━━━━━━━━━━┙ ";
        }
        else if(state.equals("Runner")){
            d31 = "┍━━━━━━━━━━━━┓ ";
            d32 = "│  Runner  │ ";
            d33 = "│ O>    O> │ ";
            d34 = "│>   O>   O│ ";
            d35 = "┕━━━━━━━━━━━━┙ ";
        }
        else if(state.equals("SHOT!")){
            d31 = "┍━━━━━━━━━━━━┓ ";
            d32 = "│   Shot   │ ";
            d33 = "│   ===&#  │ ";
            d34 = "│  //      │ ";
            d35 = "┕━━━━━━━━━━━━┙ ";
        }
    }

    public static void show(){
        System.out.println(d1c + d11 + d2c + d21 + d3c +d31 + "\n" +
                d1c + d12 + d2c + d22 + d3c +d32 + "\n" +
                d1c + d13 + d2c + d23 + d3c +d33 + "\n" +
                d1c + d14 + d2c + d24 + d3c +d34 + "\n" +
                d1c + d15 + d2c + d25 + d3c +d35 + "\u001B[34m \n");
    }

}
