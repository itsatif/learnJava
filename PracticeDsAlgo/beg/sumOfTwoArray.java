package beg;

public class sumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = {3,1,0,7,5};
		int [] a2 = {1,1,1,1,1,1};
		sumTwoArray(a1,a2);

	}
	public static void sumTwoArray(int[] a1,int[] a2) {
		int[] sum = new int[a1.length>a2.length ? a1.length:a2.length];
		int carry =0;
		int i = a1.length -1;
		int j = a2.length -1;
		int k = sum.length -1;
		while(k>=0) {
			int digit = carry;
			if(i>=0) {
				digit += a1[i];
			}if(j>=0) {
				digit += a2[j];
			}
			carry = digit / 10;
			digit %=  10;
			sum[k] = digit;
			i--;
			j--;
			k--;
		}
		if(carry != 0) {
			System.out.println(carry);
		}
		for(int val:sum) {
			System.out.println(val);
		}
	}

}
