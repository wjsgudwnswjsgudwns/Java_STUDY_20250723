package chapter06_Method_20250723;

public class Chapter06_03_20250722_Engine {

	String type;
	int displacement; // 배기량
	
	public Chapter06_03_20250722_Engine() {

	}
	
	public Chapter06_03_20250722_Engine(String type, int displacement) {
		this.type = type;
		this.displacement = displacement;
	}
	
	public void printEngine() {
		System.out.println("엔진 타입 : " + type);
	}
}
