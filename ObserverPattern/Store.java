package ObserverPattern;

import ObserverPattern.Observable.EmailAlertObserverImpl;
import ObserverPattern.Observable.NotificationAlertObserver;
import ObserverPattern.Observable.SMSAlertObserverImpl;
import ObserverPattern.Observer.BooksObservableImpl;
import ObserverPattern.Observer.IphoneObservableImpl;
import ObserverPattern.Observer.ProductObservable;
import ObserverPattern.Observer.StocksObservable;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        ProductObservable bookObservable = new BooksObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("shubham.4maths@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("rawat.shubham@hotmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new SMSAlertObserverImpl("7055064968", iphoneStocksObservable);

        NotificationAlertObserver observer6 = new EmailAlertObserverImpl("shubham.4maths@gmail.com", bookObservable);
        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("rawat.shubham@hotmail.com", bookObservable);
        NotificationAlertObserver observer5 = new SMSAlertObserverImpl("7055064968", bookObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(20);
        
        bookObservable.add(observer6);
        bookObservable.add(observer4);
        bookObservable.add(observer5);

        bookObservable.newProductAdded(1);
    }
}
