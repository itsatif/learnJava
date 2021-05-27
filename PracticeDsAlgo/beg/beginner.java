package beg;
import java.util.*;


public class beginner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nagrama";
		String t = "anagram";
		System.out.println(IsAnagram(s,t));
		char v = 'A' + 7;
		System.out.println(v);
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int P = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (P + i + j));
            }
            System.out.println();
        }
		
		

		

	}
	
	 public static boolean IsAnagram(String s,String t) {
		char []a1 = s.toCharArray();
		char []a2 = t.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		s= String.valueOf(a1);
		t = String.valueOf(a2);
		
		if(s.equals(t)) {
			return true;
		}
		return false;
		
	}

}
