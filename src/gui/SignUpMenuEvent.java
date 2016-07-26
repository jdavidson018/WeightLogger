package gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import database.UserData;
/**
 * handle events from the 
 * sign up page
 * 
 */
public class SignUpMenuEvent implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		SignUpMenu.mainFrame.setVisible(false);
		String nameOfUser = new String(SignUpMenu.nameField.getText());
		String username = new String(SignUpMenu.usernameField.getText());
		String password = new String(SignUpMenu.passwordField.getPassword());
		Double StartWeight = Double.parseDouble(SignUpMenu.startWeightField.getText());
		Double goalWeight = Double.parseDouble(SignUpMenu.goalWeightField.getText());
		database.UserData.addUser(nameOfUser, username, password, StartWeight, goalWeight);
		MainMenu.mainMenu();
		
	}

}
