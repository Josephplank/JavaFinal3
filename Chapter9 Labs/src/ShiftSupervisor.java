import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee{

	private double annualSalary;
	private double bonus;
	
	public ShiftSupervisor() {
	
	}

	public String toString()
	{
		String str;
		DecimalFormat fmt = new DecimalFormat("$#,##0.00"); 
		str = super.toString() + "\nAnnual Salary: " + fmt.format(getAnnualSalary()) + "\nBonus: " + fmt.format(getBonus()) + "\n";
		
		return str;
	}
	
	public double getAnnualSalary() {return annualSalary;}
	public void setAnnualSalary(double annualSalary) {this.annualSalary = annualSalary;}

	public double getBonus() {return bonus;}
	public void setBonus(double bonus) {this.bonus = bonus;}

}
