
public class TeamLeader extends ProductionWorker{

	
	private double monthlyBonus;//holds monthly bonus
	private double reqTrainingHours;//hold required training hours
	private double completedHours;//holds hours completed
	
	
	//getters and setters
	public double getMonthlyBonus() {return monthlyBonus;}
	public void setMonthlyBonus(double monthlyBonus) {this.monthlyBonus = monthlyBonus;}

	public double getReqTrainingHours() {return reqTrainingHours;}
	public void setReqTrainingHours(double reqTrainingHours) {this.reqTrainingHours = reqTrainingHours;}

	public double getCompletedHours() {return completedHours;}
	public void setCompletedHours(double completedHours) {this.completedHours = completedHours;}

	public TeamLeader() {
		
	}
	
	//to string method
	public String toString()
	{
		String str;
		
		str = "\n" + super.toString() + "Monthly Bonus: " + getMonthlyBonus() + "\nRequired Training Hours:  " + getReqTrainingHours() + "\nCompleted Hours: " + getCompletedHours();
		
		return str;
	}

}
