import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch
{

	public static void main(String[] args) throws IOException
	{
		ArrayList <String> boysNames = new ArrayList<String>();
		ArrayList <String> girlsNames = new ArrayList<String>();
		
		String boyName = "" ,girlName = "";

		File file = new File(openFile());
		
		Scanner inputFile = new Scanner(file);
		
		populateArray(boysNames, inputFile);
		populateArray(girlsNames, inputFile);
		
		enterNames(boyName, girlName);	
		
		checkArrayForName(boyName, boysNames);
		checkArrayForName(girlName, girlsNames);
	}
	
	public static String openFile() throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the filename: ");
		String filename = keyboard.nextLine();
		
		keyboard.close();
		
		return filename;
	}
	
	public static void populateArray(ArrayList<String> array, Scanner inputFile)
	{
		while(inputFile.hasNext())
			array.add(inputFile.next());
	}
	
	public static void enterNames(String boyName, String girlName)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter the name of a boy.\n");
		boyName = keyboard.next();
		
		System.out.printf("Enter the name of a girl.\n");	
		girlName = keyboard.next();
		
		keyboard.close();
	}
	
	public static boolean checkArrayForName(String name, ArrayList<String> array)
	{
		for(String element : array)
			if(element.equalsIgnoreCase(name))
				return true;
		
		return false;	
	}

}
