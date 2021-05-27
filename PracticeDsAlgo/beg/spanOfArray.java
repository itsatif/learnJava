package beg;

public class spanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,30,40,4,11,9};
		int max = maxOfArr(arr);
		int min = minOfArr(arr);
		int span = max - min;
		System.out.println(min);
		System.out.println(max);
		System.out.println(span);
		                    

	}
	
	public static int maxOfArr(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

 }
	public static int minOfArr(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}