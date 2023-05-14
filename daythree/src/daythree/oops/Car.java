package daythree.oops;

public class Car {
	private String color;
	private Double weight;
	private Integer speed;
	private String model;

	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param color
	 * @param weight
	 * @param speed
	 * @param model
	 */
	public Car(String color, Double weight, Integer speed, String model) {
		this.color = color;
		this.weight = weight;
		this.speed = speed;
		this.model = model;
	}

	public void startcar() {
		System.out.println("Start the car");
	}

	public void changeGear() {
		System.out.println("Change the gear");
	}

	public void slowDown() {
		System.out.println("Slow down the car");
	}

	public void brake() {
		System.out.println("Apply the brake");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", weight=" + weight + ", speed=" + speed + ", model=" + model + "]";
	}

}
