import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Scanner;

public class Hunter_11 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,2,3};
		int count=0;
		ArrayList<Integer> aa=new ArrayList<Integer>();
		HashSet<Integer> ss=new HashSet<Integer>();
		for(int j=0;j<arr1.length;j++) {
			count=0;
			for(int k=0;k<arr1.length;k++) {
				if(arr1[j]==arr1[k])
					count++;
			}
			if(count>=2) {
				aa.add(arr1[j]);
			}
		}
		ss.addAll(aa);
		System.out.println(ss);
		
	}

}
