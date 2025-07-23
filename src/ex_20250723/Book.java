package ex_20250723;

public class Book {
	
	//필드
	String name;
	int price;
	
	//생성자
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Book() {
		
	}
	
	
	public void printinfo() {
		System.out.println("책 이름 : " + name + " 가격 : " + price);
	}

	
}
