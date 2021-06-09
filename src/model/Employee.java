package model;

import java.util.*;

import connect.Connect;

import java.sql.*;

public class Employee {
	
	private static Connect con = new Connect();
	
	//Instance Fields
	private int employeeID;
	private int empRoleID;
	private int positionID;
	private String empName;
	private String empStatus;
	private int salary;
	private String empUsername;
	private String empPassword;
	

	public Employee() {
		// TODO Auto-generated constructor stub
		super();
		this.employeeID = employeeID;
		this.empRoleID = empRoleID;
		this.positionID = positionID;
		this.empName = empName;
		this.empStatus = empStatus;
		this.salary = salary;
		this.empUsername = empUsername;
		this.empPassword = empPassword;
	}

	public Employee insertEmployee() {
		Employee employee = new Employee();
		
		try{
			String query = String.format("INSERT INTO Employee (roleID, name, username, salary, status, password) VALUES ('%d', '%s', '%s', '%d', '%s', '%s')", empRoleID, empName, empUsername, salary, empStatus, empPassword);
			con.stat.execute(query);
		}
		catch(Exception e) {
			return null;
		}
		return employee;
	}
	
	public boolean insert() {
		PreparedStatement ps = Connect.getInstance().prepareStatement("INSERT INTO Employee VALUES");
		ps.setString(parameterIndex, x);
		
		ps.executeUpdate();
		
	}
	
	public static List<Employee> getAllEmployees() {
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Employee");
			
			while(con.rs.next() == true) {
				Employee employee = new Employee();
				
				employee.setEmployeeID(con.rs.getInt("ID"));
				employee.setEmployeeRoleID(con.rs.getInt("roleID"));
				employee.setEmployeeName(con.rs.getString("name"));
				employee.setEmployeeUsername(con.rs.getString("username"));
				employee.setSalary(con.rs.getInt("Salary"));
				employee.setEmployeeStatus(con.rs.getString("status"));
				employee.setEmployeePassword(con.rs.getString("password"));
				
			}
		}
		
		catch (Exception e) {
			return null;
		}
		
		return listEmployee;
		
	}
	
	public static Employee getEmployee(int employeeID) {
		Employee employee = new Employee();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Employee WHERE ID = " + employeeID);
			
			if(con.rs.next() == true) {
				employee.setEmployeeID(con.rs.getInt("ID"));
				employee.setEmployeeRoleID(con.rs.getInt("roleID"));
				employee.setEmployeeName(con.rs.getString("name"));
				employee.setEmployeeUsername(con.rs.getString("username"));
				employee.setSalary(con.rs.getInt("salary"));
				employee.setEmployeeStatus(con.rs.getString("status"));
				employee.setEmployeePassword(con.rs.getString("password"));
			}
		}
		
		catch(Exception e) {
			return null;
		}
		return employee;
	}
	
	public Employee updateEmployee() {
		Employee employee = new Employee();
		try {
			PreparedStatement ps = con.prepareStatement("UPDATE Employee SET roleID=?, name=?, username=?, salary=?, status=?, password=? WHERE id=?");
			ResultSet rs = ps.executeQuery();
			
			ps.setInt(1, empRoleID);
			ps.setString(2, empName);
			ps.setString(3, empUsername);
			ps.setInt(4, salary);
			ps.setString(5, empStatus);
			ps.setString(6, empPassword);
		}
		catch(Exception e) {
			return null;
		}
		return employee;
	}
	
	public boolean update() {
		PreparedStatement ps = Connect.getInstance().prepareStatement("UPDATE Employee SET roleID=?, name=?, username=?, salary=?, status=?, password=? WHERE id=?");
		ps.setInt(1, employeeID);
	}
	
	public boolean fireEmployee(int employeeID) {
		
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getEmployeeRoleID() {
		return empRoleID;
	}

	public void setEmployeeRoleID(int empRoleID) {
		this.empRoleID = empRoleID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmployeeName() {
		return empName;
	}

	public void setEmployeeName(String empName) {
		this.empName = empName;
	}

	public String getEmployeeUsername() {
		return empUsername;
	}

	public void setEmployeeUsername(String empUsername) {
		this.empUsername = empUsername;
	}

	public String getEmployeeStatus() {
		return empStatus;
	}

	public void setEmployeeStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmployeePassword() {
		return empPassword;
	}

	public void setEmployeePassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}
	
	public List<Employee> getAll(){
		List<Employee> employee = new List<>();
		
		try {
			PreparedStatement ps = Connect.getInstance().prepared
		}
		
		}
	

	
	
}
