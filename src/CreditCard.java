class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String password;
    FakeBank fakeBank;
    public CreditCard(String cardNumber, String password) {
        this.cardNumber = cardNumber;
        this.password = password;
        this.fakeBank = new FakeBank();
    }
    @Override
    public boolean pay(double amount) {
        if(fakeBank.checkTrue(fakeBank.getCreditCard(), cardNumber, password)){
            System.out.println("Paid $" + amount + " using Credit Card");
            return true;
        }else {
            System.out.println(("Payment failed"));
            return false;
        }
    }
}