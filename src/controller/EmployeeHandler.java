package controller;

import java.util.*;

import model.Employee;

public class EmployeeHandler {

	public EmployeeHandler() {
		
	}
	
	public static String errorMessage
	
	public static List<Employee> getAllEmployees(){
		Employee employee = new Employee();
		return employee.getAll();
	}
	
	public static boolean insertEmployee(int employeeID, int empRoleID, int positionID, String empName, String empStatus, int salary, String empUsername, String empPassword) {
		if(employeeID) {
			errorMassage = "ID cannot be empty!";
			return false;
		}else if(employeeName.length()<5 || !Character.isUpperCase(employeeName.charAt(0))) {
			return false;
		}
		
		Employee employee = new Employee();
		employee.setEmployeeID(employeeID);
		
		if(!Employee.insert())
		
		return employee.insert();
	}
	
	public static boolean updateEmployee()
	{
		Employee employee = new Employee();
		
		employee.setEmployeeID(employeeID);
		employee.setEmployeeRoleID(empRoleID);
		employee.setPositionID(positionID);
		employee.setEmployeeName(empName);
		employee.setEmployeeStatus(empStatus);
		employee.setSalary(salary);
		employee.setEmployeeUsername(empUsername);
		employee.setEmployeePassword(empPassword);
	
		
		
	}
	
	public static boolean deleteEmployee(int employeeID) {
		Employee employee = new Employee();
		
	}
}
