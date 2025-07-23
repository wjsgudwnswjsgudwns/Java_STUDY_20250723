package quiz_06;

public class MemberService {

	// 필드
	String id; // 아이디
	String password; // 패스워드
	
	//기본생성자
	public MemberService() {
	
	}
	
	public MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	// 매소드
	
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
