package gui;

import javax.swing.*;

import users.*;


import java.awt.*;
import java.awt.event.*;

public class DisplayInfoMenuEvent implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DisplayInfoMenu.mainFrame.setVisible(false);
		DisplayInfoMenu.displayInfoMenu(LoginMenu.username.getText());
		
	}

}
