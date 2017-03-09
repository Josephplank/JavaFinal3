import java.text.DecimalFormat;

public class ProductionWorker extends Employee{

	private int shift;
	private double hourlyPayRate;
	
	
	
	public ProductionWorker() {
		
	}
	
	public String toString()
	{
		String str;
		
		DecimalFormat fmt = new DecimalFormat("$#,##0.00");
		
		str = super.toString() + "\nShift: " + getShift() + "\nHourly Pay: " + fmt.format(getHourlyPayRate()) + "\n";
		
		return str;
	}
	
	public int getShift() {return shift;}
	public void setShift(int shift) {this.shift = shift;}

	public double getHourlyPayRate() {return hourlyPayRate;}
	public void setHourlyPayRate(double hourlyPayRate) {this.hourlyPayRate = hourlyPayRate;}

	

}
