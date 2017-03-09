
public class PassFailExam extends GradedActivity{

		
		private static final int MINIMUM_PASSING_SCORE = 70;
		private static final int MAX_QUESTIONS = 10;

		
		public PassFailExam(int questionsCorrect)
		{
			super(questionsCorrect, MAX_QUESTIONS);
		}
		
		public boolean pass()
		{
			if((super.getScore()/super.getMaxScore() * 100) > MINIMUM_PASSING_SCORE)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}


