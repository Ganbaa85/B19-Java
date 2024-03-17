public class SamsungPhone extends GooglePaymentProcessor{
    @Override
    void processPayment() {

    }

    @Override
    void cancelPayment() {

    }

    @Override
    boolean isPaymentOver50Dollars() {
        return false;
    }

    @Override
    void processGooglePay() {

    }

    public static void main(String[] args) {
        System.out.println(GooglePaymentProcessor.getPaymentType());
    }
}
