package test;

public class TestClass {
	
	public static boolean outputEnabled = true;

	public static void main(String[] args) {
		
		System.out.println(fak(5));
		System.out.println(fib(5));
		ggT(654321, 123456);
	}
	
	public static int ggT(int a, int b) {
		
		if (a == b) {
			return a;
		}
		else if (a < b) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		int result = 0;
		
		while (a%b != 0) {
				
			result = a%b;
			
			if (outputEnabled) {
				System.out.println(b+":"+result);
			}
	
			if (result != 0) {
				a = b;
				b = result;
			}
		}
		
		return result;
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
