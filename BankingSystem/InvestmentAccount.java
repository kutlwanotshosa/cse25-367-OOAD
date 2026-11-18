public class InvestmentAccount extends Account
        implements InterestPayable {

    private final double interestRate = 0.05;

    public InvestmentAccount(String accountNumber,
                             double balance,
                             String branch) {

        super(accountNumber, balance, branch);

        if (balance < 500) {
            throw new IllegalArgumentException(
                    "Minimum opening balance is BWP500");
        }
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void payInterest() {
        balance += calculateInterest();
    }
}