
public class CashRegister
{
	private RetailItem item;
	private int quantity;
	
	public CashRegister(RetailItem item, int quantity)
	{
		this.item = new RetailItem(item);
		setQuantity(quantity);
	}
	
	public double getSubtotal()
	{
		return quantity * item.getPrice();
	}
	
	public double getTax()
	{
		double taxRate = 0.06;
		
		return taxRate * getSubtotal();
	}
	
	public double getTotal()
	{
		return getTax() + getSubtotal();
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public String toString()
	{	
		String sale = String.format("%s\n%s $%,.2f\n%s %d\n%s $%,.2f\n%s $%,.2f\n%s $%,.2f\n"
									, "SALES RECEIPT"
									, "Unit Price:", item.getPrice()
									, "Quantity:", getQuantity()
									, "Subtotal:", getSubtotal()
									, "Sales Tax:", getTax()
									, "Total: ", getTotal());

		return 	sale;
	}
	
}