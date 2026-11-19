public class AccountController {

    public void deposit(Account account,
                        double amount) {

        account.deposit(amount);
    }

    public void withdraw(Account account,
                         double amount) {

        account.withdraw(amount);
    }

    public double getBalance(Account account) {

        return account.getBalance();
    }

    public void payInterest(Account account) {

        if(account instanceof SavingsAccount) {

            ((SavingsAccount) account).payInterest();

        } else if(account instanceof InvestmentAccount) {

            ((InvestmentAccount) account).payInterest();
        }
    }
}   