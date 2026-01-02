package parkingLot;


//Step 3: Polymorphism (Real Vehicles)
//Class Car extends Vehicle:
//Fee: 50 rupees.
//calculateFee() override kar aur return 50.
//IMP: super(plate) use karna mat bhoolna.
//Class Bike extends Vehicle:
//Fee: 20 rupees.
//calculateFee() override kar aur return 20.

public class Car extends Vechile{

    final int fee=50;

    Car(String licensePlate) throws InvalidPlateException{
        super(licensePlate);
    }

    @Override
    double calculateFee() {
        return fee;
    }
}
