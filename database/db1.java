package database;
import java.sql.*;
public class db1 {
    private  static  final String url = "jdbc:mysql://localhost:3306/Demo";
    private  static  final String username = "root";
    private  static  final String password = "cancer";

    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            int rows =st.executeUpdate("insert into Employees (EmployeeID,FirstName,LastName)values('4','harish','reddy')");
            if (rows >0){
                System.out.println("data inserted sucessfully");
            }
            else {
                System.out.println("data not inserted");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
