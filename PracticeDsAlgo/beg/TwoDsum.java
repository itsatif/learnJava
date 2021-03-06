package beg;
import java.util.*;
public class TwoDsum {
	
	public static int posMaxRowSum(int[][] a) {
		int largest = Integer.MIN_VALUE;
		int pos = 0;
		for(int i=0;i<a.length;i++) {
			int rowsum = 0;
			for(int j=0;j<a[0].length;j++) {
				rowsum += a[i][j];
			}
			if(rowsum > largest) {
				largest = rowsum;
				pos = i;
			}
		}
		return pos;
	}
	
	public static int posMaxColSum(int[][] a) {
		int largest = Integer.MIN_VALUE;
		int pos =0;
		for(int i=0;i<a[0].length;i++) {
			int colsum =0;
			for(int j=0;j<a.length;j++) {
				colsum += a[j][i];
			}
			if(colsum > largest) {
				largest = colsum;
				pos = i;
			}
		}
		return pos;
	}
	
	public static int largestRowSum(int[][] a) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int rowsum = 0;
			for(int j=0;j<a[0].length;j++) {
				rowsum += a[i][j];
			}
			if(rowsum > largest) {
				largest = rowsum;
			}
		}
		return largest;
	}
	
	public static int largestColSum(int[][] a) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<a[0].length;i++) {
			int colsum =0;
			for(int j=0;j<a.length;j++) {
				colsum += a[j][i];
			}
			if(colsum > largest) {
				largest = colsum;
			}
		}
		return largest;
	}
	
	public static void rowSum(int[][] a){
		for(int i=0;i<a.length;i++) {
			  int rowsum = 0;
			for(int j=0;j<a[0].length;j++) {
				rowsum += a[i][j];
			}
			System.out.println("Sum of " + i + " row is : " + rowsum);
		}
	}
	
	public static void colSum(int[][] a) {
		for(int i=0;i<a.length;i++) {
			int colsum = 0;
			for(int j=0;j<a[0].length;j++) {
				colsum += a[j][i];
			}
			System.out.println("Sum of " + i + " column is : " + colsum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int rowSize  = sc.nextInt();
		System.out.println("Enter the column size ");
		int colSize = sc.nextInt();
		// defining 2d Array
		int[][] arr = new int[rowSize][colSize];
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<colSize;j++) {
				System.out.println("Enter the element in row " + i + " and column " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rowSize;i++) {
			for(int j =0;j<colSize;j++) {
		        System.out.print(arr[i][j] + "\t");
		        }
			System.out.println();
		}
		rowSum(arr);
		colSum(arr);
		int maxRowSum = largestRowSum(arr);
		int maxColSum = largestColSum(arr);
		System.out.println("Sum of largest row is : " + maxRowSum);
		System.out.println("Sum of largest col is : " + maxColSum);
		int maxSum = maxRowSum > maxColSum ? maxRowSum : maxColSum;
		System.out.println("Sum of largest among all col and row is : " + maxSum);
		if(maxRowSum > maxColSum) {
			System.out.println("Among all row and col, row : " + posMaxRowSum(arr) + " has largest sum which is : " + maxRowSum);
		}else {
			System.out.println("Among all row and col, row : " + posMaxColSum(arr) + " has largest sum which is : " + maxColSum);
		}
	}

}
