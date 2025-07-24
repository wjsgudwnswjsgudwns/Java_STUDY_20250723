package ex_20250723_solution;

public class Book {
	
//	1. 책의 이름과 가격을 필드로 가지는 Book 클래스를 만드시오. 
//	단 생성자에서 두 필드를 초기화 하도록 만들고, 책의 이름과 가격을 출력하는 printInfo 메서드를 포함하시오.
	
	// 필드
	String bookName;
	int bookPrice;
	
	// 생성자
	public Book(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// 메소드
	public void printinfo() {
		System.out.println("책 이름 : " + bookName);
		System.out.println("가격 : " + bookPrice + "원");
	}

	

	
}