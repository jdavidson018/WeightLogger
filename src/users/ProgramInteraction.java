package users;

import java.util.Scanner;
import database.UserData;

public class ProgramInteraction {
	
	
	/* createNewUser
	 * function to allow users to input data and create a new instance of the Users object
	 */
	public static Users createNewUser(){
		
		//use a Scanner to gather information about the new user
		Scanner one = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String name = one.next();
		
		System.out.println("Enter desired username:");
		String username = one.next();
		
		System.out.println("Enter desired passwork:");
		String password = one.next();
		
		System.out.println("Enter current weight:");
		double startWeight = one.nextDouble();
		
		System.out.println("Enter goal weight:");
		double goalWeight = one.nextDouble();
		
		one.close();
		
		
		//create new DailyWeights instance for the new user
		DailyWeights user = new DailyWeights(startWeight);
		
		//create a new LinkedList instance for the new user and add first instance DailyWeights
		LinkedList progress = new LinkedList();
		progress.addToStart(user);
		
		Users newUser = new Users(name, username, password, startWeight, goalWeight, progress);
		
		return newUser;
	}
	
	
	public static String getName(String username){
		return UserData.getName(username);
	}
	
	public static double getStartWeight(String username){
		return UserData.getStartWeight(username);
	}
	
	public static double getGoalWeight(String username){
		return UserData.getGoalWeight(username);
	}
	
	public static String getProgress(String username){
		StringBuilder builder = new StringBuilder();
		for(String s: UserData.getDailyWeights(username)){
			builder.append(s);
		}
		return builder.toString();
	}

}
