package multidimensional_array;

public class waveform_array {
	public static void print(int[][] arr){
		int m=arr.length; int n=arr[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,9},{8,3,4},{7,5,6}};
		int m=arr.length; int n=arr[0].length;
		print(arr);
		for(int i=0;i<m;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}else
				for(int j=n-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
		}

	}

}
