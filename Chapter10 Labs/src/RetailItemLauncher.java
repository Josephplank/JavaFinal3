
public class RetailItemLauncher {
	
public static void main(String[] args) throws NegativeNumber {
	
	
		//objects passing through variables
		RetailItem i1 = new RetailItem("Item #1     Jacket", 12, 59.95);
		RetailItem i2 = new RetailItem("Item #2     Designer Jeans", -40,34.95);
		RetailItem i3 = new RetailItem("Item #3     Shirt", 20,24.95);
		
		//output
		System.out.println("Description\t\t\t  " +"Units On Hand\t\t" + "Price");
		System.out.println("----------------------------------------------------------------");
		System.out.println(i1.getDescription() + "\t\t\t" + i1.getUnitsOnHand() + "\t\t" + i1.getPrice());
		System.out.println(i2.getDescription() + "\t\t" + i2.getUnitsOnHand() + "\t\t" + i2.getPrice());
		System.out.println(i3.getDescription() + "\t\t\t" + i3.getUnitsOnHand() + "\t\t" + i3.getPrice());
		
		
	}
	

}
