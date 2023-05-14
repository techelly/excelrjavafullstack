package daythree.oops.inheritance;


/**
 * 
 * @author UD SYSTEMS
 *Child class is a subclass which is inheriting(or extending) the Parent class or super class Parent
 */
public class Child extends Parent {
	
	
	private String childName;

	/**
	 * 
	 */
	public Child() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param childName
	 */
	public Child(String childName) {
		this.childName = childName;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	@Override
	public String toString() {
		return "Child [childName=" + childName + "]";
	}
	
}
