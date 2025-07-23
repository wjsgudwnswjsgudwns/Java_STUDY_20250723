package ex_20250723;

public class Ex_03_20250723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AverageCalculator averageCalculator = new AverageCalculator();
		
		double avg = averageCalculator.total(new int[] {10,20,30,40,50});
		System.out.println("평균 : " + avg);
	}

}
