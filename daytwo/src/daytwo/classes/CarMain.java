package daytwo.classes;

public class CarMain {

	public static void main(String[] args) {
		//By calling or invoking the Car() constructor  using new we are 
		//creating an object which is referred by a reference variable named as lowercase car
		Car car = new Car();
		System.out.println("Car --- "+car);
		car.setBrand("Honda");
		car.setFuelType("Petrol");
		car.setModels("BRV");
		car.setPrice(15555.50);
		car.setTransmission("Manual");
		car.setYearOfMfg(2020);
		System.out.println("After setting the values Car --- "+car);
		System.out.println("After setting the values Car model--- "+car.getModels());
		
		
				

	}

}
