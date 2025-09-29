package abstractfactory;

public class PaytmCard implements CardPayment{
    @Override
    public void processCardPayment() {
        System.out.println("Paytm payment card processing");
    }
}
