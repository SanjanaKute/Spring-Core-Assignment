package question5;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
@Named
public class EmployeeService {
	
	//@Autowired
	@Inject
	Employee employee;
	public void save()
	{
		System.out.println("Employee Service method");
		employee.save();
	}
}
