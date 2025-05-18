package ObserverDesignpattern.Observer;

import ObserverDesignpattern.Observable.Observable_Interface;
import ObserverDesignpattern.Observable.Weather;

public class Mobile implements Observer_Interface {
    Observable_Interface obj;

    public Mobile(Observable_Interface n){
        this.obj = n;
    }

    @Override 
    public void update() {
        System.out.println("update in Mobile source = " + obj.getData());
    }
}