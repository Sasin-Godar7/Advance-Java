
import java.sql.*;
public class JDBCExample {

    public static void main(String[] args) throws SQLException {
        String url =
                "jdbc:mysql://localhost:3306/collage";

        String username = "root";
        String password ="password";

        try (
            Connection con = DriverManager.getConnection(url, username, password);
        );

        Statement stmt = con.createStatement();

        ResultSet rs =
                stmt.executeQuery("SELECT * FROM Student");



    }
}
