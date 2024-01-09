package ObserverPattern.Observable;
import ObserverPattern.Observer.ProductObservable;
import ObserverPattern.Observer.StocksObservable;

public class SMSAlertObserverImpl implements NotificationAlertObserver{
    String phoneNumber;
    StocksObservable observable1;
    ProductObservable observable2;

    public SMSAlertObserverImpl(String phoneNumber, StocksObservable observable){
        this.observable1 = observable;
        this.phoneNumber = phoneNumber;
    }

    public SMSAlertObserverImpl(String phoneNumber, ProductObservable observable){
        this.observable2 = observable;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void update(){
        if(isValidStockObservable())sendSMS(phoneNumber, this.observable1.getProductName()+" is in Stock");
        if(isValidProductObservable())sendSMS(phoneNumber, this.observable2.getProductName()+" available for you");
    }

    private boolean isValidStockObservable(){
        return this.observable1 != null;
    }

    private boolean isValidProductObservable(){
        return this.observable2 != null;
    }

    private void sendSMS(String phoneNumber, String msg){
        System.out.println("SMS sent to:" + phoneNumber);
        System.out.println(msg);
    }
}
