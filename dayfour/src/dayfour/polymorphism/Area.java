package dayfour.polymorphism;

public class Area {

	public Integer calculateArea(Integer length, Integer breadth){
		return length * breadth;
	}
	
	public Double calculateArea(Integer radius) {
		return (radius * radius * 3.14);
	}
	private Double calculateArea(Double side,Double height) {
		return 0.5*side*height;
	}
	
	public final Double calculateArea(Double side) {
		return side*side;
	}
	
	
	
}	
