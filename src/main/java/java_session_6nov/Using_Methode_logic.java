package java_session_6nov;

public class Using_Methode_logic {

	// static is concept of the Class
		// non-static is concept of the Object
		// a static entity can be called directly or by the help of the Class

		public static void main(String[] args) {
			System.out.println("This is the main method");
			Using_Methode_logic.logic1();
			Using_Methode_logic.logic2();
			Using_Methode_logic.logic3();
			logic1();
			logic2();
			logic3();

			Using_Methode_logic objref = new Using_Methode_logic();
			objref.logic4();

		}

		public static void logic1() {
			System.out.println("I have coding logic1");
		}

		public static void logic2() {
			System.out.println("I have coding logic2");
		}

		public static void logic3() {
			System.out.println("I have coding logic3");
		}

		public void logic4() {
			System.out.println("I have coding logic4");
		}

}
