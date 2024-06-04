/*
 * 작성일 : 2024년 6월 4일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 
 * 문제 :
 * Rectangle 클래스를 작성하고 이를 상속받는 Square 클래스를 작성하세요.
 * Rectangle 클래스에는 double width와 double height 속성을 추가하고,
 * 이를 설정하는 생성자를 작성합니다.
 * Square 클래스는 Rectangle 클래스를 상속받고, 변의 길이를 설정하는 생성자를 작성합니다.
 * Square 클래스에 면적과 둘레를 계산하는 메소드를 추가합니다.
 * 
 * 사용자로부터 정사각형의 변의 길이를 입력받아, 해당 정사각형의 정보를 출력하는 프로그램을 작성하시오.
 * 
 * 
 */
import java.util.Scanner;

class Rectangle{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public void Cal2() {
		System.out.println("직사각형의 넓이 : " + width * height);
		System.out.println("직사각형의 둘레 : " + ((width * 2) + (height * 2)));
	}
}

class Square extends Rectangle{
	
	public Square(double byun) {
		super(byun,byun);
	}
	
	@Override
	public void Cal2() {
		System.out.println("정사각형의 넓이 : " + width * height);
		System.out.println("정사각형의 둘레 : " + ((width * 2) + (height * 2)));
	}
	
}
public class SquareTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("직사각형의 밑변입력 : ");
		double num1 = stdIn.nextDouble();
		System.out.print("직사각형의 높이입력 : ");
		double num2 = stdIn.nextDouble();
		
		Rectangle r1 = new Rectangle(num1,num2);
		
		System.out.print("정사각형의 한 변입력 : ");
		double num3 = stdIn.nextDouble();
		
		Square s1 = new Square(num3);
		
		r1.Cal2();
		s1.Cal2();

	}

}
