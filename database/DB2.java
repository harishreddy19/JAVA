package database;
import java.sql.*;
public class DB2 {
    private static final String url = "jdbc:mysql://localhost:3306/Demo";
    private static final String username = "root";
    private static final String password = "cancer";
    public static void main(String[] args) {
        try{
            String query = "select * from Student";
            //String query = "insert into Student(id,name,marks) values (4,'Rajesh',746)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String nma = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(id + "    "+ nma+ "    "+marks);
            }
//            if(rows>0){
//                System.out.println("Data Insretd");5
//            }else{
//                System.out.println("Data Not Insted");
//            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
