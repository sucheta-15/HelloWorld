package oopshtml;

import java.util.Objects;

public class person {
	public String name;
	public String adress;
	public int age;
	public person(String name, String adress, int age) {
		super();
		this.name = name;
		this.adress = adress;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", adress=" + adress + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		return Objects.equals(adress, other.adress) && age == other.age && Objects.equals(name, other.name);
	}
	
	
}
