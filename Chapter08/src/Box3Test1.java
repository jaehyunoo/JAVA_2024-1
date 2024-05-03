/*
 * 작성일 : 2024년 5월 3일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 
 * 
 * 
 *			
 */

//클래스 선언
class Box3{
	int width, height, depth; // 멤버 변수 - 객체 변수
	long idNum; // 멤버 변수 - 객체변수
	static long boxID = 0; // 클래스 변수
	
	// 생성자는 객체가 생성될 때 자동으로 수행(호출)됨.
	public Box3() { // 생성자 메소드 - 클래스 명과 같은 메소드
		idNum = ++boxID ;
	}
}
public class Box3Test1 {

	public static void main(String[] args) {
		// 객체 생성. Box3에 생성자가 있기에 객체가 생성되면 생성자가 수행된다.
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();
												// 객체 명을 통해서 값 출력
		System.out.println("mybox1의 id 번호 : " + mybox1.idNum);//1
		System.out.println("mybox2의 id 번호 : " + mybox2.idNum);//2
		System.out.println("mybox3의 id 번호 : " + mybox3.idNum);//3
		
		System.out.println("mybox1의 id 번호 : " + mybox4.boxID);//4
												// boxID는 클래스 변수이다.
												// 오류는 아니지만 클래스 변수는 클래스 명으로 접근하라.
		
		// 클래스 명으로 boxID값 출력.
		// Box3.boxID
		// 클래스명을 통해서 클래스 변수 값을 출력하는 것이 원칙
		System.out.println("마지막 생성된 박스 번호는 " + Box3.boxID);

	}

}
