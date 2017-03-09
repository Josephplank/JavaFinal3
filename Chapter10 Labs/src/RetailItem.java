
public class RetailItem extends NegativeNumber{
	private String description;//hold description
	private int unitsOnHand;//holds units on hand
	private double price;//holds price
	
	//constructor accepting variables
	
	public RetailItem(String itemDescription, int itemUnitsOnHand, double itemPrice) {
		this.description = itemDescription;
		this.unitsOnHand = itemUnitsOnHand;
		this.price = itemPrice;
		
	}
	
	//getters and setters
	public void setDescription(String d){this.description = d;}
	
	public void setUnits(int u){this.unitsOnHand = u;}
	
	public void setPrice(double p){this.price = p;}
	
	public String getDescription(){return description;}
	
	//if units on hand is a negative
	public int getUnitsOnHand() throws NegativeNumber
	{
		if(unitsOnHand < 0)
			throw new NegativeNumber();
		return unitsOnHand;
	}
	
	//if price is negative
	public double getPrice() throws NegativeNumber
	{
		if(price < 0)
			throw new NegativeNumber();
		return price;
	}

}
