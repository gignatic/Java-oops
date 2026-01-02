package staticPractice;


//Ek class bana Player.
//
//        Usme ek static int playerCount = 0; rakh.
//
//        Constructor mein playerCount ko badha (++).
//
//        Main method mein 3 players bana (Dhoni, Virat, Rohit).
//
//        Last mein print kar: "Total Players: 3".
public class Player {

    static int playerCount=0;

    private String name;

    Player(String name){
        this.name=name;
        playerCount++;
    }

    public static void main(String[] args){
        Player p1=new Player("dhoni");
        Player p2=new Player("kohli");
        Player p3=new Player("virat");

        System.out.println("Total players "+ Player.playerCount);
    }
}



















