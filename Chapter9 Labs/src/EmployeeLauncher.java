import java.util.*;

public class EmployeeLauncher {

	public static void main(String[] args) {
		
		
		Scanner k = new Scanner(System.in);
		
		ProductionWorker p1 = new ProductionWorker();
		ShiftSupervisor s1 = new ShiftSupervisor();
		TeamLeader t1 = new TeamLeader();
		
		p1.setName("Joseph Plank (Worker)");
		p1.setEmployeeID("123-M");
		p1.setHireDate("10/23/2017");
		p1.setShift(1);
		p1.setHourlyPayRate(50);
		
		s1.setName("Brett Hill (Shift Supervisor)");
		s1.setEmployeeID("456-B");
		s1.setHireDate("05/04/2016");
		s1.setAnnualSalary(50000);
		s1.setBonus(2000);
		
		t1.setName("Christian Beckerle (Team Leader)");
		t1.setEmployeeID("789-F");
		t1.setHireDate("02/04/2014");
		t1.setShift(1);
		t1.setHourlyPayRate(8.50);
		t1.setMonthlyBonus(50);
		t1.setReqTrainingHours(20);
		t1.setCompletedHours(12);
		
		System.out.println(p1.toString());
		System.out.print(s1.toString());
		System.out.println(t1.toString());
		
		

	}

}
