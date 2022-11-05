package java_session_30_oct;

public class One_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration
		int[] a;// most popular form Array
		int[] a1;
		int a2[];
		int[] a3;

		int[] a4, b4;// both are 1 _D array
		int[] a5, b5;// both are 1D Array
		int a6[], b6;// a6 is 1_D array but b6 is just an int variable

		// Creation of Array
		int[] a7 = new int[3];
		int[] a8 = new int[0];
		System.out.println(a8.length);

		// int[] a9 = new int[-1];NegativeArraySizeException: -1(Array can not handle negative values)
		// System.out.println(a9.length);
		
		//Initialization(true)
		
		int[]a10 = new int[4];
		 
	   a10 [0] = 120;
	   a10 [1] =  121;
	   a10 [2] = 122;
	   a10 [3] = 123;
	   System.out.println(a10.length);
	  //this initialization is false because of the size we have 5 values instead of 4 and array index start from 0 
/*	int[]a11 = new int [4];
	a11[0] = 100;
	a11[1] = 101;
	a11[2] = 102;
	a11[3]= 103;
	a11[4] = 104;
	System.out.println(a11.length*///Index 4 out of bounds for length 4
	
	//Array can be initialize by this method also
	
	    int[]a13 = {12,13,14,15,16,17};//2end method to initialize array
	    System.out.println(a13.length);
	     int []a14 = new int[] {1,2,3,4,5,6,7,8,9};
	     System.out.println(a14.length);
	     
	     int[]a15 = {101,102,103,104,105};
	     System.out.println(a15.length);
	     int[]a16 = {11,12,13,14};
	     System.out.println(a16.length);
	     
	     int[]a17 = new int []{12,13,14};
	     System.out.println(a17.length);
	     
	     int[]a18 = new int[]{5,6,7,8,9};
	     System.out.println(a18.length);
	     
	     int[]a19 = new int[] {1,2,3,4,5,6,7,8,9};
	     System.out.println(a19.length);
	     
	     int[]a20 = new int[]{34,35,36,37};
	     System.out.println(a20.length);
	     
	     int[]a21 = new int[] {8,9,10,11};
	     System.out.println(a21.length);
	     
	     //Retrieve
	     //how to print all values of a22
	     
	     int[]a22 = {120,121,122,123,123,125};
	     for(int i = 0; i<a22.length ; i++) {
	     System.out.println(a22 [i]);
	     
	     }
	     int[]a23 = new int[] {10,20,30,40,50};
	     for(int j = 0; j<a23.length; j++) {
	    	 System.out.println(a23[j]);
	     }
	     int[]a24 = {200,300,400,500,600,700};
	     for(int l = 0; l<a24.length; l++) {
	    	 System.out.print(a24[l] + "  ");
	    	 
	    	 System.out.println();
	    	 System.out.println("--------------------------------");
	     }
	    int[]a26 = new int[] {11,12,13,14};
	    for(int k = 0; k<a26.length; k++ ) {
	    System.out.print(a26[k] + " ");
	    }
	     
	     
	    
	   
	    
	    	 	
		
	}

}
