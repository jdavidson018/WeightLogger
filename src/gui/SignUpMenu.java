package gui;

import java.awt.*;

import javax.swing.*;

/**
 * class to add new users to the database
 * through the GUI
 */
public class SignUpMenu {
	
	public static JFrame mainFrame;
	
	public static void signUpMenu(){
		mainFrame = new JFrame("Sign Up Menu");
		mainFrame.setSize(300,400);
		mainFrame.setVisible(true);
	}

}
