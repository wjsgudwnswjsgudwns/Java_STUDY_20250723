package chapter06_Method_20250723;

public class Chapter06_02_20250722_Calculate {
	
	int a;
	int b;

	public Chapter06_02_20250722_Calculate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Chapter06_02_20250722_Calculate(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void sum() {
		System.out.println ("두 수의 합 : " + (a+b));
	}
	public void minus() {
		System.out.println ("두 수의 차 : " + (a-b));
	}
	public void times() {
		System.out.println ("두 수의 곱 : " + (a*b));
	}
	public void divid() {
		System.out.println ("두 수의 나눗셈 : " + (a/(double)b));
	}
	
	public void squar() {
		System.out.println ("a 제곱 : " + (a*a));
		System.out.println ("b 제곱 : " + (b*b));
	}
}
