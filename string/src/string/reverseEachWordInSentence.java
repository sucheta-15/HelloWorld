package string;
import java.util.Scanner;

public class reverseEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		System.out.println("enter"); 
		int i=0;int j=0;
		int n=sb.length();
		while(j<n) {
			 if(sb.charAt(j)!=' ')j++;
			 else {
				 reverse(sb,i,j-1);
			 i=j+1;
			 j=i;
			 }
			
		}
		reverse(sb,i,j-1);
		System.out.println(sb);

	}
	public static void reverse(StringBuilder sb,int i,int j) {
		while(i<=j) {
			char temp=sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j,temp);
			i++;
			j--;
		}
	}

}
