package beg;

public class inverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,0,2,3,1};
		int[] sol = inverseOfArray(arr);
		for(int val:sol) {
			System.out.println(val);
		}

	}
	
	public static int[] inverseOfArray(int[] a) {
		int[] invArr = new int[a.length];
		for(int i=0;i<a.length;i++) {
			int idx = a[i];
			invArr[idx] = i;
		}
		return invArr;
	}

}
