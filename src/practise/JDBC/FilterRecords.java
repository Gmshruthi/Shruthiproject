package Git.src.practise.JDBC;

import java.sql.*;
import java.util.Scanner;

public class FilterRecords{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter author:");
        String author=scanner.next();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="SELECT title FROM books WHERE Author=?";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,author);
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
