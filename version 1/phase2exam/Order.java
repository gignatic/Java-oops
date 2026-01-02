package phase2exam;


//Ek Generic class bana Order<T>.
//Ye sirf Product ya uske bacho ko accept kare (Agar simple rakhna hai to <T> rakh).
//Isme ek method ho placeOrder(T item) jo print kare: "Ordering [Item Name] with Price:
// [Total Price with Tax]".
public class Order <T extends Product>{

//    String name;
//    double price;


    void placeOrder(T item){
        System.out.println("Ordering "+item.getName() +" with Price " + item.getPrice());
    }
}
