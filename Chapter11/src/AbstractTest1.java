abstract class Shape{
	
	abstract void draw();
	
	abstract void computeArea(double a, double b);
}

class Rectangle1 extends Shape {
	
	void draw() {
		System.out.println("사각형을 그리는 기능");
		}
	void computeArea(double h, double v) {
		System.out.println("사각형의 넓이 : " + (h * v));
	}
}
public class AbstractTest1 {

	public static void main(String[] args) {
		
		//상위 클래스 형으로 s 객체 변수 만들어 하위 클래스(Rectangle1())
		Shape s = new Rectangle1();
		s.draw(); // 사각형을 그리는 기능 출력.
		s.computeArea(3.0, 2.5);

	}

}

