package parkingLotProblem;

public abstract class Vehicle {
    String number;
    VehicleType type;

    Vehicle(String number, VehicleType type){
        this.number = number;
        this.type = type;
    }

    public VehicleType getType(){
        return type;
    }
}
