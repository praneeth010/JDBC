package EmployeeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Jdbc {
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
		    /*String createTableQuery = "CREATE TABLE employee (" +
                    "employeeId INT, " +
                    "firstname VARCHAR(50), " +
                    "lastname VARCHAR(50), " +
                    "gender VARCHAR(10), " +
                    "father_name VARCHAR(50), " +
                    "dateOfBirth DATE, " +
                    "designation VARCHAR(50), " +
                    "phone BIGINT, " +
                    "email VARCHAR(100), " +
                    "department VARCHAR(50), " +
                    "salary DOUBLE, " +
                    "joindate DATE, " +
                    "qualification VARCHAR(100), " +
                    "present_address VARCHAR(200), " +
                    "permanent_address VARCHAR(200)" +
                    ")";
		    PreparedStatement createTableStatement = con.prepareStatement(createTableQuery);
            createTableStatement.execute();*/

            System.out.println("Table 'employee' created successfully");
            
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Enter employee ID: ");
            int employeeId = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Enter employee's first name: ");
            String firstName = scan.nextLine();
            
            System.out.print("Enter employee's last name: ");
            String lastName = scan.nextLine();
            
            System.out.print("Enter employee's gender: ");
            String gender = scan.nextLine();
            
            System.out.print("Enter employee's father's name: ");
            String fatherName = scan.nextLine();
            
            System.out.print("Enter employee's date of birth (YYYY-MM-DD): ");
            String dobString = scan.next();
            LocalDate dateOfBirth = LocalDate.parse(dobString);
            scan.nextLine();
            
            System.out.print("Enter employee's designation: ");
            String designation = scan.nextLine();
            
            
            System.out.print("Enter employee's phone number: ");
            long phone = scan.nextLong();
            scan.nextLine();
            
            System.out.print("Enter employee's email address: ");
            String email = scan.nextLine();
            
            System.out.print("Enter employee's department: ");
            String department = scan.nextLine();
            
            System.out.print("Enter employee's salary: ");
            double salary = scan.nextDouble();
            
            System.out.print("Enter employee's join date (YYYY-MM-DD): ");
            String joinDateString = scan.next();
            LocalDate joinDate = LocalDate.parse(joinDateString);
            scan.nextLine();
            
            System.out.print("Enter employee's qualification: ");
            String qualification = scan.nextLine();
            
            
            System.out.print("Enter employee's present address: ");
            String presentAddress = scan.nextLine();
           
            
            System.out.print("Enter employee's permanent address: ");
            String permanentAddress = scan.nextLine();
            

            String query = "insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
		    ps.setInt(1, employeeId);
		    ps.setString(2, firstName);
		    ps.setString(3, lastName);
		    ps.setString(4, gender);
		    ps.setString(5, fatherName);
		    ps.setDate(6, java.sql.Date.valueOf(dateOfBirth));
		    ps.setString(7, designation);
		    ps.setLong(8, phone);
		    ps.setString(9, email);
		    ps.setString(10, department);
		    ps.setDouble(11, salary);
		    ps.setDate(12, java.sql.Date.valueOf(joinDate));
		    ps.setString(13, qualification);
		    ps.setString(14, presentAddress);
		    ps.setString(15, permanentAddress);
		    ps.execute();
		    
		    System.out.println("Data has been inserted Successfully...");
		    

        } catch (ClassNotFoundException e) {
            System.out.println("Unable to find the Driver class.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
