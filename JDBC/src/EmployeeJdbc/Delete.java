package EmployeeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver Found Successfully..");
		   
		    String url = "jdbc:mysql://localhost:3306/company";
		    String username = "root";
		    String password = "root";
		    
		    Connection con;
		    con = DriverManager.getConnection(url,username,password);
		    System.out.println("Connected with Database Successfully...");
		    
		    String DeleteQuery = "DELETE FROM company.employee WHERE employee.employeeId = 100"; 
		    PreparedStatement ps = con.prepareStatement(DeleteQuery);
		    ps.execute();
		    System.out.println("Delete Successfully");
		} catch (ClassNotFoundException e) {
            System.out.println("Unable to find the Driver class.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
