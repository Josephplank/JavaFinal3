
public class Employee {

	private String name;//holds name
	private String employeeID;//holds id 
	private String hireDate;//holds hire date
	
	
	public Employee() {
		
	}
	
	//constructor that accepts name, id and date
	public Employee(String name, String ID, String date) {
		this.name = name;
		this.employeeID = ID;
		this.hireDate = date;
	}
	
	//to string method
	public String toString()
	{
		String str;
		
		str = "Employee name: " + getName() + 
				"\nID#: " + getEmployeeID() + 
				"\nHire Date: " + getHireDate();
		
		return str;
	}
	
	//getters and setters
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getEmployeeID() {return employeeID;}
	public void setEmployeeID(String employeeID) {this.employeeID = employeeID;}

	public String getHireDate() {return hireDate;}
	public void setHireDate(String hireDate) {this.hireDate = hireDate;}

	

}
