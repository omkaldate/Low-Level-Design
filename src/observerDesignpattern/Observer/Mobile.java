package observerDesignpattern.Observer;

import observerDesignpattern.Observable.Observable_Interface;

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