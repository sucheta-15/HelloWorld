package array;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {45,89,69,96,34,12};
		System.out.println(arr.length);
		for(int ele:arr) {
			System.out.print(ele+" ");
		}System.out.println();
		int n=arr.length;
		int k=4;
		k=k%n;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		

	}
	public static void reverse(int arr[],int i,int j) { 
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		
		
	}
	

}
