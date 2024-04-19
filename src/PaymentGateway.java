class PaymentGateway {
    void processPayment(PaymentMethod paymentMethod, double amount, PaymentCallback callback) {
        callback.onPaymentComplete(paymentMethod.pay(amount));
    }
}