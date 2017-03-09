
public class TestScoreLauncher {

	public static void main(String[] args) throws InvalidTestScore {
		
		//array for test scores
		double[] scoresArray = {54.0, -85.0, 97.0, 60.0};
		
		//object passes through array
		TestScores t1 = new TestScores(scoresArray);
		
		//displays average
		System.out.println("Average: " + t1.getAvg());
		
	}

}
