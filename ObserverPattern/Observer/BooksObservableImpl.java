package ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observable.NotificationAlertObserver;

public class BooksObservableImpl implements ProductObservable{
    public String productName="The Monk Who Sold Ferrari";
    public int newProductAdded = 1;
    public List<NotificationAlertObserver>ObserverList = new ArrayList<>();

    @Override
    public String getProductName(){
        return this.productName;
    }

    @Override
    public void add(NotificationAlertObserver observer){
        ObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        ObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver obj:ObserverList){
            obj.update();
        }
    }

    @Override
    public void newProductAdded(int val){
        if(val == 1)notifySubscribers();
    }
}
