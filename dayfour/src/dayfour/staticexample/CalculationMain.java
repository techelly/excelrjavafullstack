package dayfour.staticexample;

public class CalculationMain {

	public static void main(String[] args) {
		Calculation calc = new Calculation();
		Calculation calc1 = new Calculation();
		
		System.out.println(calc.areaOfCircle(Calculation.side));
		System.out.println(calc.areaOfCircle(2.5));
		calc1.areaOfRectangle(4, (Calculation.side).intValue());

	}

}
