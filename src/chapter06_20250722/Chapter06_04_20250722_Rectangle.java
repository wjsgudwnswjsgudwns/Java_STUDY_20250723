package chapter06_20250722;

public class Chapter06_04_20250722_Rectangle {
	int width;
	int height;
	String color;
	
	//생성자
	public Chapter06_04_20250722_Rectangle() {
	}
	//생성자 오버로딩
	public Chapter06_04_20250722_Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	//생성자 오버로딩
	public Chapter06_04_20250722_Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	// 매소드
	public int rectArea() {
		return width * height;
	}
	
	// 매소드 오버로딩
	public int rectArea(int width, int height) {
		return width * height;
	}
	
	// 매소드 오버로딩
	public int rectArea(int width) {
		return width * this.height;
	}
	
}
