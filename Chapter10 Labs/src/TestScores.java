
public class TestScores {

	double total;//holds value for total
	double avg;//holds value for avg
	
	public TestScores(double[] array) throws InvalidTestScore {
		

		//for loop to iterate through test scores
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < 0 || array[i] > 100)
				throw new InvalidTestScore();
			total += array[i];
		}
		
	}

	//method to calculate average
	public double getAvg()
	{
		double avg = total / 4;
		return avg;
	}
	
}
