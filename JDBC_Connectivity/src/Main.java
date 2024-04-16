import java.sql.*;
public class Main {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/employeedb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static final String INSERT_QUERY = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

    public static void main(String[] args) {
        Object[][] employees = {
                {101, "Jenny", 25, 10000},
                {102, "Jacky", 30, 20000},
                {103, "Joe", 20, 40000},
                {104, "John", 40, 80000},
                {105, "Shameer", 25, 90000}
        };

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            statement = connection.prepareStatement(INSERT_QUERY);

            for (Object[] employee : employees) {
                statement.setInt(1, (Integer) employee[0]);
                statement.setString(2, (String) employee[1]);
                statement.setInt(3, (Integer) employee[2]);
                statement.setInt(4, (Integer) employee[3]);

                statement.executeUpdate();
            }

            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}