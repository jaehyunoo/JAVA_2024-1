/*
 * 파일 입출력에 대해 예외처리를 던지는 방법.
 * 정확한 예외 처리는 불가능.
 */
import java.io.FileReader;

public class ExceptionTest06 {

	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("a.txt");
		
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}
