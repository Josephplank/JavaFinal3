
public class Payroll {

	//Variables
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double hoursWorked;
	
	//constructor
	public Payroll(String yourName,int youridNumber, double yourHourlyPayRate, double yourHoursWorked) {
		this.name = yourName;
		this. idNumber = youridNumber;
		this.hourlyPayRate = yourHourlyPayRate;
		this.hoursWorked = yourHoursWorked;
	}
	//gets name
	public String getName() {return name;}
	//gets id number
	public int getidNumber() {
		return idNumber;}
	//gets hourly pay rate
	public double getHourlyPayRate(){return hourlyPayRate;}
	//gets hours worked
	public double getHoursWorked() {return hoursWorked;}
	//gets gross pay
	public double getGrossPay(){return hourlyPayRate * hoursWorked;}
	

}

