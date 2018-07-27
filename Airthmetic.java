import java.util.Scanner;

public class Airthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		 int count=0;  
	      
         char ch[]= new char[str.length()];     
         for(int i=0;i<str.length();i++)  
         {  
             ch[i]= str.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                 count++;  
         }  
       System.out.println(count);
     }  
	}


