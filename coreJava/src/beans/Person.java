package beans;

public class Person 
{
	
	
	public void setsName(String sName) 
	{
		this.sName = sName;
	}
	
	public void printInfo()
	{
		System.out.println("The Person Name is : " + sName);
	}
	private String sName;
}
