package pw_skills;
import java.util.Scanner;

public class star_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num n");
		int n=sc.nextInt();
		//int n=6;
		//int mid=n/2+1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n/2 || j==n/2) {
					System.out.print("* ");
				}
				else { 
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
