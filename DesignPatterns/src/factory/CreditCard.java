package factory;

public class CreditCard implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Credit Card payment is processed");
    }
}
