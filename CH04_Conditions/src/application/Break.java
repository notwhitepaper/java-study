package application;

public class Break {

	public static void main(String[] args) {
		// 
		int count=0;
		
		while(true) {
			System.out.println("헬로우~ "+count);
			
			if(count==5) {
				break;
			}
			System.out.println("하와유?");
			
			count++;
		}
		System.out.println("종료 ");

	}

}
