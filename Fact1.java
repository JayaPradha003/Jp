import java.util.Scanner;

public class Fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		if(n<=20) {
		for(int i=1;i<=n;i++) {
	fact=fact*i;
	
		}
		}
		System.out.println(fact);
	}

}
 
