package bank;

public class Savings implements BankAccount{
    @Override
    public String bankBalance() {
        return "Savings Account Balance: R4 050";
    }
}
