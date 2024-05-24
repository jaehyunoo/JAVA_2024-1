/*
 * 작성일 : 2024년 5월 24일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :  예약어 super1
 */
class ST1a {
	public int x = 500;
	public int y = 1000;
}

class ST1b extends ST1a {
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x; // 상위 클래스의 멤버변수 x에 접근
	public String yy = y + " " + super.y; // 상위 클래스의 멤버변수 y에 접근
								// y == super.y
	
	// x, xx, yy, 상속받은 y, 상위 클래스 x는 없다.
	// 상위 클래스 x는 없다. 그래서 super를 사용해서 상위 클래스 x에 접근해야한다.
}
public class SuperTest1 {

	public static void main(String[] args) {
		ST1b stb = new ST1b();
		System.out.println("객체 stb에 들어 있는 x,y 값 : " + stb.x + " " + stb.y);
		System.out.println("객체 stb에 들어 있는 xx 값 : " + stb.xx);
		System.out.println("객체 stb에 들어 있는 yy 값 : " + stb.yy);
		

	}

}
