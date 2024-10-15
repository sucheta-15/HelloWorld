package binarysearch;

public class lowerbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {23,44,56,76,88,89,99};
		int n=arr.length;
		int target=56;
		int lb=n;
		int lo=0, hi=n-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]>=target) {
				lb=mid;
			hi=mid-1;
			}
			else lo=mid+1;
			
		}
		System.out.println(lb);

	}

}
