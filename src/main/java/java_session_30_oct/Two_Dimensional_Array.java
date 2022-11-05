package java_session_30_oct;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration
				int[][] a1; // is the most popular Array
				int[][] a2, b2;// both are 2 D array
				int[][] a3, b3[];// a3 is 2-D and b3 is 3-D arrays
				int[][] a4, b4;// a4 is 2-D array and b4 is simple value

				// Creation
				// initialize

				int[][] a5 = new int[2][3];
				a5[0][0] = 101;
				a5[0][1] = 102;
				a5[0][2] = 103;

				a5[1][0] = 104;
				a5[1][1] = 106;
				a5[1][2] = 107;

				int[][] a6 = new int[3][3];
				a6[0][0] = 108;
				a6[0][1] = 109;
				a6[0][2] = 110;

				a6[1][0] = 111;
				a6[1][1] = 112;
				a6[1][2] = 113;

				a6[2][0] = 114;
				a6[2][1] = 115;
				a6[2][2] = 116;

				int[][] a7 = { { 108, 109, 110 }, { 111, 112, 113 }, { 114, 115, 116 } };

				int[][] a8 = { { 101, 102, 103 }, { 104, 105, 106 } };
				int[][] a9 = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },{ 19, 20, 21, 22, 23, 24 } };

				int[][] a10 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };// [3][4]
				int[][] a11 = new int[][] { { 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19 } };// [2][5]
				int[][] a12 = new int[][] { { 100, 101, 102 }, { 103, 104, 105 }, { 106, 107, 108 }, { 109, 110, 111 },{ 112, 113, 114 } };// [5][3]
				int[][] a13 = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };// [5][6]

				// Retrieve
				
				  int[][] a15 = new int [][]{{ 10,11,12 }, {13,14,15}, {16,17,18}}; 
				  for(int i =0; i<a15.length ; i ++) { 
					  for(int j =0; j<a15[i].length ; j ++) {
				   System.out.print(a15[i][j] + " "); 
					  }
					  System.out.println();
				  }

	}

}
