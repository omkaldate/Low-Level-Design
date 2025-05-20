package parkingLotProblem;

import java.lang.invoke.SwitchPoint;
import java.time.Duration;
import java.time.LocalDateTime;

public class FeeCalculator {
    public static double calculate(VehicleType type, LocalDateTime entry, LocalDateTime exit){
        long hours = Duration.between(entry,exit).toHours();
        if(hours == 0) hours = 1;

        switch(type){
            case BIKE: return hours * 10;
            case CAR: return hours * 20;
            default: return 0;
        }
    }
}
