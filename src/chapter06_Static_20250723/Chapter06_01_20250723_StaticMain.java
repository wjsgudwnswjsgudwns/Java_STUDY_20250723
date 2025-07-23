package chapter06_Static_20250723;

public class Chapter06_01_20250723_StaticMain {

	public static void main(String[] args) {
		
		Chapter06_01_20250723_Static st1 = new Chapter06_01_20250723_Static(); // st1(객체) 인스턴스 생성
		
		st1.width = 10;
		st1.height = 20;
		st1.color = "red";
		
		
		Chapter06_01_20250723_Static st2 = new Chapter06_01_20250723_Static(); // st2(객체) 인스턴스 생성
		
		st2.width = 50;
		st2.height = 60;
		st2.color = "blue";
//		st2.PI = 3.141592; // static final로 선언해서 PI 값 변경 불가. 
		
		
	}

}
