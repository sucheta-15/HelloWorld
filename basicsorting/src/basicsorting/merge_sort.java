package basicsorting;

public class merge_sort {
	public static void print(int[]arr) {
		for(int ele: arr) {
		System.out.print(ele+" ");
		}System.out.println();
	}

	public static void mergesort(int[]a, int[]b, int[]c) {
		int i=0;int j=0;int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else{
				c[k]=b[j];
				j++;
				k++;
			}
		}while(j<b.length) c[k++]=b[j++];
		while(i<a.length) c[k++]=a[i++];
	}
	public static void merge(int[]arr) {
		int n=arr.length;
		if(n==1) return;
		int[]a=new int[n/2];
		int[]b=new int[n-n/2];
		for(int i=0;i<n/2;i++) {
			a[i]=arr[i];
		}
		for(int i=0;i<n-n/2;i++) {
			b[i]=arr[i+n/2];
		}
		merge(a);
		merge(b);
		mergesort(a,b,arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {22,15,55,12,96,33};
		print(arr);
		merge(arr);
		print(arr);
		

	}

}
