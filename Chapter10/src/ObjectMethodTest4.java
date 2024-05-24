
public class ObjectMethodTest4 {
	class Box11{
		int x;
		int y;
		int z;
		
		public Box11(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
			
		}
	}

	public static void main(String[] args) {
		
		Box11 b1 = new Box11(10,20,30);
		Box11 b2 = new Box11(10,20,30);
		Box11 b3 = b2; // 주소공유
		
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		System.out.println(s1.equals(s2) ? "s1과 s2는 같다" : "s1과 s2는 다르다");

	}

}
