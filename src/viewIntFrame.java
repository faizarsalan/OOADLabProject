
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class viewIntFrame extends JInternalFrame implements MouseListener, ActionListener {
	
	JPanel northPanel, southPanel, centerPanel;
	JTable table;
	DefaultTableModel dtm;
	JScrollPane scrollPane;
	JLabel id, name, desc, price, stock;
	Vector<Object> rowData;
	JTextField idField, nameField, descField, priceField, stockField;
	JButton insert, update, delete;
	Connect con;
	
	public viewIntFrame() {
		
		con = new Connect();
		northPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel(new GridLayout(6,2));
		
		id = new JLabel("ID");
		name = new JLabel("Name");
		desc = new JLabel("Description");
		price = new JLabel("Price");
		stock = new JLabel("Stock");
		
		insert = new JButton("Insert");
		update = new JButton("Update");
		delete = new JButton("Delete");
		
		table = new JTable(dtm);
		genTable();
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Table Clicked");
				id.setText(table.getValueAt(table.getSelectedRow(),0).toString());
				name.setText(table.getValueAt(table.getSelectedRow(),1).toString());
				desc.setText(table.getValueAt(table.getSelectedRow(),2).toString());
				price.setText(table.getValueAt(table.getSelectedRow(),3).toString());
				stock.setText(table.getValueAt(table.getSelectedRow(),3).toString());
			}
		});
		
		scrollPane = new JScrollPane(table);
		
		northPanel.add(scrollPane);
		
		southPanel.add(id);
		southPanel.add(name);
		southPanel.add(desc);
		southPanel.add(price);
		southPanel.add(stock);
		
		centerPanel.add(scrollPane);
		centerPanel.add(id);
		centerPanel.add(idField);
		centerPanel.add(name);
		centerPanel.add(nameField);
		centerPanel.add(desc);
		centerPanel.add(descField);
		centerPanel.add(price);
		centerPanel.add(priceField);
		centerPanel.add(stock);
		centerPanel.add(stockField);
		
		southPanel.add(insert);
		southPanel.add(update);
		southPanel.add(delete);
		
		this.add(northPanel,BorderLayout.NORTH);
		this.add(southPanel,BorderLayout.SOUTH);
		this.add(centerPanel,BorderLayout.CENTER);
		this.setClosable(true);
		this.setTitle("Product internal frame");
		this.setVisible(true);
	}
	
	public void genTable() {
		Object[] column = {"ID", "Name", "Description", "Price", "Stock"};
		
		dtm = new DefaultTableModel(column, 0);
		
		System.out.println("debug");
		con.rs = con.execQuery("SELECT * FROM test2");
		System.out.println("debug2");
		
		try {
			while(con.rs.next()) {
				rowData = new Vector<>();
				
				int id = con.rs.getInt("id");
				String name = con.rs.getString("name");
				String desc = con.rs.getString("desc");
				int price = con.rs.getInt("price");
				int stock = con.rs.getInt("stock");
				
				rowData.add(id);
				rowData.add(name);
				rowData.add(desc);
				rowData.add(price);
				rowData.add(stock);
				
				dtm.addRow(rowData);
			}
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		table.setModel(dtm);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	J

}