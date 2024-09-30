package doublyll;
class node{
	int val;
	node next;
	node prev;
	node(int val){
		this.val=val;
	}
}
class dll{
	node head;
	node tail;
	int size;
	void display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}System.out.println();
	}
void insertatTail(int val) {
	node temp=new node(val);
	if(size==0) head=tail=temp;
	else {
		tail.next=temp;
		temp.prev=tail;
		tail=temp;
	}size++;
}
void insertathead(int val) {
	node temp=new node(val);
	if(size==0) head=tail=temp;
	else {
		temp.next=head;
		head.prev=temp;
		head=temp;
	}size++;
}
}
public class intro {
public static void print(node head) {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.val+" ");
		temp=temp.next;
	}System.out.println();
}
public static void printrev(node tail) {
	node temp=tail;
	while(temp!=null) {
		System.out.print(temp.val+" ");
		temp=temp.prev;
	}System.out.println();
}
public static void display(node node) {
	node temp=node;
	while(temp.prev!=null) {
		//System.out.print(temp.val+" ");
		temp=temp.prev;
	}print(temp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         node a=new node(10);
         node b=new node(20);
         node c=new node(30);
         node d=new node(40);
         a.next=b;b.prev=a;
         b.next=c;c.prev=b;
         c.next=d;d.prev=c;
         //print(a);
         //printrev(d);
         //display(c);
         dll list=new dll();
         list.display();
         list.insertatTail(10);
         list.insertatTail(20);
         list.insertatTail(30);
         list.display();
         list.insertatTail(40);
         list.display();
         list.insertathead(50);
         list.display();
	}

}
