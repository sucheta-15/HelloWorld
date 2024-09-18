package basicsorting;

public class mergesort_array {
	public static void print(int[]arr) {
		for(int ele: arr) {
		System.out.print(ele+" ");
		}System.out.println();
	}

	public static void merge(int[]a, int[]b, int[]c) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,20,30,40,50};
		int[]b= {21,22,23,24,};
		print(a);
		print(b);
		int[]c=new int[a.length+b.length];
		merge(a,b,c);
		print(c);

	}

}
