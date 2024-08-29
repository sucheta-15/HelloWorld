package recursion;

import java.util.Scanner;

public class nth_stairpath {
	public static int stair(int n) {
		if(n<=2) return n;
		return stair(n-1)+stair(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println(stair(n));

	}


}
