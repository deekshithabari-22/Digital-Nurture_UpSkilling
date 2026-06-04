import java.sql.*;
public class BasicJDBC {
   public static void main(String[] args) throws SQLException,ClassNotFoundException{
    String url="jdbc:mysql://localhost:3306/student";
    String uname="root";
    String pass="";

    String query="Select * from students";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,uname,pass);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);

    while (rs.next()) {
        System.out.println(rs.getString("name"));
    }
    rs.close();
    st.close();
    con.close();
   } 
}
