package factory;

import bank.BankAccount;
import loan.Loan;

public abstract class AbstractFactory {
    public abstract BankAccount getBankAccount(String accountName);
    public abstract Loan getLoan(String loanName);

}
