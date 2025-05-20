package parkingLotProblem;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    ParkingSpot spot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    Ticket(Vehicle vehicle , ParkingSpot spot){
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    void markExit(){
        this.exitTime = LocalDateTime.now();
    }

    double calculateFee(){
        return FeeCalculator.calculate(vehicle.getType(), entryTime,exitTime);
    }

    public ParkingSpot getParkingSpot(){
        return spot;
    }
}
