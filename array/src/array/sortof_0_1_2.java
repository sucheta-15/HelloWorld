package array;

public class sortof_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int[]arr= {0,1,2,2,1,0,1,2,0,1};
		int n=arr.length;
		int j=0;//noOfZeroes
		int k=0;//noOfOnes
		for(int i=0;i<n;i++) {
			if(arr[i]==0)j++;
			if(arr[i]==1)k++;
		}
		for(int i=0;i<n;i++) {
			if(i<j)arr[i]=0;
			else if(i<j+k)arr[i]=1;
			else arr[i]=2;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
