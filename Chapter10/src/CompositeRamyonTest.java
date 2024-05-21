/*
 * 작성일 : 2024년 5월 21일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :
 * 
 * 문제분석 : 
 * 
 * 알고리즘 : 
 *			
 */
import java.util.Scanner;
class Ramyon {
	String ramyon = "라면";
	String water = "물";
	String onion = "파";
	
	public void boilwater() {
		System.out.println(water + "을 끓인다.");
	}
	void cooking() {
		System.out.println(ramyon + "과 " + onion + "를 넣고 끓여 요리완성. 맛있게 드세요 !!");
	}
}

class RiceRamyon extends Ramyon {
	String topp = "떡";
	void topping() {
		System.out.println(topp + "을 넣는다.");
	}
}

class CheeseRamyon extends Ramyon {
	String topp = "치즈";
	void topping() {
		System.out.println(topp + "을 넣는다.");
	}
}

public class CompositeRamyonTest {

	public static void main(String[] args) {
		int s;
		do {
			System.out.print("만들고 싶은 요리를 입력하세요(1:일반라면,2:떡라면,3:치즈라면,99:종료 : ");
			Scanner stdIn = new Scanner(System.in);
			s = stdIn.nextInt();
			if (s == 1) {
				Ramyon r = new Ramyon();
				r.boilwater();
				r.cooking();
			}
			else if (s == 2) {
				RiceRamyon rr = new RiceRamyon();
				rr.boilwater();
				rr.topping();
				rr.cooking();
			}
			if (s == 3) {
				CheeseRamyon cr = new CheeseRamyon();
				cr.boilwater();
				cr.topping();
				cr.cooking();
			}
		}while ( s != 99);
		System.out.print("감사합니다.");

	}

}
