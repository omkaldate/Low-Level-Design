package observerDesignpattern.Observer;

import observerDesignpattern.Observable.Observable_Interface;

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