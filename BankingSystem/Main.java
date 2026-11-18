public class Main {

    public static void main(String[] args) {

        Customer customer =
                new Customer(
                        "Kutlwano",
                        "Tshosa",
                        "Gaborone");

        SavingsAccount savings =
                new SavingsAccount(
                        "S001",
                        1000,
                        "Main Branch");

        InvestmentAccount investment =
                new InvestmentAccount(
                        "I001",
                        500,
                        "Main Branch");

        customer.addAccount(savings);
        customer.addAccount(investment);

        savings.deposit(500);
        investment.deposit(1000);

        savings.payInterest();
        investment.payInterest();

        System.out.println("Account Balances:");
        customer.viewAccounts();
    }
}