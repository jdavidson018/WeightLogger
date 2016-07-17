package users;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Users jack = new Users();
		
		jack = ProgramInteraction.createNewUser();
		jack.setGoalWeight(100);
		ProgramInteraction.displayUserInformation(jack);

	}

}
