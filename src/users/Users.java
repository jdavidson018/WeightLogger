package users;

public class Users {
	
	private String name;
	private String username;
	private String password;
	private double startWeight;
	private double goalWeight;
	private LinkedList progress;
	
	public Users(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Users(String name, String username, String password, double startWeight, double goalWeight, LinkedList progress) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.startWeight = startWeight;
		this.goalWeight = goalWeight;
		this.progress = progress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getStartWeight() {
		return startWeight;
	}

	public void setStartWeight(double startWeight) {
		this.startWeight = startWeight;
	}

	public double getGoalWeight() {
		return goalWeight;
	}

	public void setGoalWeight(double goalWeight) {
		this.goalWeight = goalWeight;
	}

	public LinkedList getProgress() {
		return progress;
	}

	public void setProgress(LinkedList progress) {
		this.progress = progress;
	}
	
	public static void checkPassword(Users j){
		
	}

}
