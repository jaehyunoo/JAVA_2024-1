import java.util.Scanner;
import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		// 키보드로부터 4개의 과일 이름을 입력받아 stack에 저장
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("과일 이름을 입력하시오 : ");
			String fruits = stdIn.next();
			stack.push(fruits);
		}
		
		System.out.println("과일 리스트<스택> : " + stack);
		
		// 스택에서 과일 찾기
		System.out.print("찾고 싶은 과일 이름 입력 : ");
		String f_name = stdIn.next();
		int fruit = stack.search(f_name);
		
		if(fruit != -1) {
			System.out.println("스택에서 " + f_name + "위치는 " + fruit + "번째 입니다.");
		}
		else {
			System.out.println("스택에는 " + f_name + "가 없습니다");
		}
		
		System.out.println("과일 리스트 삭제<스택>");
		while(!stack.empty()) {
			String name = stack.pop(); // 삭제
			System.out.println("스택에서 삭제 : " + name);
			System.out.println("실시간 스택 현황 : " + stack);
		}
	}

}
