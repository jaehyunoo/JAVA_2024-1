/*
 * 파일 입출력에 대해 예외처리를 하지 않아 오류 발생.
 */
import java.io.FileReader;

public class ExceptionTest04 {

	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}
