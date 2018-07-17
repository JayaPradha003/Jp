import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){ 
			  if(n<=1000) {
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  }
		  if(temp==sum) {
			  System.out.println("palindrome number ");    
		  }
		   
		  else    
		   System.out.println("not palindrome");   
	

}
}
