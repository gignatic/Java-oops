package phase2exam;

public class Clothing extends Product{
//    double tax;
//
//    double price;
//    String name;
//    double TAX_RATE = 0.05;

    Clothing(String name,double price){
        super(name,price);
    }

    @Override
    public double calculateTax() {
//        tax=price*TAX_RATE;
        return  getPrice()*0.05;
    }
}
