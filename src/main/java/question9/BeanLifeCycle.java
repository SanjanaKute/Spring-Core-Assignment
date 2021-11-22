package question9;

public class BeanLifeCycle 
{
	public void init()
    {
        System.out.println("This is the initializing method");
            
    }
    
    public void destroy()
    {
        System.out.println("This is the destroy method");
           
    }

	@Override
	public String toString() {
		return "BeanLifeCycle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    


}
