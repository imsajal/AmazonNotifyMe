package org.demo.Observer;

import org.demo.Observable.StockObservable;

public class MobileObserverImpl implements Observer{

    private String username;
    private StockObservable stockObservable;

    public MobileObserverImpl(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Phone notification sent to  " + username);
    }
}
