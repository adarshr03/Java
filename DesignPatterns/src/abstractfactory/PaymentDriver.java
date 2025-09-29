package abstractfactory;

public class PaymentDriver {
    public static void main(String args[]){
        String paymentGateway="paypal";
        PaymentFactory factory;
        switch(paymentGateway){
        case "paytm":
        factory= new PaytmFactory();
        break;
        case "paypal":
            factory= new PaypalPaymentFactory();
            break;
            default:
                throw new IllegalArgumentException("Payment Gateway not found");

        }
System.out.println("Before all processing");
       CardPayment cp = factory.createCardPaymentProcess();
        UpiPayment up =factory.createUpiPaymentProcess();
        cp.processCardPayment();
        up.processUpiPayment();
    }
}
