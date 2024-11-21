package org.demo.Observable;

import org.demo.Observer.Observer;

public interface StockObservable {

    void add(Observer obeserver);
    void remove(Observer obeserver);
    void notifySubscribers();
    void setUnitsAvailable(int newUnits);
    void getUnitsAvailable();
}
