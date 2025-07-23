package chapter06_20250722;

public class Chapter06_02_20250722_CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter06_02_20250722_Calculate calculate = new Chapter06_02_20250722_Calculate(3, 10);
		
		calculate.sum();
		calculate.minus();
		calculate.times();
		calculate.divid();
		calculate.squar();
		
		Chapter06_02_20250722_Calculate2 calculate2 = new Chapter06_02_20250722_Calculate2();
		
		int sum = calculate2.sum(1, 2);
		System.out.println(sum);
		
		int minus = calculate2.minus(1, 2);
		System.out.println(minus);
		
		int times = calculate2.times(1, 2);
		System.out.println(times);
		
		double divide = calculate2.divide(1, 2);
		System.out.println(divide);
		
		int total = calculate2.total(new int[] {10,20,30}); // 배열
		System.out.println(total);
		
		int[] arr1 = {10,20,30};
		calculate2.total(arr1);
		System.out.println(calculate2.total(arr1));
		
		calculate2.total2(10,20,30);
		System.out.println(calculate2.total2(10,20,30));
	}

}
