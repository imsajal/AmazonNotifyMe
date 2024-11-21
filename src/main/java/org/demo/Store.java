package org.demo;

import org.demo.Observable.IphoneObservableImpl;
import org.demo.Observable.StockObservable;
import org.demo.Observer.EmailObserverImpl;
import org.demo.Observer.MobileObserverImpl;
import org.demo.Observer.Observer;

public class Store {
    public static void main(String[] args) {

        StockObservable iphone = new IphoneObservableImpl();

        Observer sajal = new MobileObserverImpl("sajal", iphone);
        Observer saloni = new EmailObserverImpl("saloni@gmail.com", iphone);

        iphone.add(sajal);
        iphone.add(saloni);

        iphone.setUnitsAvailable(25);
    }
}