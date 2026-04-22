import java.sql.*;
public class JDBCConnectionExample {
    public static void main(String[] args)throws SQLException {
        try{
            final String URL = "jdbc:mysql://localhost:3306/StudentDB";
            final String USERNAME = "root";
            final String PASSWORD = "Root";
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println(connection.getSchema());
            System.out.println("Connection is successful with DB");
            connection.close();
        }catch(Exception e){
            System.out.println(e);
         }
    }
}
