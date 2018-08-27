import java.util.Scanner;

public class MostFrqDigit {
   public static void main(String[] args) {
	  
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int s[]=new int[n];
	   int count=0;
	   int var=0;
	   int max=0;
	   for(int i=0;i<n;i++) {
		 s[i]=sc.nextInt();
		    }
	   for(int i=0;i<s.length;i++) {
		   count=0;
		   for(int j=0;j<s.length;j++) {
			   if(s[i]==s[j]) {
				   count++; 
			   }   
		   }
		   if(max<=count) {
			   max=count;
			   var=s[i];
			
		   }
	   }  System.out.println(var);
   }
}
