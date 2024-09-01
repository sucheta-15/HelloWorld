package linkedlist;
class sll{
	node head;
	node tail;
	node temp;
    void insertAtend(int val){
    	node temp=new node(val);
		if(head==null)
			head=tail=temp;
		else {
			tail.next=temp;
			tail=temp;
		}
	}
    void insertAthead(int val) {
    	node temp=new node(val);
    	if(head==null)
			head=tail=temp;
		else {
			temp.next=head;
			head=temp;
		}
    }
    void display(){
    	node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
    }
}

public class implementataion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sll list=new sll();
		list.insertAtend(10);
		list.insertAtend(20);
		list.insertAtend(30);
		list.insertAtend(40);
		
		list.display();
		System.out.println();
		
		list.insertAthead(50);
		list.display();
		System.out.println();
		
		System.out.println(list.head.val);
		

	}

}
