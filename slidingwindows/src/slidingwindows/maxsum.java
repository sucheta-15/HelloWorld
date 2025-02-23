package slidingwindows;

public class maxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1,6,8,5,9};
		int maxsum=0;
		int k = 3;
		int n= arr.length;
		int i=0,j=k-1,sum=0;
		for(int a=0;a<=k-1;a++) {
			sum += arr[a];
		}
		i++;j++;
		while(j<n) {
			sum= sum- arr[i-1]+arr[j];
			maxsum = Math.max(maxsum, sum);
			i++;j++;
		}
System.out.println(maxsum);
	}

}
