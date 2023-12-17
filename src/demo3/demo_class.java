package demo3;

public class demo_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lord smruti tester sdet");		
		int a=30;
		int b= 10;
		System.out.println(a-b);
		System.out.println(multiplication(10,20));
		int result = add(a, b);
		System.out.println(result);
		System.out.println(division(30,3));
		
	}
	public static int multiplication(int a,int b) {
		return a*b;		
	}

	public static int add(int a,int b) {
		return a+b;		
	}
	public static int division(int a, int b) {
		;
		return  a/b;
		
	}
}
