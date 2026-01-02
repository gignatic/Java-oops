package phase2exam;


//main method mein:
//Ek Electronics object bana (Laptop, 50000).
//Ek Clothing object bana (T-Shirt, 1000).
//Ek Product bana jisme galti se Negative Price (-500) daal ke dekh (Try-Catch check karne ke liye).
//Generic Order class use karke Laptop aur T-Shirt ka order place kar.
//Last mein static variable print kar ki Total Products kitne create hue.
public class clientProd {

    public static void main(String[] args) {
        Electronics e1 = new Electronics("Laptop", 50000);

        Clothing c1 = new Clothing("T-shirt", 1000);

        try{
            Product p=new Electronics("Test",0);
            p.setPrice(-500);
        }
        catch (IllegalArgumentException e){
            System.out.println("Price negative nahi ho sakti!");
        }

        Order<Electronics> orderElec= new Order<>();
        orderElec.placeOrder(e1);

        Order<Clothing> OrderCloth=new Order<>();
        OrderCloth.placeOrder(c1);

        System.out.println("Total product "+ Product.totalProducts);
    }
}