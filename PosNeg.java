import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
		}
		else if(n>0){
			System.out.println("Positive");
		}
		else{
			System.out.println("Negative");
		}

	}

}
