package abstractfactory;

public class PaypalPaymentFactory implements PaymentFactory{
    @Override
    public CardPayment createCardPaymentProcess() {
        return new PaypalCard();
    }

    @Override
    public UpiPayment createUpiPaymentProcess() {
        return new PayPalUpi();
    }
}
