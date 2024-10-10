package Git.src.practise.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeConnection{
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=Intern_ShruthiGM;encrypt=true;trustServerCertificate=true";
        String user = "shruthigm";
        String password = "Shruthi16";
        String sql="CREATE TABLE Employee"+" (EmployeeId VARCHAR(50) PRIMARY KEY NOT NULL," + "FirstName VARCHAR(50) NOT NULL," + " LastName VARCHAR(50) NOT NULL," +
                " MiddleName VARCHAR(50)," + " DateOfBirth DATE NOT NULL,"+ "Gender VARCHAR(50) NOT NULL,"+
        "EmailAddress VARCHAR(50) UNIQUE NOT NULL,"+"PhoneNumber VARCHAR(50) UNIQUE NOT NULL," + "Address VARCHAR(50) NOT NULL,"+"JobTitle VARCHAR(50) NOT NULL," +
                "Department VARCHAR(50) NOT NULL,"+"ManagerId VARCHAR(50) NOT NULL,"+"DateofJoining DATE NOT NULL," +"Employmentstatus VARCHAR(50)," +
                "Salary VARCHAR(50) NOT NULL,"+ "WorkLocation VARCHAR(50),"+"EmergencyContact VARCHAR(50) NOT NULL," +" Skills VARCHAR(50) NOT NULL," +
                "Education VARCHAR(50) NOT NULL,"+" Certification VARCHAR(50),"+"PerformanceReviews VARCHAR(50),"+" PanNumber VARCHAR(50) UNIQUE NOT NULL,"+
                "AaadharNumber VARCHAR(50) UNIQUE NOT NULL,"+"BankAccountDetails VARCHAR(50) UNIQUE NOT NULL)";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("TABLE CREATED");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
