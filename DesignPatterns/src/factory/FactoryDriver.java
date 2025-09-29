package factory;

public class FactoryDriver {

    public static void main(String args[]){
        PaymentFactory pf = new PaymentFactory();
        Payment upi = pf.getPaymentmethod("upi");
        upi.processPayment();
        Payment cc =pf.getPaymentmethod("CreditCard");
        cc.processPayment();

        System.out.println("The hash code of cc is "+cc.hashCode());
        System.out.println("The hash code of upi is "+upi.hashCode());
    }
}
