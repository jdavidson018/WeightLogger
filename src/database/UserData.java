package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.*;

public class UserData {
	
	/**
	 * Method to remove all users from the database
	 */
	public static void removeAllUsers(){
		
		Connection conn = DatabaseInfo.getConnection();
		
		try
		{
			String query = "DELETE FROM DailyWeights";
			PreparedStatement ps = conn.prepareStatement(query);
			int rs = ps.executeUpdate();
			query = "DELETE FROM Users";
			ps = conn.prepareStatement(query);
			rs = ps.executeUpdate();
			
			conn.close();
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	
	/**
	 * Adds a user to the database
	 * @param nameOfUser
	 * @param username
	 * @param password
	 * @param StartWeight
	 * @param goalWeight
	 */
	public static void addUser(String nameOfUser, String username, String password, double StartWeight, double goalWeight){
		
		Connection conn = DatabaseInfo.getConnection();
		try
		{
			String query = "INSERT INTO Users (NameOfUser,Username,Pass,StartWeight,GoalWeight)" + "VALUES(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, nameOfUser);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setDouble(4, StartWeight);
			ps.setDouble(5, goalWeight);
			int rs = ps.executeUpdate();
			
			conn.close();
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	
	/**
	 * adds a DailyWeight to the database
	 * @param username
	 * @param todayWeight
	 * @param todayDate
	 */
	public static void addDailyWeight(String username, double todayWeight, String todayDate){
		
		Connection conn = DatabaseInfo.getConnection();
		try
		{
			String query = "INSERT INTO DailyWeights(Username,TodayWeight,TodayDate)" + "VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setDouble(2, todayWeight);
			ps.setString(3, todayDate);
			int rs = ps.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * returns the name from the username
	 * @param username
	 */
	public static String getName(String username){
		
		String query = "SELECT * FROM Users WHERE Username = ?";
		Connection conn = DatabaseInfo.getConnection();
		try
		{
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			String name = rs.getString("NameOfUser");
			//double startWeight = rs.getDouble("StartWeight");
			//double goalWeight = rs.getDouble("GoalWeight");
			
			return name;
			
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * Return StartingWeight given the username
	 * @param username
	 * @return
	 */
	public static double getStartWeight(String username){
		
		String query = "SELECT * FROM Users WHERE Username = ?";
		Connection conn = DatabaseInfo.getConnection();
		try
		{
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			rs.next();	
			double startWeight = rs.getDouble("StartWeight");
			//double goalWeight = rs.getDouble("GoalWeight");
			
			return startWeight;
			
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * return GoalWeight given the username
	 * @param username
	 * @return
	 */
	public static double getGoalWeight(String username){
		
		String query = "SELECT * FROM Users WHERE Username = ?";
		Connection conn = DatabaseInfo.getConnection();
		try
		{
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			rs.next();	
			//double startWeight = rs.getDouble("StartWeight");
			double goalWeight = rs.getDouble("GoalWeight");
			
			return goalWeight;
			
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/*
	 * return number of DailyWeights for a user
	 */
	public static int getDailyWeightsSize(String username){
		int count = 0;
		String query = "SELECT * FROM DailyWeights WHERE Username = ?";
		Connection conn = DatabaseInfo.getConnection();
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			boolean hasResults = ps.execute();
			
			while(hasResults){
				ResultSet rs = ps.getResultSet();
				while(rs.next()){
					
					count++;
				}
				
				rs.close();
				hasResults = ps.getMoreResults();
			}
		
			
			
			
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return count;
	}
	
	public static String[] getDailyWeights(String username){
		String[] result = new String[getDailyWeightsSize(username)];
		String query = "SELECT TodayWeight, TodayDate FROM DailyWeights WHERE Username = ?";
		Connection conn = DatabaseInfo.getConnection();
		String weight = new String();
		String date = new String();
		
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			boolean hasResults = ps.execute();
			int i = 0;
			
			while(hasResults){
				ResultSet rs = ps.getResultSet();
				while(rs.next()){
					weight = rs.getString("TodayWeight");
					date = rs.getString("TodayDate");
					result[i] = date + ": " + weight + "\n";
					i++;
				}
				
				rs.close();
				hasResults = ps.getMoreResults();
			}
		
			
			
			
		}
		catch (SQLException e)
		{
			System.out.println("SQLException: NOT FOUND");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}
	
	

}
