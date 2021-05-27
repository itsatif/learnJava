package beg;
import java.util.*;
public class practice {
	



public static void main(String[] args) {
	System.out.println(111001%10);
	System.out.println(111001/2);
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int b2 = scn.nextInt();
    int d = getValueIndecimal(n, b);
    int d2any = decimal2anyBase(d,b2);
    System.out.println(d);
    System.out.println(d2any);
	
}

public static int decimal2anyBase(int n,int b) {
	int ans = 0;
	int p = 1;
	while(n>0) {
		int rem = n % b;
		n /= b;
		ans += rem * p;
		p *= 10;
	}
	return ans;
}


public static int getValueIndecimal(int n, int b){
   
    int p = 1;
    int ans = 0;
    while(n>0){
        int rem = n % 10;
        //System.out.println(rem);
        n /= 10;
        //System.out.println(n);
        ans += rem*p;
        p *= b;
    }
    return ans;
 }
}