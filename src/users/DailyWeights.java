package users;

public class DailyWeights {
	
	private double currentWeight;
	private String day;
	
	public DailyWeights(double currentWeight) {
		this.currentWeight = currentWeight;
		this.day = Dates.getDate();
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
}
