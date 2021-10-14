package application;

public class DoWhile {

	public static void main(String[] args) {
		int count = 100;
		System.out.println("do while 반복문 ");

		do {
			System.out.println("카운트 : " + count);
		} while (count++ < 5);
	}

}
