package abstractfactory;

public class PaytmFactory implements PaymentFactory{
    @Override
    public CardPayment createCardPaymentProcess() {
        return new PaytmCard();
    }

    @Override
    public UpiPayment createUpiPaymentProcess() {
        return new PaytmUpi();
    }
}
