package bank;

public class Main {
    public static void main(String[] args) {

        //Define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
        //In other words, subclasses are responsible to create the instance of the class.
        //We create object without exposing the creation logic to the client and refer to newly created object using a common interface.

        String bankType1 = "Savings";
        String bankType2 = "Cheque";
        String bankType3 = "Credit";

        BankAccount bankAccount = BankAccountFactory.getInstance(bankType1);
        BankAccount bankAccount1 = BankAccountFactory.getInstance(bankType2);
        BankAccount bankAccount2 = BankAccountFactory.getInstance(bankType3);

        System.out.println("============Savings============");
        System.out.println(bankAccount.balance());
        System.out.println("============Cheque============");
        System.out.println(bankAccount1.balance());
        System.out.println("============Credit============");
        System.out.println(bankAccount2.balance());
    }
}
