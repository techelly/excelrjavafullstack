package daytwo.arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		int rows = 2;
		int columns = 3;
		
		int[][] matrixA= {{2,3,4},{5,2,3}};
		int[][] matrixB= {{-4,5,3},{5,6,3}};
		
		int[][] sum =new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int k=0;k<columns;k++) {
				sum[i][k]=matrixA[i][k]+matrixB[i][k];
			}
		}
		
		//display
		System.out.println("Sum of matrix A and B is :---   ");
		for(int[] row : sum) {// for -each loop  : for each row (element) in a sum
			for(int column : row) {
				System.out.println(column + " ");
			}
		}
		System.out.println("*******************************");
		System.out.println(sum);
	}

}
