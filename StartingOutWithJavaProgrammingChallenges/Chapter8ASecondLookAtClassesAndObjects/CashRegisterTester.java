
public class CashRegisterTester
{

	public static void main(String[] args)
	{
		testMethod();
	}
	
	public static void testMethod()
	{		
		RetailItem item = new RetailItem("Laptop", 400, 500);
		
		CashRegister register = new CashRegister(item, 12);
		
		System.out.printf("Quantity of items being purchased %d.\n", 12);
		
		System.out.printf("%s\n", register);
				
	}

}

/*
Modify the program to create a file containing a sales receipt.
The program should ask the user for the quantity of items being purchased,
and then generate a file with contents similar to the following:

SALES RECEIPT
Unit Price: $10.00
Quantity: 5
Subtotal: $50.00
Sales Tax: $ 3.00
Total: $53.00
*/