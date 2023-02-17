package First_trial;
import java.util.*;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws SQLException {
		//1
		Connection con=DriverManager.getConnection
				("jdbc:mysql://127.0.0.1:3306/db_for_jdbc","root","root");
		
		
		//2
		Statement stmt=con.createStatement();
//		String s="INSERT  INTO tbl VALUES(100,'Dharmesh')";
		String s="create table PGR_Tex (no int,name varchar (20));",s2="use db_for_jdbc;";
		
		//3
		stmt.execute(s2);
		stmt.execute(s);
		
		//4
		con.close();
		System.out.println("hi");
	}

}
