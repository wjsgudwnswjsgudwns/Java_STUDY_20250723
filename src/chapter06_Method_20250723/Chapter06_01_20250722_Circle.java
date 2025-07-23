package chapter06_Method_20250723;

public class Chapter06_01_20250722_Circle {
	
	//필드
	int radius; // 반지름
	double PI = 3.14; // 파이 값
	
	//생성자
	public Chapter06_01_20250722_Circle() {
	}


	public Chapter06_01_20250722_Circle(int radius) {
		this.radius = radius;
	}	
	
	// 입력된 반지름을 가진 원의 면적을 반환하는 메소드
	public double circleArea() {
		return radius * radius * PI;
	}
}
