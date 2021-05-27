package beg;
import java.util.*;
public class IntrestAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print((char)(64+j));
			}
			System.out.println();
		}

	}

}
