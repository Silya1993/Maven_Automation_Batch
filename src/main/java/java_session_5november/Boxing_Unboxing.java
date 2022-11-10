package java_session_5november;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Boxing (do this manually)   - conversion of primitive to Wrapper Class Object
		
				int x=20;
				Integer y = Integer.valueOf(x);
				System.out.println(y);
				
				//Autoboxing
				
				int a = 100;
				Integer b = a;
				System.out.println(b);
				
				 
				//Unboxing       - conversion of Wrapper Class object to primitive
				
				Integer result = 50;
				int newResult = result.intValue();
				System.out.println(newResult);
				
				//Autounboxing
				Integer marks = 90;
				int newMarks = marks;
				System.out.println(newMarks);
				
				
				String price3 = "22";
				String price4 = String.valueOf(price3);
				System.out.println(price4);
				
				
				String name1 = "Ahmed";
				String name2 = name1;
				System.out.println(name2);
				
				
	}

}
