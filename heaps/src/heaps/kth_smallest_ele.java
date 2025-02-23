package heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,3,2,4,10,12};
		int k=2;
		//minheap for kth largest element
		/*PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int ele:arr) {
			pq.add(ele);
		}
		for(int i=0;i<k-1;i++) {
			pq.remove();
		}
System.out.println(pq.peek());*/
//maxheap for kth smallest element
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
for(int ele:arr) {
	pq.add(ele);
	if(pq.size()>k) pq.remove();
}

System.out.println(pq.peek());
	}

}
