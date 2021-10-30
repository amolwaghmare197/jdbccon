/**
 * 
 */
/**
 * @author JOHN
 *
 */
package jcfirst;
import com.mysql.jdbc.*;
import java.sql.*;
public class demo1{
	public static void main(String [] args) throws Exception {
        
		
		String url ="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String pass="Amol@9331";
		String query="select * from servers";
		
      Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url , username, pass);
		Statement st= con.createStatement();
		ResultSet rs =st.executeQuery(query);
		while(rs.next()) {
		
		String name=rs.getString("Tables_in_mysql");
		System.out.println(name);
		//String name1 =rs.getString("name");
		//System.out.println(name1);
	
	}
		st.close();
		con.close();
	}
}