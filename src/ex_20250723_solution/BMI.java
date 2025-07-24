package ex_20250723_solution;

public class BMI {
	
//	4. BMI 계산기 클래스를 만들려고 한다. 
//	BMI의 계산식은 BMI = weight / (height²) 이다. 
//	키와 몸무게를 넣으면 BMI를 출력하는 bmiCalulator 메서드를 가지고 있는 BMI 계산기 클래스를 만드시오.
	
	public void bmiCalulator(int weight, int height) {
		double bmi = (double) weight / (height * height);
		System.out.println("BMI : " + bmi);
	}
	
	public void bmiCalulator(double weight, double height) {
		double bmi = weight / (height * height);
		System.out.println("BMI : " + bmi);
	}
}
