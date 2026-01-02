package phase2exam;


//Ek Abstract Class bana Product jo Taxable ko implement kare.
//        Isme private fields hon: String name, double price.
//        Ek static variable ho totalProducts (Jo count kare kitne product bane).
//        Encapsulation: Private fields ke liye Getter/Setter bana.
//        Constructor: Name aur Price set karne ke liye.
//        (Constructor mein totalProducts++ karna mat bhoolna).

//Step 2: Validations & Exceptions (Safety)
//Product class ke Setter (setPrice) mein validation laga:
//Agar price < 0 hai, toh throw new IllegalArgumentException("Price negative nahi ho sakti!").
//Ise try-catch se Main class mein handle karna padega.
abstract class Product implements  Taxable{

    private String name;
    private double price;

    static int totalProducts=0;

    Product(String name,double price){
        this.name=name;
        this.price=price;
        totalProducts++;
    }

    Product(){

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException("Price cant be negative");
        }
        this.price = price;
    }
}
