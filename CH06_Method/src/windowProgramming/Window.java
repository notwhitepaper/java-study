package windowProgramming;

public class Window {

	private int width;
	private int height;
	private boolean isVisible;
	private int top;
	private int left;

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public boolean getIsVisible() {
		return isVisible;
	}

}
