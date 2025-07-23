package chapter06_Method_20250723;

public class Chapter06_02_20250722_Calculate2 {
	
	public int sum(int num1, int num2) {
		return num1 + num2; 
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2; 
	}
	
	public int times(int num1, int num2) {
		return num1 * num2; 
	}
	
	public double divide(int num1, int num2) {
		return num1 / (double) num2; 
	}
	
	public int total(int[] numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
	
	public int total2(int... numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
	

}
