abstract class PaymentProcessor {
    abstract void processPayment();
abstract void cancelPayment();
abstract boolean isPaymentOver50Dollars();
public void getPaymentDetails(){
    System.out.println("Payment is getting processed");
}
}
