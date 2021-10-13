package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// 입력 받는 클래스 scanner 이용
		Scanner scanner = new Scanner(System.in); // 스캐너를 사용할 수 있게 생성. import 해줌
		System.out.print("온도를 입력해 주세요 : ");
		double c = scanner.nextDouble(); // 스캐너 객체의 nextInt() 메소드로 정수 값을 입력

		double f = (c * 9 / 5) + 32;

		System.out.println("섭씨 " + c + "는 화씨 " + f + "이다.");
	}

}
