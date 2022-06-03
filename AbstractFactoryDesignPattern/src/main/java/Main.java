import bank.BankAccount;
import factory.AbstractFactory;
import factory.FactoryCreator;
import loan.Loan;

public class Main {
    public static void main(String[] args) {
        
        //Abstract Factory patterns work around a super-factory which creates other factories.
        //This factory is also called as factory of factories.
        //Define an interface or abstract class for creating families of related (or dependent) objects
        // but without specifying their concrete sub-classes.

        //An interface is responsible for creating a factory of related objects without explicitly specifying their classes.
        //Each generated factory can give the objects as per the Factory pattern.

        String factoryName1 = "Loan";
        String factoryName2 = "Bank";
        AbstractFactory loanFactory = FactoryCreator.getFactory(factoryName1);
        AbstractFactory bankFactory = FactoryCreator.getFactory(factoryName2);

        System.out.println("============Loan Factory==========");
        Loan homeLoan = loanFactory.getLoan("Home");
        Loan carLoan = loanFactory.getLoan("Car");
        System.out.println(homeLoan.loanBalance());
        System.out.println(carLoan.loanBalance());
        System.out.println("============Bank Factory==========");

        BankAccount savingsAcc = bankFactory.getBankAccount("Savings");
        BankAccount chequeAcc = bankFactory.getBankAccount("Cheque");
        BankAccount creditAcc = bankFactory.getBankAccount("Credit");

        System.out.println(savingsAcc.bankBalance());
        System.out.println(chequeAcc.bankBalance());
        System.out.println(creditAcc.bankBalance());
    }
}
