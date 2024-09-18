package oops;
class person{
	public String name;
	public String adress;
	public int age;
}
class student extends person{
	public int marks;
	public String grade;
	
	student(String name,String adress,int age,int marks,String grade){
		this.name=name;
		this.adress=adress;
		this.age=age;
		this.marks=marks;
		this.grade=grade;
	}
	
	public void disp() {
		System.out.println("name:"+name);
		System.out.println("adress:"+ adress);
		System.out.println("age:"+age);
		System.out.println("marks:"+marks);
		System.out.println("grade:"+grade);
	}
}

public class test {

	public static void main(String[] args) {
		student s=new student("aman","mi",15,20,"A");
		s.disp();
	}

}
