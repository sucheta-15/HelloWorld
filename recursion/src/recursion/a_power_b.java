package recursion;

import java.util.Scanner;

public class a_power_b {
	public static int pow(int a,int b) {
		if(a==0 && b==0) {
			System.out.println("not defined");
		return -1;
		}
		if(b==0) return 1;
		return a*pow(a,b-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int a=sc.nextInt();
		System.out.println("enter power");
		int b=sc.nextInt();
		System.out.println(pow(a,b));

	}

}
