package abstractfactory;

public class PayPalUpi implements UpiPayment{
    @Override
    public void processUpiPayment() {
        System.out.println("Processing Paypal Upi Payment");
    }
}
