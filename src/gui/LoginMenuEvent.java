package gui;

import javax.swing.*;

import users.*;

import java.awt.*;
import java.awt.event.*;

/**
 * class to events from 
 * the login menu
 */
public class LoginMenuEvent implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		LoginMenu.mainFrame.setVisible(false);
		DisplayInfoMenu.displayInfoMenu(LoginMenu.username.getText());
		
	}

}
