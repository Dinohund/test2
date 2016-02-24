package test;

public class TestClass {
	
	public static boolean outputEnabled = true;

	public static void main(String[] args) {
		
		System.out.println(fak(5));
		System.out.println(fib(5));
		ggT(654321, 123456);
	}
	
	//Berechnet den groessten gemeinsamen Teiler von a und b
	public static int ggT(int a, int b) {
		
		int result = 0;
		
		if (a == b) {
			return a;
		}
		else if (a < b) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		int r = 1;
		
		while (r != 0) {
			
			r = a%b;
			
			if (outputEnabled) {
				System.out.println(a+":"+b+" = "+a/b+"*"+b+"+"+r);
			}
	
			if (r != 0) {
				a = b;
				b = r;
			}
			else {
				result = b;
			}
		}
		
		System.out.println("ggT ist: "+result);
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
