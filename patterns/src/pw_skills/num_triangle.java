package pw_skills;

public class num_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		int n=1;
		for(int i=1;i<=row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}


	}

}
