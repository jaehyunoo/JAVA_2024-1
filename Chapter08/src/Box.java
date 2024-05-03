/*
 * 작성일 : 2024년 5월 3일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 
 * 
 * 
 *			
 */
class Box1{
	int width;
	int height;
	int depth;
}


public class Box {

	public static void main(String[] args) {
		
		Box1 myBox1 = new Box1();
		Box1 myBox2 = new Box1();
		int vol1, vol2;
		myBox1.width = 78;
		myBox1.height = 145;
		myBox1.depth = 87;
		
		myBox2.width = 48;
		myBox2.height = 45;
		myBox2.depth = 137;
		
		vol1 = myBox1.width * myBox1.depth * myBox1.height;
		System.out.println("첫 번째 박스의 부피는 " + vol1 +"입니다.");
		vol2 = myBox2.width * myBox2.depth * myBox2.height;
		System.out.println("첫 번째 박스의 부피는 " + vol2 +"입니다.");
	}

}
