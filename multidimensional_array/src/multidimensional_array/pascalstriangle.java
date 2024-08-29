package multidimensional_array;
import java.util.*;

public class pascalstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> l=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		int n=4;
		for(int i=0;i<n;i++) {
			List<Integer> l=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				l.add(1);
			}
			ans.add(l);
		}
		for(int i=2;i<n;i++) {
			for(int j=1;j<=i-1;j++) {
				//List<List<Integer>> l;
				ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
			}
			System.out.println(ans);
		}//System.out.println();
		
	}

}
