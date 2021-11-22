package question10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Demo implements ApplicationContextAware
{
	private ApplicationContext ap;
	public void show()
	{
		System.out.println("Show");
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ap=ap;
	}
	

}
