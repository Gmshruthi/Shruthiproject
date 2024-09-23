package Git.src.practise.JDBC;

import java.sql.*;

public class CountRecord{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        String sql="SELECT COUNT(*) AS NumberOfRecords FROM books";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            ResultSet resultSet= preparedStatement.executeQuery();
            resultSet.next();
            System.out.println("COUNT:" + resultSet.getInt("NumberOfRecords") + " records");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}