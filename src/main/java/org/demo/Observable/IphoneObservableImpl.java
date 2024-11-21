package org.demo.Observable;

import org.demo.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements  StockObservable{

    int unitsAvailable = 0;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer obeserver) {
        observers.add(obeserver);
    }

    @Override
    public void remove(Observer obeserver) {
      observers.remove(obeserver);
    }

    @Override
    public void notifySubscribers() {
      for(Observer observer : observers){
          observer.update();
      }
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(int newUnits) {
        if(unitsAvailable == 0 && newUnits > 0){
            notifySubscribers();
        }
        unitsAvailable+= newUnits;
    }
}
