package question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("shape.xml");
		
		Circle c1=(Circle) context.getBean("c1");
		context.registerShutdownHook();
		System.out.println(c1);


	}

}
