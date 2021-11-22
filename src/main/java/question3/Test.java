package question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Bank.xml");
		BankAccount b=(BankAccount)context.getBean("bank");
		System.out.println(b);


	}

}
