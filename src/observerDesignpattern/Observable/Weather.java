package observerDesignpattern.Observable;
import observerDesignpattern.Observer.Observer_Interface;

import java.util.ArrayList;

public class Weather implements Observable_Interface {
    ArrayList<Observer_Interface> list = new ArrayList<>();
    private int source = 0;

    public void add(Observer_Interface obj){
        list.add(obj);
    }

    public void  remove(){}

    public void notifyUser(){
        for(Observer_Interface obj : list){
            obj.update();
        }
    }

    public void setData(int a){
        this.source += a;
        this.notifyUser();
    }

    public int getData(){
        return this.source;
    }
}
