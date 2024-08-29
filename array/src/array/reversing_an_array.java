package array;

public class reversing_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {34,90,67,44,28,42};
		int n=arr.length;
		for(int ele:arr) {
			System.out.print(ele+" ");
		}System.out.println();
		int i=0,j=n-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}System.out.println();

	}

}
