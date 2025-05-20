package parkingLotProblem;

import java.util.ArrayList;

public class ParkingLot {
    ArrayList<ParkingFloor> floors = new ArrayList<>();

    void addFloor(ParkingFloor f){
        this.floors.add(f);
    }

    ParkingSpot findSpot(Vehicle v){
        for(ParkingFloor floor : floors){
            ParkingSpot s = floor.getAvailableSpot(v.getType());
            if(s != null) return s;
        }
        return null;
    }

    void park(ParkingSpot spot){
        spot.assign();
    }
    void unPark(ParkingSpot spot){
        spot.release();
    }
}
