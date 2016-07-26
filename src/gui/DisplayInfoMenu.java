package gui;

import java.awt.*;
import java.util.Arrays;
import users.*;
import javax.swing.*;

public class DisplayInfoMenu {
	
	public static JFrame mainFrame;
	private static JLabel name;
	private static JLabel startWeight;
	private static JLabel goalWeight;
	private static JLabel progress;
	private static JTextField displayName;
	private static JTextField displayStartWeight;
	private static JTextField displayGoalWeight;
	private static JTextArea displayProgress;
	private static JButton addWeight;
	public static JTextField addWeightDisplay;
	
	public static void displayInfoMenu(String username){
		mainFrame = new JFrame("Information");
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new GridLayout(5,2));
		
		name = new JLabel("Name: ");
		startWeight = new JLabel("Start Weight: ");
		goalWeight = new JLabel("Goal: ");
		progress = new JLabel("progress");
		addWeight = new JButton("Add Today's Weight");
		addWeightDisplay = new JTextField("Enter your current weight");
		addWeightDisplay.setEditable(true);
		
		displayName = new JTextField(users.ProgramInteraction.getName(username));
		displayStartWeight = new JTextField(Double.toString(users.ProgramInteraction.getStartWeight(username)));
		displayGoalWeight = new JTextField(Double.toString(users.ProgramInteraction.getGoalWeight(username)));
		displayProgress = new JTextArea(users.ProgramInteraction.getProgress(username));
		
		addWeight.addActionListener(new addWeightEvent());
		
		mainFrame.add(name);
		mainFrame.add(displayName);
		mainFrame.add(startWeight);
		mainFrame.add(displayStartWeight);
		mainFrame.add(goalWeight);
		mainFrame.add(displayGoalWeight);
		mainFrame.add(progress);
		mainFrame.add(displayProgress);
		mainFrame.add(addWeight);
		mainFrame.add(addWeightDisplay);
		
		mainFrame.setVisible(true);
		
	}

}
