package multidimensional_array;

public class sumof2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{1,2,3},{5,6,4},{7,8,9}};
		int[][]b= {{8,7,9},{5,4,3},{2,5,8}};
		for(int i=0;i< a.length;i++) {
			for(int j=0;j<b.length;j++) {
				int res=a[i][j]+b[i][j];
				System.out.print(res+" ");
			}System.out.println();
		}

	}

}
