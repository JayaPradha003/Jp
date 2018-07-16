import java.util.Scanner;

public class VowCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
	char ch=sc.next().charAt(0);
		//char ch='a';
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("consonant");
		}
		

	}

}
