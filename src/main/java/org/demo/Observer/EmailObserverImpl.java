package org.demo.Observer;

import org.demo.Observable.StockObservable;

public class EmailObserverImpl implements Observer{

    private String emailId;
    private StockObservable stockObservable;

    public EmailObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email sent to   " + emailId);
    }
}
