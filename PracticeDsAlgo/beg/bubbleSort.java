package beg;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {15,30,40,4,11,9};
		bubblesort(ar);
		for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+ "\t");
		}
		System.out.println();
		int[] sol=bubblesor1(ar);
		for(int i=0;i<sol.length;i++) {
		System.out.print(sol[i] + "\t");
		}
		

	}
	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length -1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static int[] bubblesor1(int[] arr) {
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j] = temp;
				}
			}
		}
			for(int k=0;k<arr.length;k++) {
				ans[k] = arr[k];
			}
		
		return ans;
	}

}
