package ObserverPattern.Observer;
import ObserverPattern.Observable.NotificationAlertObserver;

public interface ProductObservable {
    public String productName="";

    public String getProductName();
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void newProductAdded(int val);
}
