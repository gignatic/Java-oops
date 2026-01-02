package parkingLot;

public class InvalidPlateException extends Exception {

    InvalidPlateException(String msg){
      super(msg);
    }
}


//Kyu Galat Hai?
//
//Parameter: Jab hum error throw karte hain
// (jaise new InvalidPlateException("Number plate missing")),
// toh hum String pass karte hain, Exception object nahi.
//
//Super Call: System.out.println constructor mein nahi karte.
// Hum message ko Parent (Exception class) ke paas bhejte hain super(msg) ke through,
// taaki baad mein e.getMessage() kaam kare.
