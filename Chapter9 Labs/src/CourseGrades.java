import java.text.DecimalFormat;

public class CourseGrades implements Analyzable{

		//holds array
		private GradedActivity[] grades = new GradedActivity[4];
		
		//setters
		public void setLab(int index, GradedActivity lab){grades[index] = lab;}
		
		public void setPassFailExam(int index, PassFailExam passFailExam){grades[index] = passFailExam;}
		
		public void setEssay(int index, GradedActivity essay){grades[index] = essay;}
		
		public void setFinalExam(int index, FinalExam finalExam){grades[index] = finalExam;}
		
		//average override
		@Override
		public double getAverage() {
			
			DecimalFormat decimalFormat = new DecimalFormat("###.##");
			double sum = 0;
			int count = 0;
			
			for(GradedActivity assignment : grades)
			{
				sum += assignment.getPercentage();
				count++;
			}
			
			return Double.parseDouble(decimalFormat.format(sum/count));
		}
		
		//gets the highest value
		@Override
		public GradedActivity getHighest() {
			
			GradedActivity highest = grades[0];
			
			for(GradedActivity assignment : grades)
			{
				if(assignment.getPercentage() > highest.getPercentage())
				{
					highest = assignment;
				}
			}
			
			return highest;
		}
		
		//gets the lowest value
		@Override
		public GradedActivity getLowest() {
			
			GradedActivity lowest = grades[0];
			
			for(GradedActivity assignment : grades)
			{
				if(assignment.getPercentage() < lowest.getPercentage())
				{
					lowest = assignment;
				}
			}
			
			return lowest;
		}
		
		
		//output tostring method that also calcs letter grade
		public String toString()
		{
			StringBuffer stringBuffer = new StringBuffer();
			DecimalFormat decimalFormat = new DecimalFormat("###.##");
			int index = 0;
			double percentage;
			String grade = "\0";
			
			for(GradedActivity assignment : grades)
			{
				percentage = assignment.getPercentage();
				
				if(percentage >= 90)
					grade = "A";
				else if(percentage >= 80)
					grade = "B";
				else if(percentage >= 70)
					grade = "C";
				else if(percentage >= 60)
					grade = "D";
				else
					grade = "F";
				
				
				
				stringBuffer.append("Grades " + index + ":" + "\n" +
						"---------" + "\n" +
						"score: " + assignment.getScore() + "/" + assignment.getMaxScore() + "\n" +
						"percentage: " + decimalFormat.format(percentage) + "%" + "\n" +
						"grade: " + grade + "\n" + "\n");
				
				index++;
			}
			
			return stringBuffer.toString();
		}

		
	}


