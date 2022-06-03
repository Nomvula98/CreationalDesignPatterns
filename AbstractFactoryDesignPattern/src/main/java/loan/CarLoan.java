package loan;

public class CarLoan implements Loan{

    @Override
    public String loanBalance() {
        return "Car Loan outstanding amount: R87 595";
    }
}
