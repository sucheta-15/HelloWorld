package array;

public class sort_0_and_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,1,1,0,0,1,0,0,1};
		for(int ele:arr) {
			System.out.print(ele+" ");
		}System.out.println();
		int n=arr.length;
		int i=0;
		int j=n-1;
		while(i<j) {
			if(arr[i]==0)
				i++;
			if(arr[j]==1)
				j--;
			if(i>j)
				break;
			if(arr[i]==1 && arr[j]==0)
				arr[i]=0;arr[j]=1;
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}System.out.println();

	}

}
