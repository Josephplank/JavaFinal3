import java.util.Scanner;

public class MonthLauncher extends NegativeNumber{

	public static void main(String[] args) throws NegativeNumber {

		Scanner keyboard = new Scanner(System.in);
		
		
		Month p1 = new Month(10);
		Month p2 = new Month("January");
		
	
		
		
		if(p1.getMonthNumber() < 1 || p1.getMonthNumber() > 12){
			throw new NegativeNumber();
		}else{
			System.out.println("For the value 10, it will print out " + p1.toString());
			System.out.println("For the value January, it will print out " + p2.toString());
			
		}
		

		
	}

	
}
