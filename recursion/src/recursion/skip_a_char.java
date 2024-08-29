package recursion;

public class skip_a_char {

	public static void skip(int i,String s,String ans) {
		if(i==s.length()) {
			System.out.println(ans);
			return;
		}
		if(s.charAt(i)!='a')
			ans+=s.charAt(i);
		skip(i+1,s,ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suchetapatro";
		skip(0,s," ");

	}

}
