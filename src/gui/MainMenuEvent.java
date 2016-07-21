package gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MainMenuEvent implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if(command.equals("Sign Up")){
			MainMenu.mainFrame.setVisible(false);
			SignUpMenu.signUpMenu();
		}
		else if(command.equals("Sign In")){
			MainMenu.mainFrame.setVisible(false);
			LoginMenu.loginMenu();
			
		}
		
	}

}
