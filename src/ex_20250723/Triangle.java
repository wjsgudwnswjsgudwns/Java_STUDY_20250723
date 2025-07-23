package ex_20250723;

public class Triangle {
	
	
	public boolean isValid(int a, int b, int c) {
		if(a+b > c && b+c > a && c+a > b) {
			return true;
		}  else {
			return false;
		}
		
	}
}
