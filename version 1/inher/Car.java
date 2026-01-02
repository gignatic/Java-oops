package inher;

public class Car extends Vechile{

    void playMusic(){
        System.out.println("Music baj raha hai");
    }
}
class main{
    public  static void main(String[] args){
        Car c=new Car();
        c.start();
        c.playMusic();
    }
}
