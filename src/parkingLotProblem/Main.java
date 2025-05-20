package parkingLotProblem;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            ParkingLot lot = new ParkingLot();

            ParkingFloor floor1 = new ParkingFloor();
            floor1.addSpot(new CarSpot("C1"));
            floor1.addSpot(new BikeSpot("B1"));

            lot.addFloor(floor1);

            Vehicle car = new Car("MH12AB1234");

            EntranceGate entrance = new EntranceGate();
            ExitGate exit = new ExitGate();

            Ticket ticket = entrance.enter(car, lot);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            exit.exit(ticket, lot);
        });

        t1.setDaemon(false);
        t1.start();
    }

}
