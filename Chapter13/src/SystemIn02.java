import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemIn02 {

	public static void main(String[] args) {
		try {
			System.out.print("데이터 입력 : ");
			InputStream is = System.in; // byte 차입을 처리.
			// 한글 처리를 위해 문자기반 스트림 사용.
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String data = br.readLine(); // 값 읽어오기
			
			System.out.println("입력한 데이터 : " + data);
			
			is.close(); // 입력 스트립 닫기
			
		}catch (IOException e) {
			System.out.println("입력한 데이터가 없습니다.");
		}
	}
	
}
