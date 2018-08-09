import java.util.Arrays;
import java.util.Scanner;

public class Hunter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] n1=new int[n];
		for(int i=0;i<n;i++) {
			n1[i]=sc.nextInt();
		}
		Arrays.sort(n1);
		String str=Arrays.toString(n1);
		String str1=str.substring(1, str.length()-1);
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		System.out.println(sb);
	}

}
