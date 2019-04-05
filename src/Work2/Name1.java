package Work2;
//import java.Class.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.w3c.dom.CDATASection;

public class Name1 {
	 
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				try {
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Statement s=con.createStatement();
				ResultSet k=s.executeQuery("select * from data3");
				while(k.next())
				{
					String Name=k.getString("name");
					System.out.println(Name);
				}
				s.execute("insert into data3 values('dhanu',23)");
		// TODO Auto-generated method stub
	
	}

}
