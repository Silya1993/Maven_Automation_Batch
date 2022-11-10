package practice_Nov_06_ClassStatic;

public class Create_classe {

	public static void main(String[] args) {
		System.out.println("this is the main method");
		Create_classe.method1();
		 Create_classe.method2();
		 Create_classe.method3();
		 Create_classe.method4();
		 Create_classe.method5();
		 Create_classe object = new Create_classe();
		 object.method6();
		 Create_classe object1 = new Create_classe();
		 object1.method7();
		 Create_classe object2 = new Create_classe();
		 object2.method8();
		 Create_classe object3 = new Create_classe();
		 object3.method9();
		 Create_classe object4 = new Create_classe();
		 object4.method10();
		 
	}

	public static void method1() {

		System.out.println("I have coding method1");
	}

	public static void method2() {
		System.out.println("Ihave coding method2");
	}

	public static void method3() {
		System.out.println("Ihave coding method3");
	}

	public static void method4() {
		System.out.println("Ihave coding method4");
	}

	public static void method5() {
		System.out.println("Ihave coding method5");
	}

	public void method6() {
		System.out.println("Ihave coding method6");
	}

	public  void method7() {
		System.out.println("Ihave coding method7");
	}

	public void method8() {
		System.out.println("Ihave coding method8");
	}

	public void method9() {
		System.out.println("Ihave coding method9");
	}
	public void method10() {
		System.out.println("I have coding method10");
	}
}
