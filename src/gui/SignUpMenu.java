package gui;

import java.awt.*;

import javax.swing.*;

/**
 * class to add new users to the database
 * through the GUI
 */
public class SignUpMenu {
	
	public static JFrame mainFrame;
	private static JLabel name;
	private static JLabel username;
	private static JLabel password;
	private static JLabel startWeight;
	private static JLabel goalWeight;
	public static JTextField nameField;
	public static JTextField usernameField;
	public static JPasswordField passwordField;
	public static JTextField startWeightField;
	public static JTextField goalWeightField;
	private static JButton submit;
	
	
	public static void signUpMenu(){
		mainFrame = new JFrame("Sign Up Menu");
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new GridLayout(6,2));
		
		name = new JLabel("Name: ");
		username = new JLabel("Username: ");
		password = new JLabel("Password: ");
		startWeight = new JLabel("Starting Weight: ");
		goalWeight = new JLabel("Goal Weight: ");
		
		nameField = new JTextField("Enter your name");
		nameField.setEditable(true);
		
		usernameField = new JTextField("Enter your desired username");
		usernameField.setEditable(true);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(true);
		
		startWeightField = new JTextField("How much do you weight now");
		startWeightField.setEditable(true);
		
		goalWeightField = new JTextField("How much does your fatass want to weight?");
		goalWeightField.setEditable(true);
		
		submit = new JButton("Submit");
		submit.addActionListener(new SignUpMenuEvent());
		
		mainFrame.add(name);
		mainFrame.add(nameField);
		mainFrame.add(username);
		mainFrame.add(usernameField);
		mainFrame.add(password);
		mainFrame.add(passwordField);
		mainFrame.add(startWeight);
		mainFrame.add(startWeightField);
		mainFrame.add(goalWeight);
		mainFrame.add(goalWeightField);
		mainFrame.add(submit);
		
		
		mainFrame.setVisible(true);
	}

}
