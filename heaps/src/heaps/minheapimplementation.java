package heaps;
class MinHeap{
	int [] arr;
	int size;
	MinHeap(int capacity){
		arr= new int[capacity];
		size=0;
	}
	public void add(int num) {
		arr[size++]=num;
		upheapify(size-1);
	}
	public void upheapify(int child) {
		if(child==0) return;
		int parent=(child-1)/2;
		if(arr[child]<arr[parent]) {
			swap(child,parent);
			upheapify(parent);
		}
	}
	public void swap(int child, int parent) {
		int temp=arr[child];
		arr[child]=arr[parent];
		arr[parent]=temp;
		
	}
	public int size() {
		return size;
	}
	public int peek() {
		return arr[0];
	}
	
}
public class minheapimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap pq= new MinHeap(10);
		pq.add(10);
		pq.add(8);
		pq.add(5);
		pq.add(4);
        System.out.println(pq.size());
        pq.add(9);
        System.out.println(pq.peek());
	}

}
