package recursion;

public class subsets {
	public static void printsubsets(int i,String s,String ans) {
		if(i==s.length()) {
			System.out.println(ans);
		return;
		}
		char ch=s.charAt(i);
		printsubsets(i+1,s,ans);
		printsubsets(i+1,s,ans+ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sri";
		printsubsets(0,s," ");

	}

}
