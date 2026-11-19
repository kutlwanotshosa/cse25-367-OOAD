import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO{
        public void insertCustomer(Customer customer) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO Customer VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);
            ps.setString(1, customer.getCustomerId());
            ps.setString(2, customer.getFirstName());
            ps.setString(3, customer.getSurname());
            ps.setString(4, customer.getAddress());


            ps.executeUpdate();

            con.close();

            System.out.println("Customer saved successfully");

        } catch (Exception e) {

             e.printStackTrace();
        }
    }
}
