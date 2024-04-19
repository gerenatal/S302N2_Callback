class BankAccount implements PaymentMethod {
    private String iban;
    private String password;
    FakeBank fakeBank;
    public BankAccount(String iban, String password) {
        this.iban = iban;
        this.password = password;
        this.fakeBank = new FakeBank();
    }
    @Override
    public boolean pay(double amount) {
        if(fakeBank.checkTrue(fakeBank.getBankAccount(), iban, password)){
            System.out.println("Paid $" + amount + " using Paypal");
            return true;
        }else {
            System.out.println(("Payment failed"));
            return false;
        }
    }
}