package question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("addresses.xml");
		/*
		 * Customer c=(Customer)context.getBean("customer"); c.display2();
		 */
		Address a=(Address)context.getBean("address"); 
	    a.display();

		    


	}

}
