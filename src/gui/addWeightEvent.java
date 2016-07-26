package gui;

import javax.swing.*;

import users.*;

import java.awt.*;
import java.awt.event.*;

public class addWeightEvent implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DisplayInfoMenu.mainFrame.setVisible(false);
		ProgramInteraction.addNewDailyWeight(LoginMenu.username.getText(), Double.parseDouble(DisplayInfoMenu.addWeightDisplay.getText()));
		DisplayInfoMenu.displayInfoMenu(LoginMenu.username.getText());
	}

}
