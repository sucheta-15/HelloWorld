package pw_skills;

public class odd_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			int num=1;
			for(int j=0;j<i;j++) {
				System.out.print(num+" ");
				num=num+2;
			}
			System.out.println();
		}

	}

}
