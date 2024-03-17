package example;

import java.sql.Connection;
import java.sql.DriverManager;


public class Demo {

	public static void main(String[] args) {
	
		String url ="jdbc:mysql://localhost:3306/mano";
		String user="root";
		String pass="root";
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,user,pass);
		} catch(Exception e) {
			 e.printStackTrace();
		}
			
		
		
	}
}
