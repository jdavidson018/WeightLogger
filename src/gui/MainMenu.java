package gui;

import java.awt.*;
import javax.swing.*;

/**
 * Class for the initial menu
 * will give sign up or sign in options
 */
public class MainMenu {
	public static JFrame mainFrame;
	
	/**
	 * run instance of mainMenu
	 */
	public static void mainMenu(){
		mainFrame = new JFrame("Main Menu");
		mainFrame.setSize(300,400);
		mainFrame.setLayout(new GridLayout(3,3));
			
		JButton newUserButton = new JButton("Sign Up");
		JButton returnUserButton = new JButton("Sign In");
		
		newUserButton.setActionCommand("Sign Up");
		returnUserButton.setActionCommand("Sign In");
		
		newUserButton.addActionListener(new MainMenuEvent());
		returnUserButton.addActionListener(new MainMenuEvent());
		
		mainFrame.add(newUserButton);
		mainFrame.add(returnUserButton);
			
		mainFrame.setVisible(true);
	}

}
