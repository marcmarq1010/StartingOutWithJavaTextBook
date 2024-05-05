
public class PhoneBookEntry
{
	private String personName;
	private String phoneNumber;
	
	public PhoneBookEntry(String name, String phoneNumber)
	{
		setPersonName(name);
		setPhoneNumber(phoneNumber);
	}

	public String getPersonName()
	{
		return personName;
	}

	public void setPersonName(String personName)
	{
		this.personName = personName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	
}
