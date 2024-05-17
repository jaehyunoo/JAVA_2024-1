/*
 *  사용자로부터 값을 입력받아 그 입력 값의 개수에 따라 도형의 넓이, 부피를 구하는 프로그램
 *  입력 값이 한 개이면 원의 넓이, 입력 값이 두 개이면 사각형의 넓이,
 *  입력 값이 세 개이면 육면체 부피를 계산합니다.
 *  넓이, 부피 계산하는 부분은 메소드 오버로딩으로 작성하시오.
 *  사용자가 엔터키를 누르면 입력을 종료하고,
 *  종료 전에 입력한 숫자의 개수에 따라 도형의 결과 값을 출력합니다.
 */
import java.util.Scanner;

class Cal {
	
	
	
	public void volume(int w) {
		System.out.println("원의 넓이는 : " + w * w * 3.14);
	}
	
	
	public void volume(int w, int h) {
		System.out.println("사각형의 넓이는 : " + w * h);
	}
	
	public void volume(int w, int h, int d) {
		System.out.println("정육면체의 넓이는 : " + w * h * d);
	}
	
}
	

public class OverloadTest1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// 사용자로부터 한 줄을 입력받고(trim() 메서드를 사용하여 양쪽 공백을 제거한 후)
			// input 변수에 저장합니다.
			// trim 메서드를 사용하는 이유는 사용자가 입력할 때
			// 공백을 추가로 입력하는 경우를 방지하기 위함입니다.
			// 사용자가 엔터키를 눌러 입력을 종료하면 이 입력은 빈 문자열("")이 됩니다.
			System.out.print("값의 개수를 입력하시오 : ");
			String input = scanner.nextLine().trim();
			
			if (input.isEmpty()) {
				System.out.println("프로그램 종료 !");
				break; // 엔터키가 눌렀을때 종료
			}
			
			// 입력된 문자열을 공백을 기준으로 분할하여 문자열 배열에 저장합니다.
			// "\\s+"는 정규 표현식으로, 하나 이상의 공백을 나타냅니다.
			// 따라서 입력된 문자열이 여러 개의 공백으로 구분되어 있어도 정확히 분할됩니다.
			String[] shape_len = input.split("\\s+");
			Cal cal = new Cal();
			
			if (shape_len.length == 1) {
				
				int w = Integer.parseInt(shape_len[0]);
				cal.volume(w);
			}
			else if (shape_len.length == 2) {
				int w = Integer.parseInt(shape_len[0]);
				int h = Integer.parseInt(shape_len[1]);
				cal.volume(w,h);
				
			}
			else if (shape_len.length == 3) {
				int w = Integer.parseInt(shape_len[0]);
				int h = Integer.parseInt(shape_len[1]);
				int d = Integer.parseInt(shape_len[2]);
				cal.volume(w,h,d);
			}
			
			else {
				System.out.println("1 ~ 3개의 숫자의 값만 입력해주십시오");
			}
		}

	}

}
