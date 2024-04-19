class ShoeStore implements PaymentCallback {
    PaymentGateway paymentGateway;
    public ShoeStore(){
        this.paymentGateway = new PaymentGateway();
    }
    void purchaseItem(double price, PaymentMethod paymentMethod) {
        new PaymentGateway();
        paymentGateway.processPayment(paymentMethod, price, this);
    }
    @Override
    public void onPaymentComplete(boolean checkPayment) {
        System.out.println(checkPayment ? "Payment completed" : "Payment NOT completed");
    }
}