package Git.src.practise.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class EstablishConnection{
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
            String user = "shruthigm";
            String password = "Shruthi16";
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the database!");
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

