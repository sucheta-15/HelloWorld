package array;

public class roll_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {81,25,20,45,60};
		int n=arr.length;
		System.out.println(n);
		
		for(int i=0;i<n;i++) {
			if(arr[i]<35) {
				System.out.print(i+" ");
			}
		}

	}

}
