import java.util.Scanner;

public class PrimeIntrvl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=n+1;
		for(int i=a;i<m;i++) {
			int count=0;
			for(int j=1;j<m;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
			
		}

	}

}
