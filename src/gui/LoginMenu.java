package gui;

import java.awt.*;
import javax.swing.*;

/**
 * class to open up the Login Menu
 */
public class LoginMenu {
	public static JFrame mainFrame;
	private static JLabel headerLabel;
	public static JTextField username;
	
	public static void loginMenu(){
		mainFrame = new JFrame("Login Menu");
		mainFrame.setSize(500,400);
		mainFrame.setLayout(new GridLayout(2,2));
		
		headerLabel = new JLabel("Welcome Back", JLabel.CENTER);
		
		username = new JTextField("username");
		username.setEditable(true);
		
		username.addActionListener(new LoginMenuEvent());
		
		
		mainFrame.add(headerLabel);
		mainFrame.add(username);
		mainFrame.setVisible(true);
		
	}

}
