import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int sum=0;
      for(int i=0;i<=n;i++) {
	    sum+=i;
     }
      System.out.println(sum);

	}

}
