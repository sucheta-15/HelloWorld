package pw_skills;

import java.util.Scanner;

public class solid_inverted_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
