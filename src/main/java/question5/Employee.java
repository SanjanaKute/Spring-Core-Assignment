package question5;

import javax.inject.Named;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Named
public class Employee {
	
	

	public void save() {
		System.out.println("save method");
		
	}
	
}
