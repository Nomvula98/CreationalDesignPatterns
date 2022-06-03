package bank;

public class Cheque implements BankAccount{
    @Override
    public String bankBalance() {
        return "Cheque Account balance: R9 405";
    }
}
