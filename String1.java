import java.util.*;


public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String arr1[]=new String[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.next();
		}
		for(int i=0;i<arr1.length;i++) {
			String a=arr1[i].toString();
			StringBuffer sb=new StringBuffer(a);
			sb.reverse();
			System.out.print(" "+sb);
		}
				}

}
