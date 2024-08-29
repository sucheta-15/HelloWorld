package multidimensional_array;

public class rotate_array {
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
		//transposing
		int[][]arr= {{1,2,9},{8,3,4},{6,5,6}};
		int m=arr.length; int n=arr[0].length;
		print(arr);
		for(int i=0;i<m;i++) {
			for(int j=0;j<i;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}print(arr);
//rotate
		for(int i=0;i<m;i++) {
			int a=0,b=m-1;
			while(a<b) {
				int temp=arr[i][a];
				arr[i][a]=arr[i][b];
				arr[i][b]=temp;
				a++;
				b--;
			}
		}
		print(arr);
		
	}

	
}
