package trees;

public class maxintree {
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
		
		
		
        System.out.println(max(a));
	}
	private static int max(node root) {
		if(root==null) return Integer.MIN_VALUE;
		return Math.max(root.val, Math.max(max(root.left), max(root.right)));
	}
	
}
