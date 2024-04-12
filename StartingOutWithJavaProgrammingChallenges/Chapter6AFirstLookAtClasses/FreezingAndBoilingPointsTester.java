import java.util.Scanner;

public class FreezingAndBoilingPointsTester
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		FreezingAndBoilingPoints point = new FreezingAndBoilingPoints();
		
		System.out.printf("Enter a temperature:\n");
		double temp = keyboard.nextDouble();
		
		point.setTemperature(temp);
		
		if(point.isEthylBoiling())
			displaySubstancesIfBoil(temp, "EthylAlcohol");
		
		if(point.isEthylFreezing())
			displaySubstancesIfFreeze(temp, "EthylAlcohol");
		
		if(point.isOxygenBoiling())
			displaySubstancesIfBoil(temp, "Oxygen");	
		
		if(point.isOxygenFreezing())
			displaySubstancesIfFreeze(temp, "Oxygen");
			
		if(point.isWaterBoiling())
			displaySubstancesIfBoil(temp, "Water");
		
		if(point.isWaterFreezing())
			displaySubstancesIfFreeze(temp, "Water");

		keyboard.close();
	}
	
	public static void displaySubstancesIfFreeze(double temp, String substance)
	{
		System.out.printf("At %.2f, %s will freeze.\n", temp, substance);
	}
	
	public static void displaySubstancesIfBoil(double temp, String substance)
	{
		System.out.printf("At %.2f, %s will boil.\n", temp, substance);
	}

}

/*

The following table lists the freezing and boiling points of several substances.

Substance		Freezing Point		Boiling Point
EthylAlcohol	–173				172
Oxygen			-362				-306
Water			32					212

*/