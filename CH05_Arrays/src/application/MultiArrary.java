package application;

public class MultiArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] texts = { { "하나 ", "둘 ", "셋 " }, { "넷 ", "다섯 ", "여섯 " }, { "일곱 ", "여덟 ", "아홉 " } };

		for (int i = 0; i < texts.length; i++) {
			//System.out.println(texts[i]);
			String[] innerArray = texts[i];

			for(int j=0; j < innerArray.length; j++) {
				System.out.printf("%s\t", innerArray[j]);
			}
			
			System.out.println();
		}
	}

}
