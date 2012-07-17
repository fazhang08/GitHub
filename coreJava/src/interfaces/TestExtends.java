package interfaces;

public class TestExtends
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Father f = new Son();
		f = new Son();

	}
	
	


}

class Father
{
	public Father(String sName)
	{
		System.out.println("This is Father constructor .");
	}
}

class Son extends Father
{
	public Son()
	{
		//super(sName);
		System.out.println("This is Son construstor .");
	}
}