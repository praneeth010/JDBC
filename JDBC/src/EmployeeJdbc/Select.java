package EmployeeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
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
		    
		    String SelectQuery = "SELECT * FROM employee"; 
		    PreparedStatement ps = con.prepareStatement(SelectQuery);
		    ResultSet rs = ps.executeQuery();
		    while(rs.next()) {
		    	System.out.println(rs.getInt("employeeId")+" "+rs.getString("firstname")+" "+rs.getString("lastname")+" "+
		    rs.getString("gender")+" "+rs.getString("father_name")+" "+rs.getDate("dateOfBirth")+" "+rs.getString("designation")+" "+
		    			rs.getLong("phone")+" "+rs.getString("email")+" "+rs.getString("department")+" "+rs.getDouble("salary")+" "+
		    rs.getDate("joinDate")+" "+rs.getString("qualification")+" "+rs.getString("present_Address")+" "+rs.getString("permanent_Address"));
		    }
		    System.out.println("Update Successfully");
		} catch (ClassNotFoundException e) {
            System.out.println("Unable to find the Driver class.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
