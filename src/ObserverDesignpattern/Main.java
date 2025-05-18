package ObserverDesignpattern;

import ObserverDesignpattern.Observable.Temperature;
import ObserverDesignpattern.Observable.Weather;
import ObserverDesignpattern.Observer.Mobile;
import ObserverDesignpattern.Observer.TV;

public class Main {
    public static void main(String[] args) {
        Weather w = new Weather();
        Temperature t = new Temperature();
  
        TV u1 = new TV(w);
        TV u2 = new TV(t);
        Mobile u3 = new Mobile(w);

        w.add(u1);
        w.add(u3);
        t.add(u2);

        w.setData(5);
        t.setData(1);
    }
}
