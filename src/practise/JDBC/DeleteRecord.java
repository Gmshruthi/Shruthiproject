package Git.src.practise.JDBC;

import java.sql.*;

public class DeleteRecord{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql= "DELETE FROM books WHERE id=1";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.execute();
            System.out.println("record deleted");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
