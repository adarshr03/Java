package abstractfactory;

public interface PaymentFactory {

    CardPayment createCardPaymentProcess();
   UpiPayment createUpiPaymentProcess();


}
