package daytwo.arrays;

public class TwoDimensionArrays {

	public static void main(String[] args) {
	    //initialize number of rows
		int [] [] x = new int [3][];
	    //define number of columns in each row
	    x[0]= new int[3];
	    x[1]= new int[2];
	    x[2]= new int[5];
	    
	    for(int i=0; i<x.length;i++) {//to loop or access row
	    	for(int j=0;j<x[i].length;j++) {//to loop or access column
	    		x[i][j]=i;
	    		System.out.println(x[i][j]);
	    	}
	    	System.out.println();
	    }

	}

}
