package Recursion;

public class factorial {
	
	public static long fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(16));
		

	}

}
