package basicsorting;

public class bubblesort {
	 public static void printArray(int arr[]) {
	       for(int i=0; i<arr.length; i++) {
	           System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	   }
public static void swaparray(int []arr,int i,int j) {
	int temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {7,6,9,3,21,5};
		printArray(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1])
					swaparray(arr, j, j);
				//printArray(arr);//it shows the whole process
				
			}
		}System.out.print("sorted array is:");
		printArray(arr);
		

	}

}
