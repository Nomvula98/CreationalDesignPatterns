package bank;

public class Credit implements BankAccount{
    @Override
    public String balance() {
        return "Credit Account balance: R22 095";
    }
}
