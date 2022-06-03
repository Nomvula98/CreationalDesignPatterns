package loan;

import bank.BankAccount;
import factory.AbstractFactory;

public class LoanAccountFactory extends AbstractFactory {

    @Override
    public BankAccount getBankAccount(String accountName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName) {
        if (loanName.equalsIgnoreCase("Car")) {
            return new CarLoan();
        }else {
            return new HomeLoan();
        }
    }
}
