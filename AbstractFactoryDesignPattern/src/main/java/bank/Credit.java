package bank;

public class Credit implements BankAccount{
    @Override
    public String bankBalance() {
        return "Credit Account balance: R22 095";
    }
}
