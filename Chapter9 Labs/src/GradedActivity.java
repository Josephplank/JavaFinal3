import java.text.DecimalFormat;

public class GradedActivity {

	
	private double score; //holds score
	private double maxScore;//holds max score
	
	
	//constructor that accepts the score and max score
	public GradedActivity(double score, double maxScore)
	{
		setScore(score);
		setMaxScore(maxScore);
	}

	public double getMaxScore(){return maxScore;}

	//gets the percentage of score and max score
	public double getPercentage(){
		
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		
		
		double percentage = getScore();
		percentage /= getMaxScore();
		percentage *= 100;
		
		return Double.parseDouble(decimalFormat.format(percentage));
	}

	//getters and setters
	public double getScore(){return score;}
	
	public void setMaxScore(double maxScore){this.maxScore = maxScore;}

	public void setScore(double d){this.score = d;}
	
	//gets letter grade
	public char getGrade()
	{
		char letterGrade;
		
		if(score >= 90)
			letterGrade = 'A';
		else if(score >= 80)
			letterGrade = 'B';
		else if(score >= 70)
			letterGrade = 'C';
		else if(score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		return letterGrade;
		
	}
	
}
