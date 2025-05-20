package parkingLotProblem;

public class ExitGate {
    public void exit(Ticket ticket, ParkingLot lot){
        ticket.markExit();
        lot.unPark(ticket.getParkingSpot());
        double fee = ticket.calculateFee();
        System.out.println("Vehicle " + ticket.vehicle.number + " parked for rupees " + fee);
    }
}
