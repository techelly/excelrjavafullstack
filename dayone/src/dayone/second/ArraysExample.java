package dayone.second;

public class ArraysExample {
	public static void main(String[] args) {
		
		int [] x; //declares an array of integers
		x=new int[5]; //allocates memory for 5 integers
		
		int[] y = {10,20,30};
		
		//int[] numbers = {10,"Hello",20};
		int lengthOfArrayY= y.length;
		System.out.println(lengthOfArrayY);
		
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(y[0]);
		
		x[0]=1;
		x[2]=11;
		x[1]=10;
		x[3]=5;
		x[4]=8;
		System.out.println(x);
		//x[5]=8;
		
		int m[] = new int[5];
		m[0]=2;
		m[4]=3;
		System.out.println("Length of the m is --- "+m.length);
		m=new int[10];
		m[1]=6;
		m[9]=8;
		System.out.println("Length of the m is --- "+m.length);
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m[3]);
		System.out.println(m[4]);
		System.out.println(m[5]);
		System.out.println(m[6]);
		System.out.println(m[7]);
		System.out.println(m[8]);
		System.out.println(m[9]);
		
		int[] p = new int[4] ; //declaration of an array p of dimension or size 4
		p[0]=1;//assigning value to an array index position 0
		p[3]=2;
		//Intializing an array a with values {1,2,3,4}
		//int[] a = new int[4] {1,2,3,4};
		int[] a = new int[] {1,2,3,4};
	}
}
