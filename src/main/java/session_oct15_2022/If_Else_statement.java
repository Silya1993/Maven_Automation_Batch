package session_oct15_2022;

public class If_Else_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		if (a < b) { // true
			System.out.println("My logic is correct");
		} else {
			System.out.println("my logic is incorrect");
		}
		{
			// write a java program to find the greatest and smallest of 4 numbers
			
			int a1 = 10;
			int b1 = 20;
			int c1 = 30;
			int d1 = 40;
			
		if(a1>b1 && a1>c1 && a1>d1) {
			System.out.println("a1 is the greatest :" + a1);
		}else if (b1>a1 && b1>c1 && b1>d1) {
			System.out.println("b1 is the greatest :" + b1);
		}else if (c1>a1 && c1>b1 && c1>d1) {
			System.out.println("c1 is the greatest :" + c1);
		}else {
			System.out.println("d1 is the greatest :" + d1);
		}	
		
	}

}
}