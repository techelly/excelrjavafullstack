package daythree.oops;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("Red");
		car.setModel("C90");
		car.setSpeed(60);
		car.setWeight(2455.50);
		
		System.out.println(car);
		car.startcar();
		car.changeGear();
		car.slowDown();
		car.brake();

	}

}
