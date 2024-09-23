package Git.src.practise.JDBC;

import java.sql.*;
import java.util.Scanner;

public class SearchByTitle{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter title:");
        String inputTitle=scanner.next();
        String sql="SELECT * FROM books WHERE title=?";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,inputTitle);
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()) {
                int id= resultSet.getInt("id");
                String title= resultSet.getString("title");
                String author= resultSet.getString("author");
                System.out.println(id+ "\t\t" + title+ "\t\t" +author);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}