import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		String day = "happy day, smile day, nice day, joyful day, ";
		
		// day안에 있는 값을 읽어오자
		Scanner stdIn = new Scanner(day);
		// 또 다른 분리자 day, 로 설정.
		stdIn.useDelimiter("day, ");
		
		// 다음 토큰이 있을 때까지 읽어서 출력
		while(stdIn.hasNext()) {
			System.out.println(stdIn.next());
		}
		

	}

}
