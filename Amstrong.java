import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		int c=0;
		int nn=n;
		while(n>0) {
			a=n%10;
			c=c+(a*a*a);
			n=n/10;
		}
if(nn==c)
	System.out.println("Amstrong num");
else
	System.out.println("not a amstrong num");
	}

}
