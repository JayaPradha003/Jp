import java.util.Scanner;

public class EvenIntrvl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=n+1;
		for(int i=a;i<m;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
