package linkedlist;

public class displaying_linkedlist {
	public static void print(node head){
		node temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	public static void displayRecursively(node head) {
		if(head==null) return;
		System.out.println(head.val);
		displayRecursively(head.next);
	}
public static void display(node head) {
	if(head==null) return;
	display(head.next);
	System.out.print(head.val+" ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node a= new node(10);
		node b=new node(20);
		node c=new node(30);
		node d=new node(40);
		node e=new node(50);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		 print(a);
		 System.out.println();
		 displayRecursively(c);
		 System.out.println();
		 display(a);

	}

}
