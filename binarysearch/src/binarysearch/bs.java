package binarysearch;

public class bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {23,44,56,76,88,89,99};
		int n=arr.length;
		int target=46;
		int lo=0, hi=n-1;
		boolean flag=false;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				flag=true; break;
			}else if(arr[mid]>target) {
				hi=mid-1;
			}else if(arr[mid]<target) {
				lo=mid+1;
			}
		}if(flag==true)
			System.out.println("target present");
		else System.out.println("target not found");

	}

}
