import java.util.HashMap;
public class FakeBank {
    private static final HashMap<String, String> creditCard = new HashMap<>();
    private static final HashMap<String, String>  paypal = new HashMap<>();
    private static final HashMap<String, String> bankAccount = new HashMap<>();

    static {
        creditCard.put("1122334455667788", "123456");
        creditCard.put("8877665544332211", "654321");
        paypal.put("gbristot@hotmail.com", "123456");
        paypal.put("danielcammilo@hotmail.com", "654321");
        bankAccount.put("ES462100112233445566", "123456");
        bankAccount.put("ES462100665544332211", "654321");
    }
    public FakeBank(){
        }
    public boolean checkTrue(HashMap<String, String> genericPaymentMethod, String genericId, String genericPassword){
        return genericPaymentMethod.containsKey(genericId) && genericPaymentMethod.get(genericId).equals((genericPassword));
    }
    public static HashMap<String, String> getCreditCard() {
        return creditCard;
    }
    public static HashMap<String, String> getPaypal() {
        return paypal;
    }
    public static HashMap<String, String> getBankAccount() {
        return bankAccount;
    }
}
