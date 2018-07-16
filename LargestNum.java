import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nn=sc.nextInt();
		int nnn=sc.nextInt();
		int a=Math.max(n,nn);
		int b=Math.max(a, nnn);
		System.out.println("Largest number is:"+b);
			
		}

	}
