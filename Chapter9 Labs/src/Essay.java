
public class Essay extends GradedActivity{

	
	public Essay(double score, double maxScore) {
		super(score, maxScore);
		
	}
	private double grammar;
	private double spelling;
	private double correctLength;
	private double content;
	
	

	
	
	public double getTotal()
	{
		return grammar + spelling + correctLength + content;
	}

	public String toString()
	{
		String str;
		
		str = "Grammar: " + getGrammar() + "\nSpelling: " + getSpelling() +
				"\nCorrect Length: " + getCorrectLength() +
				"\nContent: " + getContent();
		
		return str;
	}
	
	public double getGrammar() {return grammar;}
	public void setGrammar(double grammar) {this.grammar = grammar;}

	public double getSpelling() {return spelling;}
	public void setSpelling(double spelling) {this.spelling = spelling;}

	public double getCorrectLength() {return correctLength;}
	public void setCorrectLength(double correctLength) {this.correctLength = correctLength;}

	public double getContent() {return content;}
	public void setContent(double content) {this.content = content;}

}
