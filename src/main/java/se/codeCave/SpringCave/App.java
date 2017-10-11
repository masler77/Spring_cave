package se.codeCave.SpringCave;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    
    Person person = (Person) context.getBean("Person");
    
    Address address = (Address) context.getBean("Address");
    System.out.println(person);
    System.out.println(address);
    	
    	person.speak();
    	
    	
    	
    }
}
