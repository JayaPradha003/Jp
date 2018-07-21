import java.util.Scanner;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int sum=0;
		for(int i=0;i<=n;i++) {
			temp=n%10;
			sum=(sum*10)+temp;
			n=n/10;
			
		}
		System.out.println(sum);
		

	}

}
