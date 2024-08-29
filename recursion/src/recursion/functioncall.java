package recursion;
import java.util.Scanner;

public class functioncall {
	public static int fact(int n) {
		if(n==1) return 1;
		int ans=n*fact(n-1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println(fact(n));

	}

}
