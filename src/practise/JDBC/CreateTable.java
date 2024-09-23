package Git.src.practise.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        String sql="CREATE TABLE BOOKS"+"(id INTEGER not null,"+"title VARCHAR(200),"+"author VARCHAR(200),"+"PRIMARY KEY(id))";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("TABLE CREATED");
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}