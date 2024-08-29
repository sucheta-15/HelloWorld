package recursion;

public class pre_in_post {
	public static void pip(int n){
		if(n==0) return;
		System.out.print("pre"+" "+n+" ");
		pip(n-1);
		System.out.print("in"+" "+n+" ");
		pip(n-1);
		System.out.print("post"+" "+n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pip(3);

	}

}
