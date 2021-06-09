package view;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class registerPage extends JFrame {
	
	JPanel mainPanel, northPanel, southPanel, centerPanel, usernamePanel;
	JLabel titleLabel, usernameLabel, passwordLabel, roleLabel;
	JButton registerButton;
	JTextField usernameField;
	JPasswordField passwordField;
	JComboBox<String> roleBox;
	Vector<String> role;
	JCheckBox tncBox;
	JList<String> roleList;
	
	public registerPage() {
		init();
		
		setVisible(true);
		setSize(1080,720);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void init() {
		
		mainPanel = new JPanel(new BorderLayout());
		northPanel = new JPanel();
		southPanel = new JPanel();
		centerPanel = new JPanel(new GridLayout(7,2,0,30));
		
		titleLabel = new JLabel("Register Page");
		titleLabel.setFont();
		titleLabel.setForeground(Color.gray);
		northPanel.add(titleLabel);
		
		registerButton = new JButton("Register");
		southPanel.add(registerButton);
		
		usernameLabel = new JLabel("Username");
		usernameField = new JTextField();
		usernameField.setPreferredSize(new Dimension(15,30));
		centerPanel.add(usernameLabel);
		centerPanel.add(usernameField);
		
		passwordLabel = new JLabel("Password");
		passwordField = new JPasswordField();
		centerPanel.add(passwordLabel);
		centerPanel.add(passwordField);
		
		role = new Vector<>();
		role.add("Barista");
		role.add("Manager");
		role.add("Product Admin");
		role.add("Human Resource and Development");
		
		roleLabel = new JLabel("Choose Role");
		roleBox = new JComboBox<>(role);
		roleBox.setSelectedIndex(1);
		centerPanel.add(roleLabel);
		
		roleList = new JList<>(role);
		centerPanel.add(roleList);
		
		tncBox = new JCheckBox(" I agree with terms and conditions. ");
		centerPanel.add(tncBox);
		
		add(mainPanel);	
		
	}
	

}
