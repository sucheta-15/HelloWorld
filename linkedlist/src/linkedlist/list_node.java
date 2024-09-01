package linkedlist;
class node{
	int val;
	node next;
	node temp;
	node(int val){
		this.val=val;
	}
}

public class list_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node a= new node(10);
		node b=new node(20);
		node c=new node(30);
		node d=new node(40);
		node e=new node(50);
		a.next=b;
		System.out.println(a);
		System.out.println(a.val);
		System.out.println(a.next.val);
		

	}

}
