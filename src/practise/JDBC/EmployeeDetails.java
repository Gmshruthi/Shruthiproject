package Git.src.practise.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetails {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        String sql="INSERT INTO employee VALUES('1','G M','MOHAN','SHRUTHI','2004-10-06','FeMale','shruti6040@gmail.com','9672084248','VGN MAHALAKSHMI NAGAR TVK CHENNAI','Intern','Trainee','CIM01'," +
                "'2024-07-15','Part Time','null','Medavakam','9123456789','Java'," +
                "'BCA',null,null,'ABCD123456','1234 5678 9123 4567','Axis12345678')";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("ROWS AFFECTED");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

