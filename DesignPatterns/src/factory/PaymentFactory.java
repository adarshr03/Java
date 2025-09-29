package factory;

public class PaymentFactory {

    public Payment getPaymentmethod(String paymentMethod){
       switch(paymentMethod.toLowerCase()){
            case "creditcard":
            return new CreditCard();
            case "upi":
                return  new UpiPayment();
           default:
               throw new IllegalArgumentException("Payment method not found");

        }
    }
}
