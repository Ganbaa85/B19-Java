public class ZelleProcessor extends PaymentProcessor {
    double paymentAmount;

    @Override
    void processPayment() {
        System.out.println("Process payment using zelle");
    }

    @Override
    void cancelPayment() {
        System.out.println("Cancel the zelle payment");
    }

    @Override
    boolean isPaymentOver50Dollars() {
        System.out.println("It is over 50 dollars");
        return paymentAmount > 50.00;
    }

    public static void main(String[] args) {
        ZelleProcessor zelleProcessor = new ZelleProcessor();
        zelleProcessor.getPaymentDetails();
        zelleProcessor.cancelPayment();
        zelleProcessor.processPayment();
        zelleProcessor.isPaymentOver50Dollars();
    }
}
