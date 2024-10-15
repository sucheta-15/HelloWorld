package trees;

public class size_of_tree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node a=new node(10);
		node b=new node(20);
		node c=new node(30);
		node d=new node(40);
		node e=new node(50);
		node f=new node(60);
		node g=new node(70);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.left=f; c.right=g;
		
		System.out.println(size(a));
		
	}
	public static int size(node root) {
		if(root==null) return 0;
		return 1+size(root.left)+size(root.right);
	}
}
