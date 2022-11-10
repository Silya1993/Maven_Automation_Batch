package practice_Nov_06_ClassStatic;

public class Create_Class5 {

	public static void main(String[] args) {
		System.out.println("this is the main method");

		Create_Class5.logic1();
		Create_Class5.logic2();
		Create_Class5.logic3();
		Create_Class5.logic4();
		Create_Class5.logic5();
		logic1();
		logic2();
		logic3();
		logic4();
		logic5();
		Create_Class5 object = new Create_Class5();
		object.logic6();
		Create_Class5 object1 = new Create_Class5();
		object1.logic7();
		Create_Class5 object2 = new Create_Class5();
		object2.logic8();
		Create_Class5 object3 = new Create_Class5();
		object3.logic9();
		Create_Class5 object4 = new Create_Class5();
		object4.logic10();

	}

	public static void logic1() {
		System.out.println("I have  print logic1");
	}

	public static void logic2() {
		System.out.println("I have  print logic2");
	}

	public static void logic3() {
		System.out.println("I  have print logic3");
	}

	public static void logic4() {
		System.out.println("I have print logic4");
	}

	public static void logic5() {
		System.out.println("I have print logic5 ");
	}

	public void logic6() {
		System.out.println("I have print logic6");
	}

	public void logic7() {
		System.out.println("I have print logic7");
	}

	public void logic8() {
		System.out.println("I have print logic8");
	}

	public void logic9() {
		System.out.println("I have print logic9");
	}

	public void logic10() {
		System.out.println("I have print logic10");
	}


	}


