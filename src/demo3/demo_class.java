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
		System.out.println(mod(77,10));
	}
	public static int multiplication(int a,int b) {
		return a*b;		
	}

	public static int add(int a,int b) {
		return a+b;		
	}
	public static int mod(int a,int b) {
		return a%b;		
	}
	
}
