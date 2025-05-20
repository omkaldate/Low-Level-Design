package parkingLotProblem;

public abstract class ParkingSpot {
    String id;
    boolean isOccupide = false;
    SpotType type;

    ParkingSpot(String id, SpotType type){
        this.id = id;
        this.type = type;
    }

    boolean isAvailable(){
        return !isOccupide;
    }
    void assign(){
        isOccupide = true;
    }
    void release(){
        isOccupide = false;
    }

    public SpotType getType(){
        return type;
    }

}
