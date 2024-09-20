/*
 * 파일 입출력에 대해 예외처리를 던지는 방법.
 * 정확한 예외 처리는 불가능.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest07 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileReader file = new FileReader("a.txt");
		
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}

}
