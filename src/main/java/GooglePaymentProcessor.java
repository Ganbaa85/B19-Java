public abstract class GooglePaymentProcessor extends PaymentProcessor {
    private static double paymentFee;
    private double discount;

    {
        discount = 0.1;
        paymentFee = 2.5;
    }

    abstract void processGooglePay();

    private final static String paymentType = "Google pay";

    static String getPaymentType() {
        return paymentType;
    }

    static double getPaymentFee() {
        return paymentFee;
    }


}
