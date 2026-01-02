package parkingLot;

//Step 4: Generics (The Parking Slot)
//Ek class bana ParkingSlot<T extends Vehicle>.
//Method park(T v):
//Print: "Vehicle [Plate] Parked."
//Vehicle.totalRevenue mein is gadi ki fee add kar.
// (Yahan Polymorphism dikhega v.calculateFee() se).

public class ParkingSlot<T extends Vechile> {

    void park(T v){
        System.out.println("Vechile "+v.licensePlate+" Parked");
        Vechile.totalRevenue+=v.calculateFee();
    }
}
