package beg;

public class subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40};
		printSubArray(a);

	}
	
	public static void printSubArray(int[] a) {
		for(int i =0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k] + "\t");
				}
				System.out.println();
			}
		}
	}

}
