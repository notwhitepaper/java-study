package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 패스워드 입력받아서 do while문으로 맞는지 검사
		Scanner scanner = new Scanner(System.in);

		final String USER_PASSWORD = "hello";
		
		String password = "";
		
		do {
			System.out.print("비밀번호 입력 : ");
			password = scanner.nextLine();
			
			
		} while(!password.equals(USER_PASSWORD)); // !는 반대 

		scanner.close();
		System.out.println("접속 승인. ");
		
	}

}
