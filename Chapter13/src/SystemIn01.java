import java.io.IOException;
import java.io.InputStream;

public class SystemIn01 {

	public static void main(String[] args) {
		try {
			System.out.print("데이터 입력 : ");
			InputStream is = System.in; // byte 차입을 처리.
			
			int data = is.read(); // 값 읽어오기
			// 1byte값만 읽는다.
			// 따라서 한글은 제대로 출력되지 않는다.(깨진다)
			System.out.println("입력한 데이터 : " + (char)data);
			
			is.close(); // 입력 스트립 닫기
			
		}catch (IOException e) {
			System.out.println("입력한 데이터가 없습니다.");
		}
	}
	
}
