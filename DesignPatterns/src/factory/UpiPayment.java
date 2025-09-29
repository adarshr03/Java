package factory;

public class UpiPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("UPI payment is processed");
    }
}
