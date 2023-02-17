package First_trial;
import java.util.*;
import java.sql.*;
public class Retrival_from_Mysql {
	public static void main(String[] args) throws SQLException {
		//1
		Connection con=DriverManager.getConnection
				("jdbc:mysql://127.0.0.1:3306/db_for_jdbc","root","root");
		
		
		//2
		Statement stmt=con.createStatement();
//		String s="INSERT  INTO tbl VALUES(100,'Dharmesh')";
//		String s="INSERT  INTO tbl VALUES(101,'Dharun Kumar')";
		String s="Select * from tbl";
		//3,4
		ResultSet rs=stmt.executeQuery(s);
		
		while (rs.next()) {
			System.out.println(rs.getInt("n")+"\t"+rs.getString("name"));
		}
		
		//5
		con.close();
		System.out.println("Closed");
	}

}
