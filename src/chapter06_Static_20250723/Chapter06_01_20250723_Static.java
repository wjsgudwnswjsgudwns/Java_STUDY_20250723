package chapter06_Static_20250723;

public class Chapter06_01_20250723_Static {
	
	static final double PI = 3.14; // 정적 변수(static 멤버), 정적 변수 선언
	// main class에 객체가 10개 만들어지면 PI가 10개가 만들어짐.
	// 근데 어차피 평생 안 바뀔건데 PI가 10개나 만들어지면 메모리 낭비 아님?
	// 그래서 PI를 인스턴스 안에 말고 밖에 공유 공간에 넣어놓자.
	// 필요하면 꺼내가서 써. 그럼 메모리를 1개 밖에 안 쓰잖아.
	// 혹시 다른 놈이 PI값을 변경 할 수도 있으니까 static final로 선언하자.
	
	
	int width;
	int height;
	String color;
	
	
}
