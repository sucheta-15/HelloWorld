package stack;

import java.util.Stack;

public class insertatanyindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st_original=new Stack<>();
		st_original.push(24);
		st_original.push(34);
		st_original.push(44);
		st_original.push(54);
		st_original.push(64);
		System.out.println(st_original);
		int newelem=50;
		int idx=2;
		Stack<Integer> st_temp=new Stack<>();
		while(st_original.size()>idx) {
			st_temp.push(st_original.pop());
		}st_original.push(newelem);
		while(st_temp.size()>0) {
			st_original.push(st_temp.pop());
		}
		System.out.println(st_original);
	}
}