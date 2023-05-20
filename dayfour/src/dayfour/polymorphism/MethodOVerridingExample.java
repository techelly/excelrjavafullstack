package dayfour.polymorphism;

public class MethodOVerridingExample {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Animal a1 = new Animal();

		d1.eat();
		a1.eat();
		System.out.println("***********************************************");
		//eat method is already overridden inside Dog class
		Animal animal = new Dog();//creating an object of Dog class and referred by variable animal of type Animal
		animal.eat();
	}

}
