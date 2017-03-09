
public class Ship {

	private String name;
	private String year;
	
	
	public Ship() {
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


public String toString()
{
	String str;
	
	str = "The name of the ship is: " + name + "\nYear it was built: " + year;
	
	return str;
}
}
