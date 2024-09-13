
public class StringBufferTest1 {

	public static void main(String[] args) {
		// StringBuffer 문자열의 길이가 변할 수 있음
		
		StringBuffer sb1 = new StringBuffer("Hello JAVA");
		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");
		
		System.out.println("sb1 내용 : " + sb1);
		System.out.println("sb2 내용 : " + sb2);
		
		System.out.println("문자열 끼워넣기 : " + sb2.insert(8,"Power "));
		
		sb2.setCharAt(5,'되'); // 문자열 해당인덱스 문자 바꾸기
		System.out.println("문자 바꾸기 : " + sb2);
		
		sb2.setLength(5); // 문자열길이 잘라내기
		System.out.println("sb2 내용 : " + sb2); // 길이를 5까지 잘라낸것을 출력
		
		
	}

}
