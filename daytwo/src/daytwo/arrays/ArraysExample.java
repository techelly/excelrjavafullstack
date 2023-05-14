package daytwo.arrays;

public class ArraysExample {
/**
	public static void main(String[] args) {
		//creates and initializes an array of integers
		int [] source = {100,200,300};
	}
*/
	public static void main(String[] args) {
		//creates and initializes an array of integers
		int [] source = {100,200,300};
		//creates and initializes an array with 3 element
		int [] dest = new int[3];
		
		// copying an elements from source to dest array
		System.arraycopy(source, 0, dest, 0, source.length);
		for(int i=0;i<dest.length;i++){
			System.out.println("Elemetn at index  "+ i + " : "+dest[i]) ;
		}
		System.out.println("***************************************");
		System.out.println("Destination array elements are :- "+dest[0]+" : "+dest[1]+" : "+dest[2]);
	}
}
