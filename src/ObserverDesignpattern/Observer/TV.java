package ObserverDesignpattern.Observer;

import ObserverDesignpattern.Observable.Observable_Interface;
import ObserverDesignpattern.Observable.Temperature;
import ObserverDesignpattern.Observable.Weather;
import ObserverDesignpattern.Observer.Observer_Interface;

public class TV implements Observer_Interface {
   Observable_Interface obj;

   public TV(Observable_Interface n){
       this.obj = n;
   }

    @Override
    public void update() {
        System.out.println("update in TV source = "+ obj.getData());
    }

}