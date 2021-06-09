package model;
import java.util.ArrayList;
import java.util.List;

import connect.Connect;

public class Voucher {
	
	private static Connect con = new Connect();
	
	private int voucherID;
	private int discount;
	private String status;
	
	public generateVoucher() {
		
	}
	
	public static List<Voucher> getAllVouchers() {
		List<Voucher> listVoucher = new ArrayList<Voucher>();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Voucher");
			
			while(con.rs.next() == true) {
				Voucher voucher = new Voucher();
				
				voucher.setVoucherID(con.rs.getInt("voucherID"));
				voucher.setDiscount(con.rs.getInt("discount"));
				voucher.setStatus(con.rs.getString("status"));
			}
		}
		
		catch (Exception e) {
			return null;
		}
		
		return listVoucher;
	}
	
	public static Voucher getVoucher(int voucherID) {
		Voucher voucher = new Voucher();
		
		try {
			con.rs = con.execQuery("SELECT * FROM Employee WHERE ID = " + voucherID);
			
			if(con.rs.next() == true) {
				voucher.setVoucherID(con.rs.getInt("voucherID"));
				voucher.setDiscount(con.rs.getInt("discount"));
				voucher.setStatus(con.rs.getString("status"));
			}
		}
		
		catch(Exception e) {
			return null;
		}
		return voucher;
	}
	
	public deleteVoucher(int voucherID) {
		
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
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
