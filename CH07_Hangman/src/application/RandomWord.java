package application;

import java.util.Random;

public class RandomWord {
	private String books = "classroom significance newspaper manufacturer grandmother membership community introduction entertainment environment reputation reception chocolate contribution measurement secretary painting requirement responsibility engineering management imagination reflection presentation replacement childhood reaction solution location property";
	private String[] words = books.split(" ");

	private String selectWord;
	private Random rand = new Random();
	private char[] characters;

	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)]; // 랜덤으로 단어 선택
		characters = new char[selectWord.length()]; // 문자 배열 공간 생성
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (char c : characters) {

			sb.append(c == '\u0000' ? "_" : c);
			sb.append(" ");

		}

		//System.out.println(selectWord);
		return sb.toString();
	}

	public void getWords() {
		for (String w : words) {
			System.out.println(w);
		}
	}

	public void addGuess(char c) {
		// 사용자가 입력한 한 문자를 선택된 단어에서 같은 문자가 있는 지 확인
		// 있으면 characters의 인덱스 위치에 입력 
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}

	}
}