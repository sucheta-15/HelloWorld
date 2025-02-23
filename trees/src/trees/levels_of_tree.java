package trees;
import java.util.Scanner;
public class levels_of_tree {
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
		
		
		
        System.out.println(level(a));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        nthlevel(a,0);
        
	}
	private static int level(node root) {
		if(root==null) return 0;
		return 1+ Math.max(level(root.left), level(root.right));
	}
	private static void nthlevel(node root,int level) {
		if(root==null) return;
		if(level==n) System.out.println(root.val);
		nthlevel(root.left,level+1);
		nthlevel(root.right,level+1);
		
	}
}
