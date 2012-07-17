package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import beans.Person;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(   
        "src/applicationContext.xml");  
		
		Animal animal = (Animal) context.getBean("animal");   
		animal.say();   

		Person person = (Person) context.getBean("person");
		
		person.printInfo();
		
		
		interfaces.Person p = (interfaces.Person) context.getBean("chinese");
		p.useAxe();
		
		
		EmailEvent ee = new EmailEvent("hello","spring_tesx@163.com","this is a test");
		
		context.publishEvent(ee);
		
		
		
	}

}
