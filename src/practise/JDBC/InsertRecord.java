package Git.src.practise.JDBC;

import java.sql.*;

public class InsertRecord{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        String sql="INSERT INTO books VALUES(?,?,?)";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,5);
            preparedStatement.setString(2,"Strangers 2");
            preparedStatement.setString(3,"Peter");
            int i= preparedStatement.executeUpdate();
            System.out.println(i+"Records Inserted");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
