package bank;

public class Cheque implements BankAccount{
    @Override
    public String balance() {
        return "Cheque Account balance: R9 405";
    }
}
