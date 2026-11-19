import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionDAO {

    public void insertTransaction(
            Transaction transaction) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO Transaction VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.executeUpdate();

            con.close();

            System.out.println("Transaction saved successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}