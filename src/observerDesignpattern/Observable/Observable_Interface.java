package observerDesignpattern.Observable;

import observerDesignpattern.Observer.Observer_Interface;

public interface Observable_Interface {

    public void add(Observer_Interface obj);
    public void  remove();
    public void notifyUser();
    public void setData(int a);
    public int getData();
}
