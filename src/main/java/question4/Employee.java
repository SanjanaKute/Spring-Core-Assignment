package question4;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	
	private String address;

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Employee(String address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
