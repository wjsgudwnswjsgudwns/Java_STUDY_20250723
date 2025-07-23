package chapter06_20250722;

public class Chapter06_03_20250722_Car {
	
	Chapter06_03_20250722_Engine engine;
	int maxspeed;
	String name;
	
	


	public Chapter06_03_20250722_Car(Chapter06_03_20250722_Engine engine, int maxspeed, String name) {
		super();
		this.engine = engine;
		this.maxspeed = maxspeed;
		this.name = name;
	}


	public Chapter06_03_20250722_Car() {


	}


	public void carEngine() {
		System.out.println("엔진 타입 : " + engine.type);
		engine.printEngine();
	}
}
