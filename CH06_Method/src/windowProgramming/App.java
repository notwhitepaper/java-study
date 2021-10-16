package windowProgramming;

public class App {

	public static void main(String[] args) {
		
		Window win= new Window();
		win.setWidth(400);
		win.setIsVisible(true);
		
		System.out.println(win.getWidth());
		System.out.println(win.getIsVisible());
	}

}
