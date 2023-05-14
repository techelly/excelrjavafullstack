package daythree.oops.inheritance;

public class Parent {
	private String name;
	private String eyeColor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	/**
	 * 
	 */
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param eyeColor
	 */
	public Parent(String name, String eyeColor) {
		this.name = name;
		this.eyeColor = eyeColor;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", eyeColor=" + eyeColor + "]";
	}
	
	
	
}
