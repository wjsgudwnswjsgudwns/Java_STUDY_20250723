package chapter06_Method_20250723;

public class Chapter06_03_20250722_CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter06_03_20250722_Engine engine = new Chapter06_03_20250722_Engine("가솔린", 0);
		
		Chapter06_03_20250722_Car car = new Chapter06_03_20250722_Car(engine, 200, "소나타");
		
//		engine.printEngine();
		car.carEngine();
		
	}
}
