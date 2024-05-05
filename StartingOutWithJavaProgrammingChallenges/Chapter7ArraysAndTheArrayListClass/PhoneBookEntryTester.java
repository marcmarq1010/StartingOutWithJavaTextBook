import java.util.ArrayList;

public class PhoneBookEntryTester
{

	public static void main(String[] args)
	{
		ArrayList<PhoneBookEntry> PhoneBook = new ArrayList<PhoneBookEntry>();
		
		PhoneBookEntry entry1 = new PhoneBookEntry("John Doe", "(323) 555-5555");
		PhoneBook.add(entry1);
		
		PhoneBookEntry entry2 = new PhoneBookEntry("Jane Doe", "(323) 555-5555");
		PhoneBook.add(entry2);

		PhoneBookEntry entry3 = new PhoneBookEntry("Johnny Blue", "(323) 555-5555");
		PhoneBook.add(entry3);

		PhoneBookEntry entry4 = new PhoneBookEntry("Janey Blue", "(323) 555-5555");
		PhoneBook.add(entry4);

		PhoneBookEntry entry5 = new PhoneBookEntry("Red Harlow", "(323) 555-5555");
		PhoneBook.add(entry5);
		
		displayPhoneBook(PhoneBook);
	}
	
	public static void displayPhoneBook(ArrayList<PhoneBookEntry> PhoneBook)
	{
		for(int i = 0; i < PhoneBook.size(); i ++)
		{
			System.out.printf("Entry Number %d:\n", i + 1);
			
			System.out.printf("\tName: %s\n", PhoneBook.get(i).getPersonName());
			
			System.out.printf("\tPhone Number: %s\n", PhoneBook.get(i).getPhoneNumber());
			
			System.out.println();
		}
	}
	
}

/*
	Write a program that creates at least five PhoneBookEntry objects and stores them in an ArrayList.
	Use a loop to display the contents of each object in the ArrayList.
*/