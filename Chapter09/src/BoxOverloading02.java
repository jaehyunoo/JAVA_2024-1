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

class Box6 {
	int width; // 멤버 변수 - 객체 변수
	int height; // 클래스 전역에서 사용 가능
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	
	
	public Box6(int w, int h, int d) 
	{
		width = w;	// 매개 변수(갈색) 값을 객체 변수(파란색)에 저장
		height = h;
		depth = d;
	}
	
	
	public Box6(double w, double h, double d) 
	{
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}
public class BoxOverloading02 {

	public static void main(String[] args) {
		// 정수형 매개변수가 3개인 생성자 호출
		Box6 mybox1 = new Box6(10,20,30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(정수 매개 변수) : " + vol);
		
		// 실수형 매개변수가 3개인 생성자 호출
		mybox1 = new Box6(10.5,20.5,30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
		
		// 정수형 , 실수형 매개변수가 3개인 생성자 호출 => 없다
		// 혼합되어 있는 경우 자동으로 확대형으로 변환되어 수행
		mybox1 = new Box6(10,20,30.5);
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(정수 매개 변수) : " + dvol);
	}

}
