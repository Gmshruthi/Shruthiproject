package Git.src.practise.JDBC;

import java.sql.*;

public class RetrieveRecords{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql="SELECT * FROM books";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            ResultSet resultSet= preparedStatement.executeQuery();
            System.out.println("id\t\ttitle\t\tauthor");
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String title= resultSet.getString("title");
                String author= resultSet.getString("author");
                System.out.println(id+ "\t\t" + title+ "\t\t" +author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}