package question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Demo d1=(Demo) context.getBean("demo");
        d1.show();
        
	}

}
