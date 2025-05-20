package parkingLotProblem;


import java.util.ArrayList;

public class ParkingFloor {
    ArrayList<ParkingSpot> spots = new ArrayList<>();

    void addSpot(ParkingSpot s){
        spots.add(s);
    }

    ParkingSpot getAvailableSpot(VehicleType v){
        for(ParkingSpot spot : spots){
            if (spot.isAvailable() && spot.getType().name().equals(v.name())) {
                return spot;
            }
        }
        return null;
    }
}
