package multidimensional_array;

public class transposeofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2},{3,4},{5,6}};
		int m=arr.length;
		int n=arr[0].length;
		//before transpose
	//	for(int i=0;i<m;i++) {
		//	for(int j=0;j<n;j++) {
			//	System.out.print(arr[i][j]+" ");
			//}System.out.println();
		//}
		for(int j=0;j<n;j++) {
				for(int i=0;i<m;i++) {
					System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
			

	}

}
