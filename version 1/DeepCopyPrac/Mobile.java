package DeepCopyPrac;

//ask:
//
//        Class Mobile bana.
//        Fields: String model, int price.
//        Constructor 1: Data set karne ke liye.
//        Constructor 2 (Copy Constructor): Naya object banane ke liye purane ka data copy kare.
//
//        Main mein:
//        m1 bana (iPhone, 50000).
//        m2 bana using Deep Copy of m1.
//        m2 ka price change kar ke 40000 kar de.
//        Print kar dono ko. Agar m1 abhi bhi 50000 hai, toh tu jeet gaya!
public class Mobile {

    private String model;
    private int price;

    Mobile(String model,int price){
        this.model=model;
        this.price=price;
    }

    Mobile(Mobile old){
        this.model= old.model;
        this.price=old.price;
    }

    public static void main(String[] args){

        Mobile m1=new Mobile("Iphone",50000);

        Mobile m2=new Mobile(m1);
        m2.price=40000;

        System.out.println("Price of m1 "+m1.price);

        System.out.println("Price of m2 "+m2.price);

    }

}




















