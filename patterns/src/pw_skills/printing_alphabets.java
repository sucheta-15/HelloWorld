package pw_skills;

public class printing_alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(ch+" ");
				if(ch!='Z') {
				ch++;
				}else
					break;
			}
			System.out.println();
			
		}
		

	}

}
