package EmployeeJdbc;

import java.time.LocalDate;

public class Employee {
	
	private int employeeId;
	private String firstname;
	private String lastname;
	private String gender;
	private String father_name;
	private LocalDate dateOfBirth;
	private String designation;
	private long phone;
	private String email;
	private String department;
	private double salary;
	private LocalDate joindate;
	private String qualification;
	private String present_address;
	private String prament_address;
	
	public Employee(int employeeId, String firstname, String lastname, String gender, String father_name,
			LocalDate dateOfBirth, String designation, long phone, String email, String department, double salary,
			LocalDate joindate, String qualification, String present_address, String prament_address) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.father_name = father_name;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.salary = salary;
		this.joindate = joindate;
		this.qualification = qualification;
		this.present_address = present_address;
		this.prament_address = prament_address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", father_name=" + father_name + ", dateOfBirth=" + dateOfBirth
				+ ", designation=" + designation + ", phone=" + phone + ", email=" + email + ", department="
				+ department + ", salary=" + salary + ", joindate=" + joindate + ", qualification=" + qualification
				+ ", present_address=" + present_address + ", prament_address=" + prament_address + "]";
	}

}
