package beg;
public class differenceOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1};
		int[] a2 = {1,0,0,0};
		diff2Array(a1,a2);
	}
	public static void diff2Array(int[] a1,int[] a2) {
		int carry = 0;
		int[] diff = new int[a2.length];
		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = diff.length - 1;
		while(k>=0) {
			int d = 0;
			int a1val = i>=0 ? a1[i]:0;
			if(a2[j] + carry >= a1val) {
				d = a2[j] + carry - a1val;
				carry = 0;
			}
			else {
				d = a2[j] + carry + 10 - a1val;
				carry = -1;
			}
			diff[k] = d;
			i--;
			j--;
			k--;
		}
		int idx = 0;
		while(idx<diff.length) {
			if(diff[idx] == 0) {
				idx++;
			}else {
				break;
			}
		}
		while(idx<diff.length) {
			System.out.println(diff[idx]);
			idx++;
		}
	}

}
