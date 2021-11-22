package question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanlife.xml");
		Restruarants restro=(Restruarants) context.getBean("restruarants");
		restro.greet();
		context.registerShutdownHook();
		
		//BeanLifeCycle b=(BeanLifeCycle)context.getBean("lifecycle");
	}

}
