package test;

public class TestClass {

	public static void main(String[] args) {
		System.out.println(fak(30));

	}
	
	//Fakultätsfunktion (rekursiv)
	public static int fak(int n) {
		
		int result = n;
		
		if (n == 0) {
			result = 1;
		}
		else {
			result = n*fak(n-1);
		}
		return result;
	}

}
