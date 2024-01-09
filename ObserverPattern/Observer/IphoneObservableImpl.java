package ObserverPattern.Observer;
import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observable.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable{
    private String productName = "Iphone";
    public List<NotificationAlertObserver>ObserverList = new ArrayList<>();
    public int stockCount = 0;

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
        for (NotificationAlertObserver obj:ObserverList){
            obj.update();
        }
    }

    public void setStockCount(int newStockAdded){
        stockCount += newStockAdded;
        if(stockCount > 0)notifySubscribers();
    }

    public int getStockCount(){
        return stockCount;
    }
}
