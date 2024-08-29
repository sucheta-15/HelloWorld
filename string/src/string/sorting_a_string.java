package string;

import java.util.Arrays;

public class sorting_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sucheta";
	    char[]ch=s.toCharArray();
	    for(char ele:ch) {
	    	System.out.print(ele);
	    }System.out.println();
	    Arrays.sort(ch);
	    for(char ele:ch) {
	    	System.out.print(ele);
	    }System.out.println();
	    
	    

	}

}
