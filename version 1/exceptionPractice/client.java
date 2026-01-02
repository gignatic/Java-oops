package exceptionPractice;

//Ek array bana: int[] numbers = {1, 2, 3}; (Size 3 hai).
//
//        try block ke andar System.out.println(numbers[5]); access karne ki koshish kar.
//        (Ye index 5 toh hai hi nahi, error aayega).
//
//        catch block laga jo ArrayIndexOutOfBoundsException ko pakde aur print
//        kare "Bhai limit mein raho!".
//
//        finally block laga jo print kare "Program khatam".
public class client {

    public static void main(String[] args) {

        int []num={1,2,3};

        try{
            System.out.println(num[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Bhai limit mein raho!");
        }
        finally {
            System.out.println("Program khatam");
        }
    }
}
















