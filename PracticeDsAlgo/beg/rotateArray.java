package beg;

public class rotateArray {
	
	public static void reverse(int[] a,int li,int ri) {
		while(li<ri) {
			int temp = a[li];
			a[li] = a[ri];
			a[ri] = temp;
		}
	}
	
	public static void rotateArr(int[] a,int k) {
		k %= a.length;
		if(k<0) {
			k += a.length;
		}
		//first part
		reverse(a,0,a.length - k -1);
		//second part
		reverse(a,a.length - k,a.length - 1);
		//for full array
		reverse(a,0,a.length-1);	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int k = 3;
		rotateArr(a,k);
	
	}

}
