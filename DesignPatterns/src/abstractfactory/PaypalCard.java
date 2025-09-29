package abstractfactory;

public class PaypalCard implements CardPayment{
    @Override
    public void processCardPayment() {
        System.out.println("Processing paypal card");
    }

}
