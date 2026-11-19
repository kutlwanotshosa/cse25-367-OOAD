import java.util.ArrayList;

public class Customer {
    private String customerID;
    private String firstName;
    private String surname;
    private String address;

    private ArrayList<Account> accounts =
            new ArrayList<>();

    public Customer(String customerID,
                    String firstName,
                    String surname,
                    String address) {

        this.customerID = customerID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewAccounts() {

        for (Account acc : accounts) {

            System.out.println(
                    acc.getAccountNumber()
                    + " Balance: "
                    + acc.getBalance());
        }
    }
}