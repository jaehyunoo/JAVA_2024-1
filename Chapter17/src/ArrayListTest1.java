import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// 문자열 배열 생성
		String[] name = {"kim", "lee", "park", "jung", "oh" };
		
		// 문자열의 배열을 이용하여 리스트 객체(제네릭) 생성.
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("초기값 : " + lname);
		
		// 리스트 마지막에 추가.("ha")
		lname.add("ha");
		System.out.println("ha 추가 : " + lname);
		
		
		// 변경
		lname.set(0, "김"); // 0번지 값을 "김"으로 변경.
		System.out.println("0번지 김으로 변경 : " + lname);
		
		// 중간에(원하는 번지에)추가
		lname.add(3,"곽");
		System.out.println("3번지에 곽 추가 " + lname);
		
		// 무작위 재배열. - Collections 클래스 메소드 활용.
		Collections.shuffle(lname);
		System.out.println("무작위로 재배열한 후 : " + lname);
		
		// 정렬.
		Collections.sort(lname);
		System.out.println("오름차순 정렬한 후 : " + lname);
		
		// 원하는 값 출력 - 5번째 요소 출력
		System.out.println("5번째 요소 출력 : " + lname.get(4));
		
		// 리스트의 모든 요소를 "김"으로 채우기.
		Collections.fill(lname,"김");
		System.out.println("모든요소를 김으로 채운 후 : " + lname);
	}

}

