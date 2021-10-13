package application;

import java.util.Scanner;

public class If_example {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("사과의 개수는? ");
		int apples = scanner.nextInt();
		System.out.print("바나의 개수는? ");
		int bananas =scanner.nextInt();

		if (apples > bananas) {
			System.out.println("사과가 바나나보다 많음 ");
		}else if(bananas>apples) {
			System.out.println("바나나가 사과보다 많음 ");
		}
		System.out.println("프로그램 종료. ");

	}

}
