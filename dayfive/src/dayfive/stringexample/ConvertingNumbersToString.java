package dayfive.stringexample;

public class ConvertingNumbersToString {

	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "456";
		String result;
		result = s1 + s2;
		System.out.println(result);
		float a = Float.parseFloat(result);
		System.out.println("a=" + a);

		float b = Float.parseFloat(s2);
		System.out.println("b=" + b);
		float res2 = a + b;
		System.out.println(res2);

		Float fNum1 = Float.valueOf(s1);
		Float fNum2 = Float.valueOf(s2);
		System.out.println(fNum1 + fNum2);

		int c = Integer.valueOf(s1);
		System.out.println("c=" + c);
		int d = Integer.valueOf(s2);
		System.out.println("d=" + d);

		int res3 = c + d;
		System.out.println(res3);

		int x = Integer.parseInt(s1);
		System.out.println("x=" + x);
		int y = Integer.parseInt(s2);
		System.out.println("y=" + y);
		int res4 = x + y;
		System.out.println("res4=" + res4);
	}

}
