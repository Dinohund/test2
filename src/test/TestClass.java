package test;

public class TestClass {

	public static void main(String[] args) {
		
		System.out.println(fak(5));
		System.out.println(fib(5));
	}
	
	//Fibonaccizahlen (rekursiv)
	public static int fib(int n) {
		
		int result = 0;
		
		if (n == 1) {
			result = 1;
		}
		else if (n == 2) {
			result = 1;
		}
		else {
			result = n+fib(n-1);
		}
		
		return result;
	}
	
	//Fakultätsfunktion (rekursiv)
	public static int fak(int n) {
		
		int result = 0;
		
		if (n == 0) {
			result = 1;
		}
		else {
			result = n*fak(n-1);
		}
		return result;
	}

}
