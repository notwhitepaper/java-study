package getterSetter;

public class App {

	public static void main(String[] args) {
		// 접근제어자 private은 같은 클래스에서만 접근 가능
		Person p1=new Person();
		p1.setName("펭수");
		p1.setAge(7);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
