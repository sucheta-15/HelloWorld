package array;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,2,6,7,8,1};
		int x=7;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println(arr[i]+" "+arr[j]);
					
				}
			}
		}

	}

}
