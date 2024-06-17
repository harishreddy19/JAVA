package database;
import java.sql.*;
public class Db {
    private static final String url = "jdbc:mysql://localhost:3306/Demo";
    private static final String username = "root";
    private static final String password = "cancer";
    public static void main(String args[]){
        try{
            String query = "select * from Student";   //sql query
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println("Id :"+id+"  "+"Name : "+name+"    "+"Marks: "+marks);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
