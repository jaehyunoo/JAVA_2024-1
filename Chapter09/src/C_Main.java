
public class C_Main {
	int count = 10; // 객체 변수
	static int num = 20; // 클래스 변수
	
	// 메소드 선언
	public int sum(int x, int y) {
		return x + y;
	}
	
	// 클래스 메소드 선언
	static int mul(int x, int y) {
		return x * y;
	}
	
	// 메인 메소드 - 클래스 메소드.
	public static void main(String[] args) {
		int same; // 메인 메소드에서 선언한 지역 변수.
		
		// 반드시 클래스 변수, 지역 변수만 사용 가능하다.
		// same = count; // 클래스메소드에선 클래스 변수만 들어올 수 있기때문에 멤버변수 count는 오류발생
		
		same = num;
		System.out.println("num = " + same);
		
		//same = sum(5,5); // sum은 클래스 메소드가 아니기 때문에 오류발생
		same = mul(5,5);
		System.out.println("mul result : " + same);

	}

}
