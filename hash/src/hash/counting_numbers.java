package hash;

import java.util.HashSet;

public class counting_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums= [1,22,32,43];
HashSet<Integer> set=new HashSet<>();
for(int i=0;i<nums.length;i++) {
	set.add(nums[i]);
	set.add(reverse(nums[i]));
}
return set.size();)
	}
	public class reverse(int n) {
		int r=0;
		while(n!=0) {
			r=r*10+n%10;
			n=n/10;
		}
		return r;
	}

}
