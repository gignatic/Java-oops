package parkingLot;


//Step 2: Abstraction & Static (The Core)
//Ek abstract class Vehicle bana.
//Fields: String licensePlate (protected rakh taaki bache access kar sakein),
//static double totalRevenue = 0.
//Constructor: licensePlate set kare.
//Validation: Agar licensePlate null ya empty ("") hai, toh throw new InvalidPlateException.
//Abstract Method: double calculateFee().
abstract class Vechile {

    protected String licensePlate;
    static double totalRevenue ;

    Vechile(){

    }

    Vechile(String licensePlate) throws InvalidPlateException{

        //validation
        if(licensePlate==null || licensePlate.isEmpty()) {
            throw new InvalidPlateException("License plate khali nahi ho sakti!");
        }
        this.licensePlate=licensePlate;
    }

//    public void setLicensePlate(String licensePlate) {
//        if(licensePlate=="" || licensePlate==null){
//            throw InvalidPlateException();
//        }
//        this.licensePlate = licensePlate;
//    }

    abstract double calculateFee();
}


//🔍 Analysis of Mistakes
//1. static Keyword Missing (Critical) ⚠️
//Tera Code: double totalRevenue;
//Problem: Ye Instance Variable ban gaya.
// Har nayi gadi ka apna alag revenue counter hoga (0).
// Humein poore parking lot ka Total chahiye.
//Fix: static double totalRevenue = 0; (Sab gadiyan ek hi variable share karengi).


//2. Exception Syntax & Throwing 💣
//Tera Code: throw InvalidPlateException();
//Problem:
//Object banane ke liye new keyword chahiye.
//Kyunki tune Step 1 mein Exception (Checked) extend kiya tha,
// tujhe method signature mein throws InvalidPlateException likhna padega.
//Fix: throw new InvalidPlateException("Message");


//3. String Comparison & Constructor Logic 🧵
//Tera Code: licensePlate == ""
//Problem: Java mein String ko == se compare nahi karte
// (ye address check karta hai). .equals() ya .isEmpty() use karte hain.
//Logic: Tune validation setLicensePlate mein likha, par
// Constructor mein seedha assign kar diya (this.licensePlate = licensePlate).
// Agar main new Vehicle("") karunga, toh tera validation bypass ho jayega!