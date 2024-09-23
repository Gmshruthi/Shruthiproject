package Git.src.practise.JDBC;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        System.out.println("Enter  id:");
        Scanner scanner=new Scanner(System.in);
        int id= scanner.nextInt();
        String sql= "DELETE FROM books WHERE id=?";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            System.out.println("record deleted");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
