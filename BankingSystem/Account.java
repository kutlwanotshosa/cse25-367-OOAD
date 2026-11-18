 public abstract class Account{
                protected String accountNumber;
                protected double balance;
                protected String branch; 
              
public Account(String accountNumber,
                   double balance,
                   String branch) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}