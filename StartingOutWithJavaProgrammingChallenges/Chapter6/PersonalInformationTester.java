public class PersonalInformationTester
{
	
	public static void main(String[] args)
	{
		
		PersonalInformation me = new PersonalInformation();
		PersonalInformation friend1 = new PersonalInformation();
		PersonalInformation friend2 = new PersonalInformation();
		
		me.setName("Marcos Marquez");
		me.setAge(28);
		me.setPhoneNumber("5555555555");
		me.setAddress("Long Beach");
		
		friend1.setName(null);
		friend1.setAge(0);
		friend1.setPhoneNumber(null);
		friend1.setAddress(null);
		
		friend2.setName(null);
		friend2.setAge(0);
		friend2.setPhoneNumber(null);
		friend2.setAddress(null);

	}
	
}

/*
Demonstrate the class by writing a program that creates three instances of it.
One instance should hold your information, and the other two should hold your friends’ or family members’ information.
*/