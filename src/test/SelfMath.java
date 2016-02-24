package test;

public class SelfMath {
	
	public static boolean outputEnabled = false;

	public static void main(String[] args) {
		
		System.out.println(fak(5));
		System.out.println(fib(5));
		System.out.println(nCr(12, 3));
		ggT(654321, 123456);
	}
	
	// n über k
	public static int nCr(int n, int k) {
		int result = 0;
		
		result = fak(n)/(fak(k)*fak(n-k)); //TODO fakultät nicht rekursiv implementieren und hier ändern
		//TODO Fakultäten kürzen, wird sonst zu groß
		
		return result;
	}
	
	//Berechnet das kleinste gemeinsame vielfache von a und b
	public static int kgV(int a, int b) {
		int result = 0;
		
		int cggT = ggT(a, b);
		result = (a*b)/cggT;
		
		return result;
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
		
		if (outputEnabled) {
		System.out.println("ggT ist: "+result);
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
