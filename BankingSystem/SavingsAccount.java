public class SavingsAccount extends Account
        implements InterestPayable {

    private final double interestRate = 0.0005;

    public SavingsAccount(String accountNumber,
                          double balance,
                          String branch) {

        super(accountNumber, balance, branch);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed.");
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