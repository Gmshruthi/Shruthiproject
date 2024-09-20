package Git.src.practise.JDBC;

import java.sql.*;
import java.util.Scanner;

public class UpdateRecord{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  id:");
        int id= scanner.nextInt();
        System.out.println("Enter new title:");
        String newTitle=scanner.next();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="UPDATE books set title=? where id=?";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(2,id);
            preparedStatement.setString(1,newTitle);
            preparedStatement.executeUpdate();
            System.out.println("updated successfully");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
