package stack;

import java.util.Stack;

public class copystack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st_original=new Stack<>();
		st_original.push(24);
		st_original.push(34);
		st_original.push(44);
		st_original.push(54);
		st_original.push(64);
		System.out.println(st_original);
		Stack<Integer>st_temp=new Stack<>();
		while(!st_original.isEmpty()) {
			st_temp.push(st_original.pop());
		}
		System.out.println(st_temp);
		Stack<Integer>st_final=new Stack<>();
		while(!st_temp.isEmpty()) {
			st_final.push(st_temp.pop());
		}System.out.println(st_final);
	}
}