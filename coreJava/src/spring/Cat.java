package spring;

public class Cat implements Animal 
{

	@Override
	public void say() 
	{
		System.out.println("I am " + name + "!");

	}

	public void setName(String name) 
	{
		  this.name = name;
    }
	
	private String name;
}
