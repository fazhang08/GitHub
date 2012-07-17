package spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener
{

	@Override
	public void onApplicationEvent(ApplicationEvent event)
	{
		if(event instanceof EmailEvent)
		{
			EmailEvent emailEvent = (EmailEvent) event;
			
			System.out.println("The address that need send Email is : " + emailEvent.address);
			
			System.out.println("The text that need send Email is : " + emailEvent.text);
			
		}else
		{
			System.out.println(" The Container itself event : " + event);
			
		}
		
	}

}
