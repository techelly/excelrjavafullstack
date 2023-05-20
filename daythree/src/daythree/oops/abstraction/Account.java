package daythree.oops.abstraction;

/**
 * 
 * @author UD SYSTEMS
 * 
 * abstract is a reserved keyword also known as non-access modifier and it is used for classes and methods
 * 1.Abstract class is a restricted class that cannot be used to create an instance
 * 2. Abstract method can only be used in an abstract class, and it does not have a body.
 * 		The body will be provided by the subclass(inherited from)
 * 
 * 
 */
public abstract class Account {
			
	private Integer x;
	//abstract method
	public abstract void accountInfo();
	
	//abstract method
	public abstract void accountInfo2();
	
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	
	
	
}
