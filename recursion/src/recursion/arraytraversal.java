package recursion;

public class arraytraversal {
	public static void print(int i,int[]arr) {
		if(i==arr.length) return;
		System.out.print(arr[i]+" ");
		print(i+1,arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,6,2,4,7,8,9};
		print(0,arr);

	}

}
