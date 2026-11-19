public class CustomerController {

    public Customer registerCustomer(
            String customerId,
            String firstName,
            String surname,
            String address) {

        return new Customer(
                customerId,
                firstName,
                surname,
                address);
    }
}