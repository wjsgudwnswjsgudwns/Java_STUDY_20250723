package quiz_06;

public class MemberService {

	// 필드
	String id; // 아이디
	int password; // 패스워드
	
	//기본생성자
	public MemberService() {
	
	}
	
	public MemberService(String id, int password) {
		this.id = id;
		this.password = password;
	}
	
	// 매소드
	
	public boolean login(String id, int password) {
		if (id.equals("hong") && password==12345) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
