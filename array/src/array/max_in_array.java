package array;

public class max_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,8,9,3,5,20};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}System.out.println(max);
	}

}
