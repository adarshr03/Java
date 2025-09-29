package abstractfactory;

public class PaytmUpi implements UpiPayment{
    @Override
    public void processUpiPayment() {
        System.out.println("Processing PaytmUpi Payment");
    }
}
