package chapter06_Method_20250723;

public class Chapter06_03_20250722_Car {
	
	//필드
	Chapter06_03_20250722_Engine engine;
	int maxspeed;
	String name;
	
	
	// 기본 생성자
	public Chapter06_03_20250722_Car() {


	}

	public Chapter06_03_20250722_Car(Chapter06_03_20250722_Engine engine, int maxspeed, String name) {
		super();
		this.engine = engine;
		this.maxspeed = maxspeed;
		this.name = name;
	}


	//매소드
	public void carEngine() {
		System.out.println("엔진 타입 : " + engine.type);
		engine.printEngine();
	}
	
	// cars를 return하는데 cars의 타입이 무엇인가? String[]. 그래서 public String[] 인거다.
	public String[] outputCats(){
		String[] cars = {"소나타", "아반테", "k5"};
		return cars;
	}
	
	// engine를 return하는데 engine의 타입이 무엇인가? Chapter06_03_20250722_Engine. 
	// 그래서 Chapter06_03_20250722_Engine 인거다.
	// return하는 타입이 뭔지 잘 봐라.
	public Chapter06_03_20250722_Engine outputEngine() {
		engine.type = "디젤";
		engine.displacement = 2;	
		return engine;
	}
}
