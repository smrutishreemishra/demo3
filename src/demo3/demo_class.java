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
		System.out.println(power(2, 3));
	}
	public static int multiplication(int a,int b) {
		return a*b;		
	}

	public static int add(int a,int b) {
		return a+b;		
	}

	public static int power(int number,int power) {
		int result;
		result = 1;
		for(int i = 1; i<=power; i++) {
			result = result * number;
		}
		return result; 
	}
}
