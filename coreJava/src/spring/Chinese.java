package spring;

import interfaces.*;

public class Chinese implements Person
{
	
	public Chinese()
	{
		
	}
	
	

	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}



	@Override
	public void useAxe()
	{
		System.out.println(axe.chop());
		
	}
	
	private Axe axe;
	
}
