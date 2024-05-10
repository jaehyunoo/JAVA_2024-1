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
class Box2{
	int width,height,depth; // 멤버 변수
	
	// 생성자.
	// 매개변수의 의미가 명확해 졌다.
	public Box2(int width, int heigth, int depth) {
		width = width;
		this.height = height;
		this.depth = depth;
	}
}

public class thisTest02 {

	public static void main(String[] args) {
		Box2 mybox = new Box2(1,2,3);
		System.out.println(mybox.width);
	}

}
