package multidimensional_array;

public class maxAndSumin2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{6,5,4},{9,10,8},};
		int mx=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				mx=Math.max(mx,arr[i][j]);
				sum=sum+arr[i][j];
			}
		}System.out.println(mx);
		System.out.println(sum);

	}

}
