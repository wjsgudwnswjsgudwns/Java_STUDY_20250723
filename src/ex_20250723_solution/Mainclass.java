package ex_20250723_solution;

public class Mainclass {

	public static void main(String[] args) {
		// 메인 메소드는 메모리에 없으니까 this. 를 쓸수 없다.
		// 실물이 없다.
		
		// 1번
		
		Book book = new Book("쥬라기 공원", 20000);
		book.printinfo();
		
		System.out.println("====================================================");
		
		// 2번
		
		StringTool stringTool = new StringTool();
		stringTool.printLength("Korea");
		
		System.out.println("====================================================");
		
		// 3번
		
		AverageCalculator avCalculator = new AverageCalculator();
		int[] scores= {10,20,30,40,50};
		avCalculator.getAverage(scores);
		
		System.out.println("====================================================");
		
		// 4번
		
		BMI bmi = new BMI();
		bmi.bmiCalulator(70.0, 1.80);
		
		System.out.println("====================================================");
		
		// 5번
		
		Rectangle rectangle = new Rectangle(10.5, 20.4);
		rectangle.recRound();
		
		System.out.println("====================================================");
		
		// 6번
		
		Triangle triangle = new Triangle();
		System.out.println(triangle.isValid(10, 5, 8));
	}

}
