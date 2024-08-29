package recursion;

public class skipacharacter {
	public static void print(int i,String s) {
		if(i==s.length()) return;
		System.out.print(s.charAt(i)+" ");
		print(i+1,s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sucheta sri";
		print(0,s);

	}

}
