package multidimensional_array;

import java.util.Scanner;

public class arraytraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][] arr=new int[3][3];
		//input
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//output
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}

	}

}
