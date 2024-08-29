package recursion;

import java.util.Scanner;

public class printsumfrom1to_n {
	public static void sum(int n,int s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		sum(n-1,s+n);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		sum(n,0);

	}

}
