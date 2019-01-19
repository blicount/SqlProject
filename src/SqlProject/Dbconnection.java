package SqlProject;
import java.sql.*;

public class Dbconnection {
	
	  Connection connection = null;
	  Statement stmt = null;
	  ResultSet rs = null;
public void Runconnection(){	
	String url = "jdbc:mysql://localhost:3306/db_lic";
	String username = "root";
	String password = "gjEinp3x";// 
	System.out.println("Connecting database...");

try{ 

connection = DriverManager.getConnection(url, username, password) ;

System.out.println("Database connected!");

		} catch (SQLException e) {
		  throw new IllegalStateException("Cannot connect the database!", e);
		}
		
	}  

public void Closeconnection(){
	try{
		if(connection!=null)
			connection.close();
		 System.out.println("Database disconnected!");
		
		
		}catch (SQLException e) {
			  throw new IllegalStateException("Cannot disconnect the database!", e);
			}
	}
}



