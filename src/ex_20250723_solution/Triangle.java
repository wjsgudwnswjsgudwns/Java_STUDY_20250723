package ex_20250723_solution;

public class Triangle {
	
	public boolean isValid(int a, int b, int c) {
		boolean flag = a+b > c && b+c > a && c+a > b;
		return flag;
	}
}
