package daythree.oops.inheritance;

public class MainDemo {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.setEyeColor("Black");
		ch.setChildName("Varun");
		ch.setName("Mr X");
		
		
		System.out.println(ch);
		System.out.println(ch.getEyeColor());
		System.out.println(ch.getName());
		
		Parent parent = new Parent();
		parent.setEyeColor("Brown");
		parent.setName("Mr Y");
		
		System.out.println(parent);
		
		ch.setEyeColor(parent.getEyeColor());
		ch.setName(parent.getName());
		
		System.out.println(ch);
		
		
		
	}

}
