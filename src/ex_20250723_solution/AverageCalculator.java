package ex_20250723_solution;

public class AverageCalculator {

//	3. 정수형 배열을 입력하면 배열의 모든 요소의 평균을 출력하는 getAverage 메서드를 가지고 있는 
//	AverageCalculator 클래스를 만드시오.
	
	public void getAverage(int[] intArr) {
		int sum=0;
		for (int num : intArr) {
			sum += num;
		}
		double avgArr = (double) sum / intArr.length ;
		
		System.out.println(avgArr);
	}
	
}
