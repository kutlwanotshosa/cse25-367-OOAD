public class ChequeAccount extends Account {

    private String companyName;
    private String companyAddress;

    public ChequeAccount(String accountNumber,
                         double balance,
                         String branch,
                         String companyName,
                         String companyAddress) {

        super(accountNumber, balance, branch);

        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}