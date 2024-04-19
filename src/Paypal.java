class Paypal implements PaymentMethod {
    private String email;
    private String password;
    FakeBank fakeBank;
    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
        this.fakeBank = new FakeBank();
    }
    @Override
    public boolean pay(double amount) {
        if(fakeBank.checkTrue(fakeBank.getPaypal(), email, password)){
            System.out.println("Paid $" + amount + " using Paypal");
            return true;
        }else {
            System.out.println(("Payment failed"));
            return false;
        }
    }
}