package database;
import java.sql.*;
public class select
{
    private static final String url ="jdbc:mysql://localhost:3306/Demo ";
    private static final String username ="root";
    private static final String password ="cancer";

    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            int rows =st.executeUpdate(" insert  into Student(id ,name , marks) values (7,'harish',600)");

            if(rows>0){
                System.out.println("Data Instrted sucessfully");
            }else{
                System.out.println("Data Not Inserted");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }


}
