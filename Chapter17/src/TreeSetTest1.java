import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		// TreeSet 객체 생성
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		TreeSet<Integer> num2 = new TreeSet<Integer>();
		
		// LinkedList 객체 생성
		LinkedList<Integer> num3 = new LinkedList<Integer>();
		LinkedList<Integer> num4 = new LinkedList<Integer>();
		
		System.out.println("---------TreeSet---------");
		for(int i = 4; i >= 0; i--) {
			num1.add(i);	// 4 3 2 1 0
			num2.add(i*2);	// 8 6 4 2 0
		}
		
		// 셋은 순서에 상관없이 항상 정렬되어 출력된다.
		System.out.println("num1 집합의 내용 : " + num1);
		System.out.println("num2 집합의 내용 : " + num2);
		
		// TreeSet 객체 생성
		TreeSet<Integer> union = new TreeSet<Integer>(num1);
		TreeSet<Integer> intersection = new TreeSet<Integer>(num1);
		TreeSet<Integer> difference = new TreeSet<Integer>(num1);
		
		union.addAll(num2); // num1과 num2의 합집합 => 중복을 허용하지 않는다.
		intersection.retainAll(num2); // 교집합
		difference.removeAll(num2); // 차집합
		
		System.out.println("num1과 num2의 합집합 : " + union);
		System.out.println("num1과 num2의 교집합 : " + intersection);
		System.out.println("num1과 num2의 차집합 : " + difference);
		
		System.out.println("------------LinkedList--------------");
		for(int i= 4; i>= 0; i--) {
			num3.add(i);
			num4.add(i*2);
		}
		// LinkedList 생성된 그대로 출력된다 ( 정렬이 되지 않는다 )
		System.out.println("num3 집합의 내용 : " + num3);
		System.out.println("num4 집합의 내용 : " + num4);
		
		LinkedList<Integer> union2 = new LinkedList<Integer>(num3);
		LinkedList<Integer> intersection2 = new LinkedList<Integer>(num3);
		LinkedList<Integer> difference2 = new LinkedList<Integer>(num3);
		
		union2.addAll(num4); // num3과 num4의 합집합 => 중복을 허용한다.
		intersection2.retainAll(num4); // 교집합
		difference2.removeAll(num4); // 차집합
		
		System.out.println("num3과 num4의 합집합 : " + union2);
		System.out.println("num3과 num4의 교집합 : " + intersection2);
		System.out.println("num3과 num4의 차집합 : " + difference2);
	}

}
