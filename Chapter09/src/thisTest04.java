/*
 * 작성일 : 2024년 5월 10일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :
 * 
 * 문제분석 : 
 * 
 * 알고리즘 : 
 *			
 */
class Box4 {
	int width, height, depth; // 객체변수
	
	// 생성자
	public Box4() {
		// 다른생성자 호출한다.
		// 반드시 첫번째 라인에 위치해야한다.
		
		this(1,1,1); // => 다른 생성자 호출 밑에 정수형 매개변수가 3개인 생성자를 호출
		System.out.println("매개 변수없는 생성자 수행");
	}
	
	// 생성자 오버로딩
	public Box4(int width, int height, int depth) {
		System.out.println("매개 변수 3개 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class thisTest04 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수 없음) : " + vol);
		
		mybox1 = new Box4(10,20,30);
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개변수 3개) : " + vol);
		
	}

}
