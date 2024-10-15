package trees;

public class minintree {
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
		
		
		System.out.println(min(a));
       
	}
	private static int min(node root) {
		if(root==null) return Integer.MAX_VALUE;
		return Math.min(root.val, Math.min(min(root.left), min(root.right)));
	}
}
