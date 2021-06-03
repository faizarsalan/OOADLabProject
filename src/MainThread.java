import java.util.*;

public class MainThread {
	
	Scanner scan = new Scanner(System.in);
	
	Vector<Employee> empList = new Vector<>();
	Vector<Product> prodList = new Vector<>();
	Vector<Voucher> vouchList = new Vector<>();
	Vector<Transaction> tranList = new Vector<>();
	
	public void mainMenu() {
		System.out.println("1. Barista");
		System.out.println("2. Product Admin");
		System.out.println("3. Manager");
		System.out.println("4. Human Resource Department");
	}
	
	public void empMenu() {
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Search Employee");
		System.out.println("4. View All Employee");
		System.out.println("5. Fire Employee");
	}
	
	public void prodMenu() {
		System.out.println("1. Add New Product");
		System.out.println("2. Update Product");
		System.out.println("3. Search Product");
		System.out.println("4. View All Product");
		System.out.println("5. Delete Product");
	}
	
	public void vouchMenu() {
		System.out.println("1. Add New Voucher");
		System.out.println("3. Search Voucher");
		System.out.println("4. View All Voucher");
		System.out.println("5. Delete Voucher");
	}
}
