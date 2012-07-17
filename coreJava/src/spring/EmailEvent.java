package spring;
import org.springframework.context.ApplicationEvent; 

public class EmailEvent extends ApplicationEvent
{

	public EmailEvent(Object source)
	{
		super(source);
		
	}
	
	public EmailEvent(Object source, String address , String text)
	{
		super(source);
		
		this.address = address;
		
		this.text = text;
	}
	
	String address;
	
	String text;
}
