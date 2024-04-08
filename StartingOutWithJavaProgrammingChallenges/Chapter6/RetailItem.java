
public class RetailItem
{
	private String description;		// holds a brief description of the item
	private int unitsOnHand;		// holds the number of units currently in inventory
	private double price;			// holds the item’s retail price
	
	public RetailItem()
	{
		
	}
	
	public RetailItem(String description, int unitsOnHand, double price)
	{
		setDescription(description);
		setUnitsOnHand(unitsOnHand);
		setPrice(price);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	public void setUnitsOnHand(int unitsOnHand)
	{
		this.unitsOnHand = unitsOnHand;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
}
