package question8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle //implements InitializingBean, DisposableBean
{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Initializing"); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Destroy method"); }
	 */	
	 @PostConstruct
	  public void start() { 
		  System.out.println("Initializing"); 
		  }
	 @PreDestroy
	   public void end()
	  { 
		   System.out.println("Ending..!!");
		 }
	 

}
