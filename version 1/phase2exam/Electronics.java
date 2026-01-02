package phase2exam;


//Do Child classes bana: Electronics aur Clothing jo Product ko extend karein.
//Polymorphism: calculateTax() method ko override kar.
//Electronics pe tax: price * TAX_RATE.
//Clothing pe tax: price * 0.05 (Kapdo pe 5% tax hai, interface wala 18% ignore kar - Overriding).
public class Electronics extends Product {

   // double tax;
   // double tax_rate;

     //private double price;
   // private String name;

    Electronics(String name,double price){
//        this.name=name;
//        this.price=price;

        super(name,price);
    }
//
    @Override
    public double calculateTax() {
        return  getPrice()*TAX_RATE;
    }
}
