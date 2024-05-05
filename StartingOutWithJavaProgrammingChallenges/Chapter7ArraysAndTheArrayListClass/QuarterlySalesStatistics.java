import java.util.Scanner;

public class QuarterlySalesStatistics
{

	public static void main(String[] args)
	{		
		final int Divisions = 2;
		final int Quarters = 4;
		
		int[][] companySales = new int[Divisions][Quarters];
		
		enterSales(companySales, Divisions, Quarters);
		
		displaySalesFiguresByDivision(companySales, Divisions, Quarters);
		
		divisionIncreaseOrDecrease(companySales, Divisions, Quarters);
		
		totalSalesForTheQuarter(companySales, Divisions, Quarters);
		
		companyIncreaseOrDecrease(companySales, Divisions, Quarters);
		
		averageSalesPerQuarter(companySales, Divisions, Quarters);
		
		HighestSalesPerQuarter(companySales, Divisions, Quarters);
		
	}
	
	public static void enterSales(int[][] companySales, int divisions, int quarters)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the following sales data:\n");
		
		System.out.printf("-------------------------------\n");
		
		for(int i = 0; i < divisions; i++)
		{
			for(int j = 0; j < quarters; j++)
			{
				System.out.printf("Division %d, Quarter %d:\n", i + 1, j + 1);
				companySales[i][j] = keyboard.nextInt();
				
				while(companySales[i][j] < 0)
				{
					System.out.printf("Input Validation: Do not enter negative numbers for sales figures.\n");
					
					System.out.printf("Division %d, Quarter %d:\n", i + 1, j + 1);
					companySales[i][j] = keyboard.nextInt();
				}
			}
			
			System.out.println();
		}
		
		keyboard.close();
	}
	
	public static void displaySalesFiguresByDivision(int[][] companySales, int divisions, int quarters)
	{
		System.out.printf("A list of the sales figures by division:\n");
		System.out.printf("----------------------------------------\n");

		
		for(int i = 0; i < quarters; i++)
		{
			System.out.printf("Quarter  %d:\n", i + 1);
			
			for(int j = 0; j < divisions; j++)
			{
				System.out.printf("\tDivision %d: %d\n",j + 1, companySales[j][i]);

			}
			
			System.out.println();
		}
	}
	
	public static void divisionIncreaseOrDecrease(int[][] companySales, int divisions, int quarters)
	{
		int incOrDec;
		
		System.out.printf("Each division’s increase or decrease from the previous quarter.\n");
		
		System.out.printf("---------------------------------------------------------------\n");
		
		for(int i = 0; i < divisions; i++)
		{
			for(int j = 1; j < quarters; j++)
			{
				incOrDec = companySales[i][j] - companySales[i][j - 1];
				
				if(incOrDec > 0)
					System.out.printf("The sales for Division %d increased by %d in Quarter %d.\n", i + 1, incOrDec, j + 1);
				
				else if(incOrDec < 0)
					System.out.printf("The sales Division %d decreased by %d in Quarter %d.\n", i, incOrDec, j + 1);
				else
					System.out.printf("The sales stayed the same for Quarter %d.\n", j);
			}
			
			System.out.println();
		}
	}
	
	public static void totalSalesForTheQuarter(int[][] companySales, int divisions, int quarters)
	{
		int total = 0;
		
		System.out.printf("The total sales for each quarter.\n");
		
		System.out.printf("---------------------------------\n");
		
		for(int i = 0; i < quarters; i++)
		{
			for(int j = 0; j < divisions; j++)
			{
				total += companySales[j][i];				
			}

			System.out.printf("Quarter %d total sales: %d\n", i + 1, total);
			
			total = 0;
			
			System.out.println();
		}
	}
	
	public static void companyIncreaseOrDecrease(int[][] companySales, int divisions, int quarters)
	{
		int total1 = 0, total2 = 0;
		
		for(int i = 0; i < 1; i++)
		{
			for(int j = 0; j < divisions; j++)
			{
				total1 += companySales[j][i];				
			}
		}

		System.out.printf("The company’s increase or decrease from the previous quarter.\n");
		
		System.out.printf("-------------------------------------------------------------\n");
		
		for(int i = 1; i < quarters; i++)
		{
			for(int j = 0; j < divisions; j++)
			{
				total2 += companySales[j][i];				
			}
			
			if(total2 > total1)
				System.out.printf("The sales for the company increased by %d in Quarter %d.\n", total2 - total1, i + 1);
			else if(total2 < total1)
				System.out.printf("The sales for the company decreased by %d in Quarter %d.\n", total1 - total2, i + 1);
			else
				System.out.printf("The sales stayed the same for Quarter %d.\n", i);
			
			total1 = total2;
			
			System.out.println();
		}
	}
	
	public static void averageSalesPerQuarter(int[][] companySales, int divisions, int quarters)
	{
		double average = 0.00;
		int total = 0;
		
		System.out.printf("The average sales for all divisions per quarter.\n");
		
		System.out.printf("-----------------------------------------------\n");
		
		for(int i = 0; i < quarters; i++)
		{
			for(int j = 0; j < divisions; j++)
			{
				total += companySales[j][i];				
			}
			
			average = (total + 0.00) / divisions;
			
			System.out.printf("The average sales for all divisions in Quarter %d: %.2f\n", i + 1, average);
			
			total = 0;
		}
		
		System.out.println();
	}
	
	public static void HighestSalesPerQuarter(int[][] companySales, int divisions, int quarters)
	{
		System.out.printf("The division with the highest sales for that quarter.\n");
		
		System.out.printf("-----------------------------------------------------\n");
				
		for(int i = 0; i < quarters; i ++)
		{
			int highestSale = companySales[0][i];
			int highestDivision = 1;

			for(int j = 0; j < divisions; j++)
			{
				int sale = companySales[j][i];
				
				if(sale > highestSale)
				{
					highestSale = sale;
					highestDivision = j + 1;
				}
			}
			
			System.out.printf("Quarter %d, highest division: %d\n", i + 1, highestDivision);
		}

	}

}
