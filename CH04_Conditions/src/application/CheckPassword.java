package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final String USER_PASSWORD = "hello";

		System.out.print("비밀번호 입력 : ");
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");
		}
		else {
			System.out.println("접속 불가.");
		}
	}

}
