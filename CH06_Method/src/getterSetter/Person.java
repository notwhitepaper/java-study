package getterSetter;

public class Person {

	private String name;
	private int age;

	// get, set 메소드로 변수에 접근
	public void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
}
