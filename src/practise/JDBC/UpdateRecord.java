package Git.src.practise.JDBC;

import java.sql.*;

public class UpdateRecord{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="UPDATE books set title='MARRY GOLD' where id=2";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            System.out.println("updated successfully");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
