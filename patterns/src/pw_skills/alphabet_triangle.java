package pw_skills;

public class alphabet_triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}


}
