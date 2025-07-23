package chapter06_20250722;

public class Chapter06_04_20250722_RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter06_04_20250722_Rectangle rec1 = new Chapter06_04_20250722_Rectangle(20, 10, "blue");
		Chapter06_04_20250722_Rectangle rec2 = new Chapter06_04_20250722_Rectangle(100, 200); // 100,200,null
		Chapter06_04_20250722_Rectangle rec3 = new Chapter06_04_20250722_Rectangle(); // 0,0,null
		
		int area1 = rec1.rectArea();
		int area2 = rec1.rectArea(200);
		int area3 = rec1.rectArea(30, 40);
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		
		System.out.println("================================================================================");
		
		rec3.width = 60;
		rec3.height = 50;
		
		int area4 = rec3.rectArea();
		int area5 = rec3.rectArea(70);
		int area6 = rec3.rectArea(80, 90);
		
		System.out.println(area4);
		System.out.println(area5);
		System.out.println(area6);
	}

}
