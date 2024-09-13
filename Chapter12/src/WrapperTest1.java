
public class WrapperTest1 {

	public static void main(String[] args) {
		int num1 = 20;
		Integer num2 = 30; // 자동호환 autoboxing
		double div = num1 / num2.doubleValue();
		
		System.out.println(div);
		// Integer(int) 생성자는 정수 값을 인수로 받아 Integer 객체로 생성한다.

	}

}
