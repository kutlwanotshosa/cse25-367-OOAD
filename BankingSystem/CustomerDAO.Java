public void insertCustomer(Customer customer) {

        try {

            Connection con =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO Customer VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.executeUpdate();

            con.close();

            System.out.println("Customer saved successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}