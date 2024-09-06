package stack;
import java.util.*;

public class stack_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(24);
		st.push(34);
		st.push(44);
		st.push(54);
		st.push(64);
		System.out.println(st);
        System.out.println(  st.pop());
        System.out.println(  st.pop());
        System.out.println(  st.peek());
        System.out.println(st);
        System.out.println(st.size());
	}

}
