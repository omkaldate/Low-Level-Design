package ObserverDesignpattern.Observable;

import ObserverDesignpattern.Observer.Observer_Interface;

import java.util.ArrayList;

public interface Observable_Interface {

    public void add(Observer_Interface obj);
    public void  remove();
    public void notifyUser();
    public void setData(int a);
    public int getData();
}
