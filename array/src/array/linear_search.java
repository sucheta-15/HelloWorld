package array;
import java.util.Scanner;
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target element");
		int x=sc.nextInt();
		int arr[]= {1,4,7,8,3,5};
		boolean flag=false;//element not found
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				flag=true;
				break;
			}
			
		}if(flag==true) {
			System.out.println("element found");
		}else {
			System.out.println("element not found");
		}

	}

}
