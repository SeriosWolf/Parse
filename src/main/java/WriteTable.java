import java.sql.*;

public class WriteTable {
    private final String url = "jdbc:postgresql://127.0.0.1:5432/test";
    private final String user = "postgres";
    private final String password = "08112015";

   public Connection connect() throws SQLException {
       return DriverManager.getConnection(url, user, password);
   }

 }