import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest1 {

	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		
		String source = "비어 있어야 비로소 가득해지는 사랑\n" + 
						" 영원히 사랑한다는 것은\n" + 
						" 평온한 마음으로 아침을 맞는다는 것입니다.\n";
		
		System.out.print("저장할 파일명을 입력 하세요 : ");
		String s = stdIn.next();
		
		// 저장한 파일 명으로 객체 생성.
		FileWriter fw = new FileWriter(s); // 파일에 문자 출력.
		
		fw.write(source);
		
		fw.close(); //스트림 닫기.
		
		System.out.println(s + "파일이 생성되었습니다.");
	}

}
