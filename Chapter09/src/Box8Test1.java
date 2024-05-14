/*
 * 작성일 : 2024년 5월 14일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :
 * 
 * 문제분석 : 
 * 
 * 알고리즘 : 
 *			
 */
class Box8 {
	int width; // 접근 한정자가 없는 객체 변수
	int height; // 속성
	int depth;  // 전역변수
	
	public Box8(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	int volume()
	{
		int vol = width * height * depth; // 지역변수
		return vol;
	}
}
public class Box8Test1 {
	public static void main(String[] args) {
		// 객체 생성과 동시에 생성자 호출
		Box8 mybox1 = new Box8(10,20,30);
		// width에 접근 한정자가 없어서 값 변경이 가능.
		mybox1.width = 20;
		
		// 객체 이름으로 메소드 호출.
		int vol1 = mybox1.volume();
		System.out.println("정수 박스의 부피 : " + vol1);

	}

}
