package EmployeeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
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
		    
		    String UpdateQuery = "Update company.employee set employee.email ='praneeth2@gmail.com' where employee.employeeId = 1001"; 
		    PreparedStatement ps = con.prepareStatement(UpdateQuery);
		    ps.execute();
		    System.out.println("Update Successfully");
		} catch (ClassNotFoundException e) {
            System.out.println("Unable to find the Driver class.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
