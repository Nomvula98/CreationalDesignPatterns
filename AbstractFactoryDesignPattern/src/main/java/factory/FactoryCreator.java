package factory;

import bank.BankAccountFactory;
import loan.LoanAccountFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankAccountFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanAccountFactory();
        }
        return null;
    }
}
