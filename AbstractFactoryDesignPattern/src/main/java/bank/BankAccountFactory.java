package bank;

import factory.AbstractFactory;
import loan.Loan;

public class BankAccountFactory extends AbstractFactory {

    @Override
    public BankAccount getBankAccount(String accountName) {
        if (accountName.equalsIgnoreCase("Savings")) {
            return new Savings();
        }else if (accountName.equalsIgnoreCase("Cheque")) {
            return new Cheque();
        }else {
            return new Credit();
        }
    }

    @Override
    public Loan getLoan(String loanName) {
        return null;
    }

}
