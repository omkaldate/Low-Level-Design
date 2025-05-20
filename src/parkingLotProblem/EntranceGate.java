package parkingLotProblem;

public class EntranceGate {
    public Ticket enter(Vehicle vehicle, ParkingLot lot){
        ParkingSpot spot = lot.findSpot(vehicle);
        if(spot == null){
            System.out.println("spot is not availabl...!");
            return null;
        }
        lot.park(spot);
        return new Ticket(vehicle,spot);
    }
}
