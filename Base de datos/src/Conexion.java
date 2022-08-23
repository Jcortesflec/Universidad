import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexion{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/futbol","root","");
            Statement stmt=con.createStatement();  
            //String query = "SELECT * FROM pais;";
            //PreparedStatement pstmt = con.prepareStatement(query);
            //pstmt.setString ()
            ResultSet rs=stmt.executeQuery("select * from futbol.equipo");
            System.out.println("Connected"); 
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+ " "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4)
                +" "+rs.getInt(5)+" "+rs.getInt(6));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("libreria no encontrada "+e.getMessage());
        }
    }  
}
