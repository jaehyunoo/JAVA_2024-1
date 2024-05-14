
public class C_Main2 {
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
		// 객체생성.
		C_Main2 cm= new C_Main2();
		
		int same; // 메인 메소드에서 선언한 지역 변수.
		
		// 클래스 변수가 아니지만, 객체를 통하여 접근 가능.
		same = cm.count; 
		System.out.println("count : " + same);
		
		// num은 클래스 변수. => 클래스 명으로 접근.
		same = cm.num; // 가능하지만 클래스 명으로 접근하는 것이 원칙이다.
		same = C_Main2.num;
		System.out.println("num = " + same);
		
		// 객체를 통해서 메소드 호출 가능.
		same = cm.sum(5,5);
		System.out.println("sum result : " + same);

		same = mul(5,5);
		System.out.println("mul result : " + same);

	}

}
