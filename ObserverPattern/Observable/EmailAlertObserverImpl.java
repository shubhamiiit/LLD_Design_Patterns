package ObserverPattern.Observable;

import ObserverPattern.Observer.ProductObservable;
import ObserverPattern.Observer.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailID;
    StocksObservable observable1;
    ProductObservable observable2;

    public EmailAlertObserverImpl(String emailID, StocksObservable observable){
        this.emailID = emailID;
        this.observable1= observable;
    }

    public EmailAlertObserverImpl(String emailID, ProductObservable observable){
        this.emailID = emailID;
        this.observable2= observable;
    }

    @Override
    public void update(){
        if(isValidStockObservable())sendMail(emailID, this.observable1.getProductName()+" is in stock");
        if(isValidProductObservable())sendMail(emailID, this.observable2.getProductName()+" available for you");
    }

    private boolean isValidStockObservable(){
        return this.observable1 != null;
    }

    private boolean isValidProductObservable(){
        return this.observable2 != null;
    }

    private void sendMail(String emailID, String msg){
        System.out.println("mail sent to:"+emailID);
        System.out.println(msg);
    }
}
