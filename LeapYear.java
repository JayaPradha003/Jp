import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%4==0 || n%400==0)
			System.out.println("Its is a LeapYear");
		else
			System.out.println("Not a LeapYear");
				  
			  
		 }
	

	}


