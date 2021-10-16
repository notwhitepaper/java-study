package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);

	public void run() {

		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while (running);
	}

	private void displayWord() {
		// 랜덤 단어 출력
		System.out.println(word.toString());
	}

	private void getUserInput() {
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));

	}

	private void checkUserInput() {
		System.out.println("체크");
	}
	
	public void close() {
		scanner.close();
	}
}
