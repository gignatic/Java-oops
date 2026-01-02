package parkingLot;

public class Bike extends Vechile{

    final int fee=20;

    Bike(String licensePlate) throws InvalidPlateException{
        super(licensePlate);
    }

    @Override
    double calculateFee() {
        return  fee;
    }
}
