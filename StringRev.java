import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev="";
		StringBuilder sb =new StringBuilder (str);
		sb.reverse();
		System.out.println(sb);
		

	}

}
