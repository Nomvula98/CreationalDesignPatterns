package bank;

public class Savings implements BankAccount{
    @Override
    public String balance() {
        return "Savings Account Balance: R4 050";
    }
}
