package beg;

public class barChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,0,7,5};
		BarChart(arr);
		
		
		

	}
	
	public static int maxOfArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static void BarChart(int[] arr) {
		int max = maxOfArray(arr);
		for(int floor=max;floor>0;floor--) {
			for(int brick=0;brick<arr.length;brick++) {
				if(arr[brick] >= floor) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	

}
