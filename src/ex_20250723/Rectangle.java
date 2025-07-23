package ex_20250723;

public class Rectangle {
	
	double width;
	double height;

	// 생성자
	
	public Rectangle() {
	
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double round() {
		return width * 2 + height * 2; 
	}
	
}
