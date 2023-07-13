import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Found Successfully..");

            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "root";

            Connection con;

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected with Database Successfully...");

            String createTableQuery = "CREATE TABLE IF NOT EXISTS coursedata (" +
                    "cid INT, " +
                    "cname VARCHAR(50), " +
                    "duration INT, " +
                    "fee DOUBLE, " +
                    "status VARCHAR(20)" +
                    ")";

            PreparedStatement createTableStatement = con.prepareStatement(createTableQuery);
            createTableStatement.execute();

            System.out.println("Table 'course' created successfully");

            // Rest of your code for inserting data...

        } catch (ClassNotFoundException e) {
            System.out.println("Unable to find the Driver class.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
