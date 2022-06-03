package loan;

public class HomeLoan implements Loan{
    @Override
    public String loanBalance() {
        return "Home Loan outstanding amount: R50 404";
    }
}
