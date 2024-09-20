package Git.src.practise.JDBC;

import java.sql.*;

public class SearchByTitle{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="SELECT * FROM books WHERE title='marry gold'";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
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