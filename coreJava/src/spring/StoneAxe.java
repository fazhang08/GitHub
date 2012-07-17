package spring;

import interfaces.Axe;

public class StoneAxe implements Axe
{

	public StoneAxe()
	{
		
	}
	
	@Override
	public String chop()
	{
		return "石斧头砍材好慢";
	}

}
