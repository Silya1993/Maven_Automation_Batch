package session_oct15_2022;

public class Access_Modifiers {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		//4 types
		//public  highest accessibility
		//protected
		//private
		//default (cannot be used in class)
	}
		public static void test() {
			System.out.println("this is a simple test method");//can be access anywhere
		}
		protected static void test1() {
			System.out.println("this is a simple test1 method");//can be access within the classes with the same package
		}
			private static void test2() {
				System.out.println("this is a simple test2 method");//can be use only for that limited class itself can not be use for any other class
			}	
			
			/*
			 * default static void test3() {
			 * System.out.println("this is a simple test3 method");
			 * 
			 * //default is not allowed in class is only allowed in interface }
			 */
	
}	