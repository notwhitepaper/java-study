package application;

public class MultiArrary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] texts = { { "하나 ", "둘 ", "셋 " }, { "넷 ", "다섯 ", "여섯 " }, { "일곱 ", "여덟 ", "아홉 " } };

		for (int i = 0; i < texts.length; i++) {
		

			for(int j=0; j < texts[i].length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}
			
			System.out.println();
		}
	}

}
