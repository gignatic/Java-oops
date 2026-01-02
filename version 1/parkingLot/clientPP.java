package parkingLot;

//
//Step 5: Main Execution
//        try-catch block ke andar:
//        Ek Car bana ("UP-16-5555").
//        Ek Bike bana ("DL-90-1234").
//        Ek Car bana bina number plate ke "" (Exception test karne ke liye).
//        ParkingSlot objects bana aur gadiyan park kar.
//        Last mein print kar: "Total Revenue: [Amount]".


public class clientPP {

    public static void main(String[] args){

        try{

            Car c1=new Car("Car1");
            Bike b1=new Bike("Bike1");


            ParkingSlot<Car> carslot=new ParkingSlot<>();
            carslot.park(c1);

            ParkingSlot<Bike> bikeslot=new ParkingSlot<>();
            bikeslot.park(b1);

            System.out.println("Check invalid case");

            Car c2=new Car("");

            System.out.println("it will not run if error");

        }
        catch (InvalidPlateException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Total reveneue "+ Vechile.totalRevenue );

    }
}
