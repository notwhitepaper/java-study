package application;

class Person {

	String name;
}

public class ClassObject {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "펭수 ";

		Person p2 = new Person();
		p2.name = "길동 ";

		System.out.println(p1.name);
		System.out.println(p2.name);

	}
}
