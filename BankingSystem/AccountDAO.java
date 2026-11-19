import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDAO {

    public void insertAccount(Account account) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO Account VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.executeUpdate();

            con.close();

            System.out.println("Account saved successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}