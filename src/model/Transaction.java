package model;

import java.util.*;

import connect.Connect;

public class Transaction {

	private static Connect con = new Connect();
	
	private static int transactionID;
	private Date purchaseDate;
	private int voucherID;
	private int employeeID;
	private int totalPrice;
	
	public Transaction insertTransaction() {
		Transaction trans = new Transaction();

		try{
			String query = String.format("INSERT INTO Transaction (transactionID, purchaseDate, voucherID, employeeID, totalPrice) VALUES ('%d', '%s', '%d', '%d', '%d')", transactionID, purchaseDate, voucherID, employeeID, totalPrice);
			con.stat.execute(query);
		}
		catch(Exception e) {
			return null;
		}
		return trans;
	}
	
	public static List<Transaction> getAllTransaction() {
		List<Transaction> listTransaction = new ArrayList<Transaction>();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Transaction");
			
			while(con.rs.next() == true) {
				Transaction trans = new Transaction();
				
				trans.setTransactionID(con.rs.getInt("transactionID"));
				trans.setPurchaseDate(con.rs.getDate("purchaseDate"));
				trans.setVoucherID(con.rs.getInt("voucherID"));
				trans.setEmployeeID(con.rs.getInt("employeeID"));
				trans.setTotalPrice(con.rs.getInt("price"));

			}
		}
		
		catch (Exception e) {
			return null;
		}
		
		return listTransaction;
	}
	
	public static Transaction getTransactionDetail() {
		Transaction trans = new Transaction();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Employee WHERE ID = " + transactionID);
			
			if(con.rs.next() == true) {
				trans.setTransactionID(con.rs.getInt("transactionID"));
				trans.setPurchaseDate(con.rs.getDate("purchaseDate"));
				trans.setVoucherID(con.rs.getInt("voucherID"));
				trans.setEmployeeID(con.rs.getInt("employeeID"));
				trans.setTotalPrice(con.rs.getInt("price"));
			}
		}
		
		catch(Exception e) {
			return null;
		}
		return trans;
	}

	/**
	 * @return the transactionID
	 */
	public int getTransactionID() {
		return transactionID;
	}

	/**
	 * @param transactionID the transactionID to set
	 */
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the voucherID
	 */
	public int getVoucherID() {
		return voucherID;
	}

	/**
	 * @param voucherID the voucherID to set
	 */
	public void setVoucherID(int voucherID) {
		this.voucherID = voucherID;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the totalPrice
	 */
	public int getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
