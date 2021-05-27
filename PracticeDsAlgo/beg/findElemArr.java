package beg;

public class findElemArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,30,40,4,11,9};
		int[] ar = {1,2,3,4,5,6};
		int idx = findElem(arr,40);
		System.out.println(idx);
		int[] r = {55,11,22,10,2};
		int a = BinSrch(r,11);
		System.out.println(a);
		int ans = BinSrch(ar,4);
		bubblesort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		int sol = BinSrch(arr,40);
		System.out.println(ans);
		System.out.println(sol);
		

	}
	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static int BinSrch(int[] arr,int elem) {
		int left = 0;
		int right = arr.length - 1;
		while(left<=right) {
			int mid = (left + right)/2;
			if(arr[mid] == elem) {
				return mid;
			}
			else if(arr[mid]<elem) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
		
	}
	public static int findElem(int[] arr,int elem) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == elem) {
				return i;
			}
		}
		return -1;
	}

}
