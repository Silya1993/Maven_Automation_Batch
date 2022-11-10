package practice_Nov_06_ClassStatic;


public class Create_Class4 {

	public static void main(String[] args) {

		System.out.println("this is the main method");

		Create_Class4.case1();
		Create_Class4.case2();
		Create_Class4.case3();
		Create_Class4.case4();
		Create_Class4.case5();
		case1();
		case2();
		case3();
		case4();
		case5();
		Create_Class4 object = new Create_Class4();
		object.case6();
		Create_Class4 object1 = new Create_Class4();
		object1.case7();
		Create_Class4 object2 = new Create_Class4();
		object2.case8();
		Create_Class4 object3 = new Create_Class4();
		object3.case9();
		Create_Class4 object4 = new Create_Class4();
		object4.case10();

	}

	public static void case1() {
		System.out.println("I have  run case1");
	}

	public static void case2() {
		System.out.println("I have  run case2");
	}

	public static void case3() {
		System.out.println("I  have run case3");
	}

	public static void case4() {
		System.out.println("I have run case4");
	}

	public static void case5() {
		System.out.println("I have run case5 ");
	}

	public void case6() {
		System.out.println("I have run case6");
	}

	public void case7() {
		System.out.println("I have run case7");
	}

	public void case8() {
		System.out.println("I have run case8");
	}

	public void case9() {
		System.out.println("I have run case9");
	}

	public void case10() {
		System.out.println("I have run case10");
	}

}
