
public class EssayLauncher {

	public static void main(String[] args) {
		
		Essay e1 = new Essay(0, 0);
		
		
		e1.setGrammar(25);
		e1.setSpelling(20);
		e1.setCorrectLength(15);
		e1.setContent(22);
		
		e1.setScore(e1.getTotal());
		
		
		System.out.println(e1.toString() + "\nScore " + e1.getTotal() + "\nGrade: " + e1.getGrade());
	}

}
